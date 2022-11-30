package com.kodlamaio.bootcampProject.business.abstracts;

import java.util.List;

import com.kodlamaio.bootcampProject.business.requests.applications.AddApplicationsRequest;
import com.kodlamaio.bootcampProject.business.requests.applications.UpdateApplicationsRequest;
import com.kodlamaio.bootcampProject.business.responses.applications.AddApplicationsResponse;
import com.kodlamaio.bootcampProject.business.responses.applications.GetAllApplicationsResponse;
import com.kodlamaio.bootcampProject.business.responses.applications.GetApplicationsResponse;
import com.kodlamaio.bootcampProject.business.responses.applications.UpdateApplicationsResponse;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;

public interface ApplicationsService {
	DataResult<AddApplicationsResponse> add (AddApplicationsRequest addApplicationsRequest);
	DataResult<UpdateApplicationsResponse> update (UpdateApplicationsRequest updateApplicationsRequest);
	Result delete(int id);
	DataResult<List<GetAllApplicationsResponse>> getAll();
	DataResult<GetApplicationsResponse> getById(int id);
//	void checkIfApplicantIsRejected(int id);
//	void checkIfApplicantIsStandBy(int id);
}
