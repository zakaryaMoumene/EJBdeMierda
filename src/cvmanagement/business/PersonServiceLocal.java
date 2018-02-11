package cvmanagement.business;

import java.util.List;

import javax.ejb.Local;

import cvmanagement.entities.Activity;
import cvmanagement.entities.Person;

@Local
public interface PersonServiceLocal {

	public Long addPerson(Person person);

	public Person findPersonByEmail(String personEmail);

	public void updatePerson(Person person);

	public void deletePersonById(Long personId);
	
	public void deleteAll();

    public Long saveActivity(Activity activity, Person person);

    void deleteActivity(Activity activity, Person person);
    
    void cleanActivities();

    public List<Person> findAll();

    public Person findPersonById(Long personId);
    
    public List<Person> search(Object[] params);
    
}