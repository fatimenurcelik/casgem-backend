package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.brands.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.brands.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.brands.CreateBrandResponse;
import kodlama.io.rentACar.business.responses.brands.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.brands.UpdateBrandResponse;

public interface BrandService {
	List <GetAllBrandsResponse> getAll();
	CreateBrandResponse add(CreateBrandRequest createBrandRequest);
	UpdateBrandResponse update(UpdateBrandRequest updateBrandRequest);
}