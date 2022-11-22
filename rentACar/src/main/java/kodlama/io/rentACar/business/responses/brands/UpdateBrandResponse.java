package kodlama.io.rentACar.business.responses.brands;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateBrandResponse {
	private int id;
	private String name;
}
