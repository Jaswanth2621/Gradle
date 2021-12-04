package DempRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.contacts.demo.entity.Contacts;
@Repository
public interface ContactRepository extends CrudRepository<Contacts, Integer> {

}
