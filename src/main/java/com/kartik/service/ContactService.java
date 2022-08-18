package com.kartik.service;

import java.util.List;

import com.kartik.Entity.Contact;

public interface ContactService {
	
	public boolean saveContact(Contact contact);
	
	List<Contact> getAllContact();
	
	Contact getContactById(Integer contactId);
	
	
	public boolean delectContactById(Integer contactId);

	
	
}
	
