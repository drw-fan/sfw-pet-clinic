package com.ferencz.sfwpetclinic.services;

import com.ferencz.sfwpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
