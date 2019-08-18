package com.ferencz.sfwpetclinic.services.map;

import com.ferencz.sfwpetclinic.model.Vet;
import com.ferencz.sfwpetclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstactMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}
