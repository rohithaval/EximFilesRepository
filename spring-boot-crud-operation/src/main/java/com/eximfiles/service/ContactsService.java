package com.eximfiles.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eximfiles.model.Contacts;
import com.eximfiles.repository.ContactsRepository;

//defining the business logic
@Service
public class ContactsService {
	@Autowired
	ContactsRepository ContactsRepository;

//getting all Contacts record by using the method findaAll() of CrudRepository
	public List<Contacts> getAllContacts() {
		List<Contacts> Contacts = new ArrayList<Contacts>();
		ContactsRepository.findAll().forEach(Contacts1 -> Contacts.add(Contacts1));
		return Contacts;
	}

//getting a specific record by using the method findById() of CrudRepository
	public Contacts getContactsById(int id) {
		return ContactsRepository.findById(id).get();
	}

	//getting a specific record by using the method findById() of CrudRepository
	public List<Contacts> getContactsByType(String Type) {
		List<Contacts> Contacts = new ArrayList<Contacts>();
		ContactsRepository.findAll().forEach(Contacts1 -> Contacts.add(Contacts1));
		return Contacts.stream().filter(Contact->Contact.getContactType().equals(Type)).toList();
		}	
//saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(Contacts Contacts) {
		ContactsRepository.save(Contacts);
	}

//deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int contactNumber) {
		ContactsRepository.deleteById(contactNumber);
	}

//updating a record
	public void update(Contacts Contacts, int contactNumber) {
		ContactsRepository.save(Contacts);
	}
}