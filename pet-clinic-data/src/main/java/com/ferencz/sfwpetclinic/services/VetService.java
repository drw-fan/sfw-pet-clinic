package com.ferencz.sfwpetclinic.services;

import com.ferencz.sfwpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long> {
    Vet findByLastName(String lastName);
}
