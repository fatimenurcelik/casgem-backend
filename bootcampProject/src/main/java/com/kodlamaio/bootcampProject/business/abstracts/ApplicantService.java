package com.kodlamaio.bootcampProject.business.abstracts;

import java.util.List;

import com.kodlamaio.bootcampProject.business.requests.applicants.AddApplicantRequest;
import com.kodlamaio.bootcampProject.business.requests.applicants.UpdateApplicantRequest;
import com.kodlamaio.bootcampProject.business.responses.applicants.AddApplicantResponse;
import com.kodlamaio.bootcampProject.business.responses.applicants.GetAllApplicantResponse;
import com.kodlamaio.bootcampProject.business.responses.applicants.GetApplicantResponse;
import com.kodlamaio.bootcampProject.business.responses.applicants.UpdateApplicantResponse;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;

public interface ApplicantService {
	DataResult<AddApplicantResponse> add(AddApplicantRequest addApplicantRequest);
	DataResult<UpdateApplicantResponse> update (UpdateApplicantRequest updateApplicantRequest);
	Result delete (int id);
	DataResult<List<GetAllApplicantResponse>> getAll();
	DataResult<GetApplicantResponse> getById(int id);
}
