package serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contacts.demo.entity.Contacts;

import DempRepository.ContactRepository;
import Service.ContactService;
@Service
public class Contactsimpl implements ContactService {
	
	@Autowired
    private ContactRepository contactRepository;
	
	@Override
	public List<Contacts> getAllContacts() {
		
		return (List<Contacts>) contactRepository.findAll();
	}

	@Override
	public Contacts getContactById(int contactid) {
		
		return contactRepository.findById(contactid).orElse(null);
	}

	@Override
	public Contacts addOrUpdateContact(Contacts contact) {
		
		return contactRepository.save(contact) ;
	}

	@Override
	public Contacts deleteContact(int contactid) throws Exception{
		Contacts deletedContact = null;
		try {
			deletedContact = contactRepository.findById(contactid).orElse(null);
			if(deletedContact == null) {
				throw new Exception("contact not available");
					}
			else {
				contactRepository.deleteById(contactid);
			}
		}
		catch(Exception ex ) {
			throw ex;
		}
		return deletedContact;
	}

}
