package controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.contacts.demo.entity.Contacts;
import Service.ContactService;
@RestController
@RequestMapping("/contacts")
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/allContacts")
	public ResponseEntity<List<Contacts>>getAllContacts(){
		List<Contacts> contacts = null;
		try {
			contacts = contactService.getAllContacts();
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Contacts>>(contacts,HttpStatus.OK);
	}

}
