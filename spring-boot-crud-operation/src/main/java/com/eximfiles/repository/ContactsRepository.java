package com.eximfiles.repository;

import org.springframework.data.repository.CrudRepository;

import com.eximfiles.model.Contacts;

public interface ContactsRepository extends CrudRepository<Contacts, Integer> {
}
