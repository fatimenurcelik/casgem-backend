package kodlama.io.rentACar.business.concretes;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.CarService;
import kodlama.io.rentACar.business.requests.cars.CreateCarRequest;
import kodlama.io.rentACar.business.requests.cars.UpdateCarRequest;
import kodlama.io.rentACar.business.responses.cars.CreateCarResponse;
import kodlama.io.rentACar.business.responses.cars.UpdateCarResponse;
import kodlama.io.rentACar.core.utilities.mapping.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.CarRepository;
import kodlama.io.rentACar.entities.concretes.Car;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CarManager implements CarService{
	
	private CarRepository carRepository;
	
	private ModelMapperService modelMapperService;
	
	@Override
	public CreateCarResponse add(CreateCarRequest createCarRequest) {
		Car car= this.modelMapperService.forRequest().map(createCarRequest, Car.class);
		car.setId(0);
				
		Car result =  carRepository.save(car);
		
		CreateCarResponse createCarResponse = this.modelMapperService.forResponse().map(result,CreateCarResponse.class); 
		
		return createCarResponse;
	}

	@Override
	public UpdateCarResponse update(UpdateCarRequest updateCarRequest) {
		Car car = this.modelMapperService.forRequest().map(updateCarRequest, Car.class);
		Car result = carRepository.save(car);
		UpdateCarResponse updateCarResponse = this.modelMapperService.forResponse().map(result,UpdateCarResponse.class);
		return updateCarResponse;
	}

}
