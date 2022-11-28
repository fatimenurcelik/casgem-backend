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

import com.kodlamaio.bootcampProject.business.abstracts.ApplicationsService;
import com.kodlamaio.bootcampProject.business.requests.applications.AddApplicationsRequest;
import com.kodlamaio.bootcampProject.business.requests.applications.UpdateApplicationsRequest;
import com.kodlamaio.bootcampProject.business.responses.applications.AddApplicationsResponse;
import com.kodlamaio.bootcampProject.business.responses.applications.GetAllApplicationsResponse;
import com.kodlamaio.bootcampProject.business.responses.applications.GetApplicationsResponse;
import com.kodlamaio.bootcampProject.business.responses.applications.UpdateApplicationsResponse;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/applications")
public class ApplicationsController {
	
	private ApplicationsService applicationsService;
	
	@GetMapping()
	public DataResult<List<GetAllApplicationsResponse>> getAll(){
		return applicationsService.getAll();
	}
	
	@PostMapping()
	public DataResult<AddApplicationsResponse> add(@Valid @RequestBody AddApplicationsRequest addApplicationsRequest) {
		return applicationsService.add(addApplicationsRequest);
	}
	
	@PutMapping()
	public DataResult<UpdateApplicationsResponse> update  (@Valid @RequestBody UpdateApplicationsRequest updateApplicationsRequest) {
		return applicationsService.update(updateApplicationsRequest);
	}
	
	@DeleteMapping("/{id}")
	public Result delete (@PathVariable int id) {
		return applicationsService.delete(id);
	}
	
	@GetMapping("/{id}")
	public DataResult<GetApplicationsResponse> getById(@PathVariable int id){
		return this.applicationsService.getById(id);
	}

}
