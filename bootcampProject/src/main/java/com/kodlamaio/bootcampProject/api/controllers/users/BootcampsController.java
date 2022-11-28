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

import com.kodlamaio.bootcampProject.business.abstracts.BootcampsService;
import com.kodlamaio.bootcampProject.business.requests.bootcamps.AddBootcampsRequest;
import com.kodlamaio.bootcampProject.business.requests.bootcamps.UpdateBootcampsRequest;
import com.kodlamaio.bootcampProject.business.responses.bootcamps.AddBootcampsResponse;
import com.kodlamaio.bootcampProject.business.responses.bootcamps.GetAllBootcampsResponse;
import com.kodlamaio.bootcampProject.business.responses.bootcamps.GetBootcampsResponse;
import com.kodlamaio.bootcampProject.business.responses.bootcamps.UpdateBootcampsResponse;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/bootcamps")
public class BootcampsController {
	
	private BootcampsService bootcampsService;
	
	@GetMapping()
	public DataResult<List<GetAllBootcampsResponse>> getAll(){
		return bootcampsService.getAll();
	}
	
	@PostMapping()
	public DataResult<AddBootcampsResponse> add(@Valid @RequestBody AddBootcampsRequest addBootcampsRequest) {
		return bootcampsService.add(addBootcampsRequest);
	}
	
	@PutMapping()
	public DataResult<UpdateBootcampsResponse> update  (@Valid @RequestBody UpdateBootcampsRequest updateBootcampsRequest) {
		return bootcampsService.update(updateBootcampsRequest);
	}
	
	@DeleteMapping("/{id}")
	public Result delete (@PathVariable int id) {
		return bootcampsService.delete(id);
	}
	
	@GetMapping("/{id}")
	public DataResult<GetBootcampsResponse> getById(@PathVariable int id){
		return bootcampsService.getById(id);
	}

}
