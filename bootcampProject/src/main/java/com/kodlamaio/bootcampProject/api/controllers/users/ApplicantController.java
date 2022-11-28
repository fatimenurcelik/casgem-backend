package com.kodlamaio.bootcampProject.api.controllers.users;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.bootcampProject.business.abstracts.ApplicantService;
import com.kodlamaio.bootcampProject.business.requests.applicants.AddApplicantRequest;
import com.kodlamaio.bootcampProject.business.requests.applicants.UpdateApplicantRequest;
import com.kodlamaio.bootcampProject.business.responses.applicants.AddApplicantResponse;
import com.kodlamaio.bootcampProject.business.responses.applicants.GetAllApplicantResponse;
import com.kodlamaio.bootcampProject.business.responses.applicants.GetApplicantResponse;
import com.kodlamaio.bootcampProject.business.responses.applicants.UpdateApplicantResponse;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/applicants")
public class ApplicantController {
	
	private ApplicantService applicantService;
	
	@GetMapping()
	public DataResult<List<GetAllApplicantResponse>> getAll(){
		return applicantService.getAll();
	}
	
	@PostMapping()
	public DataResult<AddApplicantResponse> add(@Valid @RequestBody AddApplicantRequest addApplicantRequest) {
		return applicantService.add(addApplicantRequest);
	}
	
	@PutMapping()
	public DataResult<UpdateApplicantResponse> update  (@Valid @RequestBody UpdateApplicantRequest updateApplicantRequest) {
		return applicantService.update(updateApplicantRequest);
	}
	
	@DeleteMapping("/{id}")
	public Result delete (@PathVariable int id) {
		return applicantService.delete(id);
	}
	
	@GetMapping("/{id}")
	public DataResult<GetApplicantResponse> getById(@PathVariable int id){
		return applicantService.getById(id);
	}
}
