package com.kodlamaio.bootcampProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kodlamaio.bootcampProject.entities.applications.Applications;

public interface ApplicationsRepository extends JpaRepository<Applications, Integer>{

}
