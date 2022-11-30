package com.kodlamaio.bootcampProject.business.requests.blackList;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.kodlamaio.bootcampProject.business.constants.ValidationMessages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddBlackListRequest {
	@NotNull(message= ValidationMessages.Blacklist.ApplicantIdBlank)
	private int applicantId;
	
	@NotBlank(message= ValidationMessages.Blacklist.ReasonBlank)
	@Size(min=5, max=50,message = ValidationMessages.Blacklist.ReasonValid)
	private String reason;
	
	@NotBlank(message= ValidationMessages.Blacklist.DateBlank)
	@DateTimeFormat(pattern= "dd-MM-YYYY")
	private String date;
}
