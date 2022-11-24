package com.kodlamaio.bootcampProject.business.abstracts;

import java.util.List;

import com.kodlamaio.bootcampProject.business.requests.intructors.AddInstructorRequest;
import com.kodlamaio.bootcampProject.business.requests.intructors.UpdateInstructorRequest;
import com.kodlamaio.bootcampProject.business.responses.instructors.AddInstructorResponse;
import com.kodlamaio.bootcampProject.business.responses.instructors.GetAllInstructorResponse;
import com.kodlamaio.bootcampProject.business.responses.instructors.GetInstructorResponse;
import com.kodlamaio.bootcampProject.business.responses.instructors.UpdateInstructorResponse;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;

public interface InstructorService {
	DataResult <AddInstructorResponse> add(AddInstructorRequest addInstructorRequest);
	DataResult <UpdateInstructorResponse> update (UpdateInstructorRequest updateInstructorRequest);
	Result delete (int id); //nesne döndürme durumunda DataResult kullanabiliz
	DataResult<List<GetAllInstructorResponse>> getAll ();
	DataResult<GetInstructorResponse> getById(int id);
}
