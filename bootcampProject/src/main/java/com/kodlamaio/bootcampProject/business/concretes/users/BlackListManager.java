package com.kodlamaio.bootcampProject.business.concretes.users;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.kodlamaio.bootcampProject.business.abstracts.ApplicantService;
import com.kodlamaio.bootcampProject.business.abstracts.BlackListService;
import com.kodlamaio.bootcampProject.business.constants.Messages;
import com.kodlamaio.bootcampProject.business.requests.blackList.AddBlackListRequest;
import com.kodlamaio.bootcampProject.business.requests.blackList.UpdateBlackListRequest;
import com.kodlamaio.bootcampProject.business.responses.blackList.AddBlackListResponse;
import com.kodlamaio.bootcampProject.business.responses.blackList.GetAllBlackListResponse;
import com.kodlamaio.bootcampProject.business.responses.blackList.GetBlackListResponse;
import com.kodlamaio.bootcampProject.business.responses.blackList.UpdateBlackListResponse;
import com.kodlamaio.bootcampProject.core.utilities.exceptions.BusinessException;
import com.kodlamaio.bootcampProject.core.utilities.mapping.ModelMapperService;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;
import com.kodlamaio.bootcampProject.core.utilities.results.SuccessDataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.SuccessResult;
import com.kodlamaio.bootcampProject.dataAccess.abstracts.BlackListRepository;
import com.kodlamaio.bootcampProject.entities.evaluations.BlackList;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BlackListManager implements BlackListService {

	private BlackListRepository blackListRepository;
	private ModelMapperService modelMapperService;
	private ApplicantService applicantService;

	@Override
	public DataResult<AddBlackListResponse> add(AddBlackListRequest addBlackListRequest) {
		checkIfApplicantById(addBlackListRequest.getApplicantId());
		checkApplicantAlreadyExistInBlackList(addBlackListRequest.getApplicantId());
		BlackList blackList = this.modelMapperService.forRequest().map(addBlackListRequest, BlackList.class);
		blackListRepository.save(blackList);
		AddBlackListResponse addBlackListResponse = this.modelMapperService.forResponse().map(blackList, AddBlackListResponse.class);
		return new SuccessDataResult<AddBlackListResponse>(addBlackListResponse,Messages.BlackListCreated);
	}

	@Override
	public DataResult<UpdateBlackListResponse> update(UpdateBlackListRequest updateBlackListRequest) {
		checkIfBlackListById(updateBlackListRequest.getId());
		BlackList blackList = this.modelMapperService.forRequest().map(updateBlackListRequest, BlackList.class);
		blackListRepository.save(blackList);
		UpdateBlackListResponse updateBlackListResponse = this.modelMapperService.forResponse().map(blackList, UpdateBlackListResponse.class);
		return new SuccessDataResult<UpdateBlackListResponse>(updateBlackListResponse,Messages.BlackListUpdated);
	}

	@Override
	public Result delete(int id) {
		checkIfBlackListById(id);
		this.blackListRepository.deleteById(id);
		return new SuccessResult(Messages.BlackListDeleted);
	}

	@Override
	public DataResult<List<GetAllBlackListResponse>> getAll() {
		List<BlackList> blackLists = blackListRepository.findAll();
		List<GetAllBlackListResponse> getAllBlackListResponses = blackLists.stream()
				.map(blackList-> this.modelMapperService.forResponse().map(blackLists, GetAllBlackListResponse.class))
				.collect(Collectors.toList());
		return new SuccessDataResult<List<GetAllBlackListResponse>>(getAllBlackListResponses);
	}

	@Override
	public DataResult<GetBlackListResponse> getById(int id) {
		checkIfBlackListById(id);
		BlackList blackList= this.blackListRepository.findById(id).get();
		GetBlackListResponse response = this.modelMapperService.forResponse().map(blackList, GetBlackListResponse.class);
		return new SuccessDataResult<GetBlackListResponse>(response);
	}
	
	@Override
	public DataResult<GetBlackListResponse> findByApplicantId(int id) {
		checkIfApplicantInBlacklist(id);
		BlackList blackList = this.blackListRepository.findByApplicantId(id);
		GetBlackListResponse response = this.modelMapperService.forResponse().map(blackList, GetBlackListResponse.class);
		return new SuccessDataResult<GetBlackListResponse>(response);
	}
	

	@Override
	public void checkApplicantAlreadyExistInBlackList(int id) {
		if(blackListRepository.findByApplicantId(id) != null) {
			throw new BusinessException(Messages.ApplicantIsExistInBlacklist);
		}
	}
	
	private void checkIfBlackListById(int id) {
		if(!this.blackListRepository.existsById(id)) {
			throw new BusinessException(Messages.BlackListIdNotExist);
		}
	}
	
	private void checkIfApplicantById(int id) {
		if(	this.applicantService.getById(id) == null) {
			throw new BusinessException(Messages.ApplicantIdNotExistInApplicants);
		}
	}
	
	private void checkIfApplicantInBlacklist(int id) {
		if(blackListRepository.findByApplicantId(id) == null) {
			throw new BusinessException(Messages.ApplicantIsNotExistInBlacklist);
		}
	}
}
