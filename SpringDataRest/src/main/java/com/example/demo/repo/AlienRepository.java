package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.example.demo.model.Alien;

@RepositoryRestResource(collectionResourceRel = "aliens",path="aliens")
public interface AlienRepository extends JpaRepository<Alien, Integer>
{

}
