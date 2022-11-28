package com.kodlamaio.bootcampProject.entities.users;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.kodlamaio.bootcampProject.entities.applications.Bootcamps;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="instructors")
public class Instructor extends User{

	@Column(name="companyName")
	private String companyName;
	
	@OneToMany(mappedBy="instructor")
	private List<Bootcamps> bootcamsp;
	
}
