package biometrija.test.dao;

import java.util.List;

import biometrija.test.entity.Contact;

public interface ContactDAO {
	
	public List<Contact> getContactList();
	
	public Contact getContact(int id);
	
	public void saveContact(Contact contact);
	
	public void deleteContact(int id);

}
