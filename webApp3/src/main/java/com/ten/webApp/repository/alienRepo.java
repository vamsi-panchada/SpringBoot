package com.ten.webApp.repository;

import com.ten.webApp.model.Alien;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface alienRepo extends CrudRepository<Alien, Integer> {
    List<Alien> findByTech(String tech);
}
