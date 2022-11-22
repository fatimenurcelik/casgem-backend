package kodlama.io.rentACar.webApi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.CarService;
import kodlama.io.rentACar.business.requests.cars.CreateCarRequest;
import kodlama.io.rentACar.business.requests.cars.UpdateCarRequest;
import kodlama.io.rentACar.business.responses.cars.CreateCarResponse;
import kodlama.io.rentACar.business.responses.cars.UpdateCarResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarController {
	private CarService carService;
	
	@PostMapping("/add")
	public CreateCarResponse add(@RequestBody CreateCarRequest createCarRequest){
		return this.carService.add(createCarRequest);
	}
	
	@PutMapping("update")
	public UpdateCarResponse update(@RequestBody UpdateCarRequest updateCarRequest) {
		return this.carService.update(updateCarRequest);
	}
}
