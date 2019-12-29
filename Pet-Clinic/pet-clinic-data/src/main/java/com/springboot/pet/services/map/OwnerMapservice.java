package com.springboot.pet.services.map;

import com.springboot.pet.services.OwnerService;
import com.springboot.pet.services.PetTypeService;
import org.springframework.stereotype.Service;
import src.main.java.com.springboot.pet.model.Owner;
import src.main.java.com.springboot.pet.model.PetType;

import java.util.Set;
@Service
public class OwnerMapservice extends AbstractMapService<Owner,Long> implements OwnerService {
    private final PetType petType;
    private  final PetTypeService petTypeService;
     public  OwnerMapservice(PetTypeService petTypeService, PetType petType){

         this.petType = petType;
         this.petTypeService = petTypeService;
     }
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Owner owner) {
            super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
            super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
       return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastname) {
        return null;
    }
}
