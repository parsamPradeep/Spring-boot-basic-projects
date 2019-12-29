package com.springboot.pet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import src.main.java.com.springboot.pet.model.Owner;
@Service
public interface OwnerService extends CrudService<Owner,Long>  {
@Autowired
    Owner findByLastName(String lastname);

}

