package com.kodlamaio.bootcampProject.entities.applications;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.kodlamaio.bootcampProject.entities.users.Applicant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "applications")
public class Applications {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "state")
	private int state;
	
	@ManyToOne
	@JoinColumn(name="applicantsId")
	Applicant applicant;
	
	@ManyToOne
	@JoinColumn(name="bootcampsId")
	private Bootcamps bootcamps;
}
