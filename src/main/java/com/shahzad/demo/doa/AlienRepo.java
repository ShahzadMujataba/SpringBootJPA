package com.shahzad.demo.doa;

import org.springframework.data.repository.CrudRepository;

import com.shahzad.demo.model.Alien;

public interface AlienRepo  extends CrudRepository<Alien, Integer>
{

}
