package com.eximfiles.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eximfiles.model.Contacts;
import com.eximfiles.service.ContactsService;

//mark class as Controller
@RestController
public class ContactsController {
//autowire the ContactsService class
	@Autowired
	ContactsService contactsService;

//creating a get mapping that retrieves all the contacts detail from the database 
	@GetMapping("/contact")
	private List<Contacts> getAllContacts() {
		return contactsService.getAllContacts();
	}

//creating a get mapping that retrieves the detail of a specific contact
	@GetMapping("/contact/{contactid}")
	private Contacts getContacts(@PathVariable("contactid") int contactid) {
		return contactsService.getContactsById(contactid);
	}
	
//creating a get mapping that retrieves the detail of a specific contact
	@GetMapping("/contacts/{contacttype}")
	private List<Contacts> getContactsbyType(@PathVariable("contacttype") String contacttype) {
		return contactsService.getContactsByType(contacttype);
	}

//creating a delete mapping that deletes a specified contact
	@DeleteMapping("/contact/{contactid}")
	private void deleteContact(@PathVariable("contactid") int contactid) {
		contactsService.delete(contactid);
	}

//creating post mapping that post the contact detail in the database
	@PostMapping("/contacts")
	private int saveContact(@RequestBody Contacts contacts) {
		contactsService.saveOrUpdate(contacts);
		return contacts.getContactId();
	}

//creating put mapping that updates the contact detail 
	@PutMapping("/contacts")
	private Contacts update(@RequestBody Contacts contacts) {
		contactsService.saveOrUpdate(contacts);
		return contacts;
	}
}
