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

import com.kodlamaio.bootcampProject.business.abstracts.InstructorService;
import com.kodlamaio.bootcampProject.business.requests.intructors.AddInstructorRequest;
import com.kodlamaio.bootcampProject.business.requests.intructors.UpdateInstructorRequest;
import com.kodlamaio.bootcampProject.business.responses.instructors.AddInstructorResponse;
import com.kodlamaio.bootcampProject.business.responses.instructors.GetAllInstructorResponse;
import com.kodlamaio.bootcampProject.business.responses.instructors.GetInstructorResponse;
import com.kodlamaio.bootcampProject.business.responses.instructors.UpdateInstructorResponse;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/instructors")
public class InstructorController {
	
	private InstructorService instructorService;
	
	@GetMapping()
	public DataResult<List<GetAllInstructorResponse>> getAll () {
		return this.instructorService.getAll();
	}
	
	@PostMapping()
	public DataResult<AddInstructorResponse> add(@Valid @RequestBody AddInstructorRequest addInstructorRequest) {
		return this.instructorService.add(addInstructorRequest);
	}
	
	@PutMapping()
	public DataResult <UpdateInstructorResponse> update (@Valid @RequestBody UpdateInstructorRequest updateInstructorRequest) {
		return this.instructorService.update(updateInstructorRequest);
	}
	
	@DeleteMapping("/{id}")
	public Result delete (@PathVariable int id) {
		return this.instructorService.delete(id);
	}
	
	@GetMapping("/{id}")
	public DataResult<GetInstructorResponse> getById(@PathVariable int id){
		return this.instructorService.getById(id);
	}
}
