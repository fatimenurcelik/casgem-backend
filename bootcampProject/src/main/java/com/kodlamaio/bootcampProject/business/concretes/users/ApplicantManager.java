package com.kodlamaio.bootcampProject.business.concretes.users;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.kodlamaio.bootcampProject.business.abstracts.ApplicantService;
import com.kodlamaio.bootcampProject.business.constants.Messages;
import com.kodlamaio.bootcampProject.business.requests.applicants.AddApplicantRequest;
import com.kodlamaio.bootcampProject.business.requests.applicants.UpdateApplicantRequest;
import com.kodlamaio.bootcampProject.business.responses.applicants.AddApplicantResponse;
import com.kodlamaio.bootcampProject.business.responses.applicants.GetAllApplicantResponse;
import com.kodlamaio.bootcampProject.business.responses.applicants.GetApplicantResponse;
import com.kodlamaio.bootcampProject.business.responses.applicants.UpdateApplicantResponse;
import com.kodlamaio.bootcampProject.core.utilities.mapping.ModelMapperService;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;
import com.kodlamaio.bootcampProject.core.utilities.results.SuccessDataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.SuccessResult;
import com.kodlamaio.bootcampProject.dataAccess.abstracts.ApplicantRepository;
import com.kodlamaio.bootcampProject.entities.users.Applicant;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class ApplicantManager implements ApplicantService{
	
	private ApplicantRepository applicantRepository;
	private ModelMapperService modelMapperService;	
	
	@Override
	public DataResult<AddApplicantResponse> add(AddApplicantRequest addApplicantRequest) {
		Applicant applicant = this.modelMapperService.forRequest().map(addApplicantRequest, Applicant.class);
		applicantRepository.save(applicant);
		AddApplicantResponse addApplicantResponse = this.modelMapperService.forResponse().map(applicant, AddApplicantResponse.class);
		return new SuccessDataResult<AddApplicantResponse>(addApplicantResponse,Messages.ApplicantCreated);
	}

	@Override
	public DataResult<UpdateApplicantResponse> update(UpdateApplicantRequest updateApplicantRequest) {
		Applicant applicant = this.modelMapperService.forRequest().map(updateApplicantRequest, Applicant.class);
		applicantRepository.save(applicant);
		UpdateApplicantResponse updateApplicantResponse = this.modelMapperService.forResponse().map(applicant, UpdateApplicantResponse.class);
		return new SuccessDataResult<UpdateApplicantResponse>(updateApplicantResponse,Messages.ApplicantUpdated);
	}

	@Override
	public Result delete(int id) {
		this.applicantRepository.deleteById(id);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<GetAllApplicantResponse>> getAll() {
		List<Applicant> applicants = applicantRepository.findAll();
		List<GetAllApplicantResponse> getAllApplicantResponses = applicants.stream()
				.map(applicant-> this.modelMapperService.forResponse().map(applicant, GetAllApplicantResponse.class))
				.collect(Collectors.toList());
		return new SuccessDataResult<List<GetAllApplicantResponse>>(getAllApplicantResponses);
	}

	@Override
	public DataResult<GetApplicantResponse> getById(int id) {
		Applicant applicant = this.applicantRepository.findById(id).get();
		GetApplicantResponse response = this.modelMapperService.forResponse().map(applicant, GetApplicantResponse.class);
		return new SuccessDataResult<GetApplicantResponse>(response);
	}
}
