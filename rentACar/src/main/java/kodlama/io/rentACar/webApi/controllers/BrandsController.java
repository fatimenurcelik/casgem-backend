package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.brands.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.brands.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.brands.CreateBrandResponse;
import kodlama.io.rentACar.business.responses.brands.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.brands.UpdateBrandResponse;
import lombok.AllArgsConstructor;

@RestController //annotation bilgilendirme
@RequestMapping("/api/brands") //adresleme
@AllArgsConstructor
public class BrandsController {
	
	private BrandService brandService;

	@GetMapping("/getall")
	public List <GetAllBrandsResponse> getAll(){
		return brandService.getAll();
	}
	
	@PostMapping("/add")
	public CreateBrandResponse add(@RequestBody CreateBrandRequest createBrandRequest) {
		return brandService.add(createBrandRequest);
	}
	
	@PutMapping("/update")
	public UpdateBrandResponse update(@RequestBody UpdateBrandRequest updateBrandRequest) {
		return brandService.update(updateBrandRequest);
	}
}
