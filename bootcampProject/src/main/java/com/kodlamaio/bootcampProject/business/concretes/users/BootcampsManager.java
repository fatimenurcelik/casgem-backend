package com.kodlamaio.bootcampProject.business.concretes.users;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.kodlamaio.bootcampProject.business.abstracts.BootcampsService;
import com.kodlamaio.bootcampProject.business.abstracts.InstructorService;
import com.kodlamaio.bootcampProject.business.constants.Messages;
import com.kodlamaio.bootcampProject.business.requests.bootcamps.AddBootcampsRequest;
import com.kodlamaio.bootcampProject.business.requests.bootcamps.UpdateBootcampsRequest;
import com.kodlamaio.bootcampProject.business.responses.bootcamps.AddBootcampsResponse;
import com.kodlamaio.bootcampProject.business.responses.bootcamps.GetAllBootcampsResponse;
import com.kodlamaio.bootcampProject.business.responses.bootcamps.GetBootcampsResponse;
import com.kodlamaio.bootcampProject.business.responses.bootcamps.UpdateBootcampsResponse;
import com.kodlamaio.bootcampProject.core.utilities.exceptions.BusinessException;
import com.kodlamaio.bootcampProject.core.utilities.mapping.ModelMapperService;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;
import com.kodlamaio.bootcampProject.core.utilities.results.SuccessDataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.SuccessResult;
import com.kodlamaio.bootcampProject.dataAccess.abstracts.BootcampsRepository;
import com.kodlamaio.bootcampProject.entities.applications.Bootcamps;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BootcampsManager implements BootcampsService{

	private BootcampsRepository bootcampsRepository;
	private ModelMapperService modelMapperService;
	private InstructorService instructorService;
	
	@Override
	public DataResult<AddBootcampsResponse> add(AddBootcampsRequest addBootcampsRequest) {
		checkIfInstructorById(addBootcampsRequest.getInstructorId());
		//checkIfBootcampIsActive(addBootcampsRequest.getState());
		Bootcamps bootcamp= this.modelMapperService.forRequest().map(addBootcampsRequest, Bootcamps.class);
		bootcamp.setId(0);
		this.bootcampsRepository.save(bootcamp);
		AddBootcampsResponse addBootcampsResponse = modelMapperService.forResponse().map(bootcamp, AddBootcampsResponse.class);
		return new SuccessDataResult<AddBootcampsResponse>(addBootcampsResponse,Messages.BootcampCreated);
	}

	@Override
	public DataResult<UpdateBootcampsResponse> update(UpdateBootcampsRequest updateBootcampsRequest) {
		checkIfBootcampsById(updateBootcampsRequest.getId());
		checkIfInstructorById(updateBootcampsRequest.getInstructorId());
		Bootcamps bootcamp= this.modelMapperService.forRequest().map(updateBootcampsRequest, Bootcamps.class);
		bootcampsRepository.save(bootcamp);
		UpdateBootcampsResponse updateBootcampsResponse = this.modelMapperService.forResponse().map(bootcamp, UpdateBootcampsResponse.class);
		return new SuccessDataResult<UpdateBootcampsResponse>(updateBootcampsResponse,Messages.BootcampUpdated);
	}

	@Override
	public Result delete(int id) {
		checkIfBootcampsById(id);
		this.bootcampsRepository.deleteById(id);
		return new SuccessResult(Messages.BootcampDeleted);
	}

	@Override
	public DataResult<List<GetAllBootcampsResponse>> getAll() {
		List<Bootcamps> bootcamps = bootcampsRepository.findAll();
		List<GetAllBootcampsResponse> responses = bootcamps.stream()
				.map(bootcamp->this.modelMapperService.forResponse()
						.map(bootcamp, GetAllBootcampsResponse.class))
				.collect(Collectors.toList());
		return new SuccessDataResult<List<GetAllBootcampsResponse>>(responses);
	}

	@Override
	public DataResult<GetBootcampsResponse> getById(int id) {
		checkIfBootcampsById(id);
		Bootcamps bootcamps = this.bootcampsRepository.findById(id).get();
		GetBootcampsResponse response = this.modelMapperService.forResponse().map(bootcamps, GetBootcampsResponse.class);
		return new SuccessDataResult<GetBootcampsResponse>(response);
	}
	
	public void checkIfBootcampActivated(int id) {
		Bootcamps checkBootcamp = bootcampsRepository.findById(id).get();
		if(checkBootcamp.getBootcampsState().getId()== 2) {
			throw new BusinessException(Messages.BootcampActiveException);
		}
	}
	
	private void checkIfBootcampsById(int id) {
		if(!this.bootcampsRepository.existsById(id)) {
			throw new BusinessException(Messages.InstructorIdNotExist);
		}
	}
	
	private void checkIfInstructorById(int id) {
		instructorService.getById(id);
	}

}
