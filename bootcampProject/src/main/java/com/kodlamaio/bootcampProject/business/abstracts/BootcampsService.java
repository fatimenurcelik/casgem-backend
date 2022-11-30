package com.kodlamaio.bootcampProject.business.abstracts;

import java.util.List;

import com.kodlamaio.bootcampProject.business.requests.bootcamps.AddBootcampsRequest;
import com.kodlamaio.bootcampProject.business.requests.bootcamps.UpdateBootcampsRequest;
import com.kodlamaio.bootcampProject.business.responses.bootcamps.AddBootcampsResponse;
import com.kodlamaio.bootcampProject.business.responses.bootcamps.GetAllBootcampsResponse;
import com.kodlamaio.bootcampProject.business.responses.bootcamps.GetBootcampsResponse;
import com.kodlamaio.bootcampProject.business.responses.bootcamps.UpdateBootcampsResponse;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;

public interface BootcampsService {
	DataResult<AddBootcampsResponse> add(AddBootcampsRequest addBootcampsRequest);
	DataResult<UpdateBootcampsResponse> update (UpdateBootcampsRequest updateBootcampsRequest);
	Result delete (int id);
	DataResult<List<GetAllBootcampsResponse>> getAll();
	DataResult<GetBootcampsResponse> getById(int id);
	public void checkIfBootcampActivated(int id);
}
