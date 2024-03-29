package com.ferencz.sfwpetclinic.services.map;

import com.ferencz.sfwpetclinic.model.Pet;
import com.ferencz.sfwpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstactMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        super.save(pet.getId(), pet);
        return pet;
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
