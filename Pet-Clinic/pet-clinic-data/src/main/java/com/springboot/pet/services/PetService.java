package com.springboot.pet.services;

import org.springframework.stereotype.Service;
import src.main.java.com.springboot.pet.model.Pet;
@Service
public interface PetService extends CrudService<Pet , Long> {

}
