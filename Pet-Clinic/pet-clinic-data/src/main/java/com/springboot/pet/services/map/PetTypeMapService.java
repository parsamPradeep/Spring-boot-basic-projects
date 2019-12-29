package com.springboot.pet.services.map;

import com.springboot.pet.services.PetTypeService;
import src.main.java.com.springboot.pet.model.PetType;

import java.util.Set;

public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(PetType object) {
            super.delete(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    }
