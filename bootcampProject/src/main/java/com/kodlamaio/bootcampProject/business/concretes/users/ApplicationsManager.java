package com.kodlamaio.bootcampProject.business.concretes.users;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.kodlamaio.bootcampProject.business.abstracts.ApplicantService;
import com.kodlamaio.bootcampProject.business.abstracts.ApplicationsService;
import com.kodlamaio.bootcampProject.business.abstracts.BlackListService;
import com.kodlamaio.bootcampProject.business.abstracts.BootcampsService;
import com.kodlamaio.bootcampProject.business.constants.Messages;
import com.kodlamaio.bootcampProject.business.requests.applications.AddApplicationsRequest;
import com.kodlamaio.bootcampProject.business.requests.applications.UpdateApplicationsRequest;
import com.kodlamaio.bootcampProject.business.responses.applications.AddApplicationsResponse;
import com.kodlamaio.bootcampProject.business.responses.applications.GetAllApplicationsResponse;
import com.kodlamaio.bootcampProject.business.responses.applications.GetApplicationsResponse;
import com.kodlamaio.bootcampProject.business.responses.applications.UpdateApplicationsResponse;
import com.kodlamaio.bootcampProject.core.utilities.exceptions.BusinessException;
import com.kodlamaio.bootcampProject.core.utilities.mapping.ModelMapperService;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;
import com.kodlamaio.bootcampProject.core.utilities.results.SuccessDataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.SuccessResult;
import com.kodlamaio.bootcampProject.dataAccess.abstracts.ApplicationsRepository;
import com.kodlamaio.bootcampProject.entities.applications.Applications;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ApplicationsManager implements ApplicationsService{
	
	private ApplicationsRepository applicationsRepository ;
	private ModelMapperService modelMapperService;
	private BootcampsService bootcampsService;
	private ApplicantService applicantService;
	private BlackListService blackListService;


	@Override
	public DataResult<AddApplicationsResponse> add(AddApplicationsRequest addApplicationsRequest) {
		checkIfApplicantIsSituations(addApplicationsRequest.getApplicationsStateId());
		checkIfBootcampActivated(addApplicationsRequest.getBootcampId());
		checkIfApplicantById(addApplicationsRequest.getApplicantsId());
		checkIfApplicantInBlacklistById(addApplicationsRequest.getApplicantsId());
		checkIfBootcampById(addApplicationsRequest.getBootcampId());
		Applications applications = modelMapperService.forRequest().map(addApplicationsRequest, Applications.class);
		this.applicationsRepository.save(applications);
		AddApplicationsResponse response = modelMapperService.forRequest().map(applications, AddApplicationsResponse.class);
		return new SuccessDataResult<AddApplicationsResponse>(response, Messages.ApplicationsCreated);
	}

	@Override
	public DataResult<UpdateApplicationsResponse> update(UpdateApplicationsRequest updateApplicationsRequest) {
		checkIfApplicationsById(updateApplicationsRequest.getId());
		checkIfApplicantById(updateApplicationsRequest.getApplicantsId());
		checkIfBootcampById(updateApplicationsRequest.getBootcampId());
		Applications applications = modelMapperService.forRequest().map(updateApplicationsRequest, Applications.class);
		this.applicationsRepository.save(applications);
		UpdateApplicationsResponse response = modelMapperService.forRequest().map(applications, UpdateApplicationsResponse.class);
		return new SuccessDataResult<UpdateApplicationsResponse>(response, Messages.ApplicationsUpdated);
	}

	@Override
	public Result delete(int id) {
		checkIfApplicationsById(id);
		this.applicationsRepository.deleteById(id);
		return new SuccessResult(Messages.ApplicantDeleted);
	}

	@Override
	public DataResult<List<GetAllApplicationsResponse>> getAll() {
		List<Applications> applications = this.applicationsRepository.findAll();
		List<GetAllApplicationsResponse> responses = applications.stream()
				.map(application->this.modelMapperService.forResponse().map(application, GetAllApplicationsResponse.class))
				.collect(Collectors.toList());
		return new SuccessDataResult<List<GetAllApplicationsResponse>>(responses);
	}

	@Override
	public DataResult<GetApplicationsResponse> getById(int id) {
		checkIfApplicationsById(id);
		Applications applications = this.applicationsRepository.findById(id).get();
		GetApplicationsResponse response = this.modelMapperService.forResponse().map(applications, GetApplicationsResponse.class);
		return new SuccessDataResult<GetApplicationsResponse>(response);
	}
	
	public void checkIfApplicantIsSituations(int id) {
		Applications applications = this.applicationsRepository.findById(id).get();	
		if(applications.getApplicationsState().getId() == 2 ) {
			throw new BusinessException(Messages.ApplicantStateRejected);
		}
	}
	
	private void checkIfBootcampActivated(int id) {
		bootcampsService.checkIfBootcampActivated(id);
	}
	
	private void checkIfApplicationsById(int id) {
		if(!this.applicationsRepository.existsById(id)) {
			throw new BusinessException(Messages.ApplicationsIdNotExist);
		}
	}
	
	private void checkIfBootcampById(int id) {
		bootcampsService.getById(id);
	}
	
	private void checkIfApplicantById(int id) {
		applicantService.getById(id);
	}
	
	private void checkIfApplicantInBlacklistById(int id) {
		this.blackListService.checkApplicantAlreadyExistInBlackList(id);
	}

}
