package Service;
import java.util.List;

import com.contacts.demo.entity.Contacts;
 


public interface ContactService {
 
	public List<Contacts> getAllContacts();
	public Contacts getContactById(int contactid);
	public Contacts addOrUpdateContact(Contacts contact);
	public Contacts deleteContact(int contactid) throws Exception;
}
