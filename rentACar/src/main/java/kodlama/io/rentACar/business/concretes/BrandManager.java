package kodlama.io.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.brands.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.brands.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.brands.CreateBrandResponse;
import kodlama.io.rentACar.business.responses.brands.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.brands.UpdateBrandResponse;
import kodlama.io.rentACar.core.utilities.mapping.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;

@Service //Bu sınıf bir business nesnesidir
@AllArgsConstructor
public class BrandManager implements BrandService{
	
	private BrandRepository brandRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllBrandsResponse> getAll() {
		List <Brand> brands =brandRepository.findAll();
		List <GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();
		
		for (Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			
			brandsResponse.add(responseItem);
		}
		// is kurallari
		return brandsResponse;
	}

	@Override
	public CreateBrandResponse add(CreateBrandRequest createBrandRequest) {
		Brand brand= this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
		Brand result = brandRepository.save(brand);
		CreateBrandResponse createBrandResponse = this.modelMapperService.forResponse().map(result, CreateBrandResponse.class);
		
		return createBrandResponse;
	}

	@Override
	public UpdateBrandResponse update(UpdateBrandRequest updateBrandRequest) {
		Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest,Brand.class);
		Brand result = brandRepository.save(brand);
		UpdateBrandResponse updateBrandResponse = this.modelMapperService.forResponse().map(result, UpdateBrandResponse.class);
		return updateBrandResponse;
	}
}
