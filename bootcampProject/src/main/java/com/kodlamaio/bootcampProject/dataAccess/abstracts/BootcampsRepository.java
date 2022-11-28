package com.kodlamaio.bootcampProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.bootcampProject.entities.applications.Bootcamps;

public interface BootcampsRepository extends JpaRepository<Bootcamps, Integer>{
}
