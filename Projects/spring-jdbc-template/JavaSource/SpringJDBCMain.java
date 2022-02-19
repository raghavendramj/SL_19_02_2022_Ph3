import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.simplilearn.config.AppConifg;
import com.simplilearn.entity.Person;
import com.simplilearn.service.PersonService;

public class SpringJDBCMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConifg.class);
		PersonService personService = applicationContext.getBean(PersonService.class);

		// personService.savePerson(new Person("Chethan", "Kumar", "Delhi"));
		// personService.savePerson(new Person("Abhishek", "Anand", "Bihar"));
		// personService.savePerson(new Person("Arpit", "Mathur", "Rajasthan"));

		List<Person> people = personService.getPeople();
		System.out.println("\npeople -> " + people);

		List<Person> popleByLastName = personService.getPeopleByLastName("Anand");
		System.out.println("\ngetPeopleByLastName -> " + popleByLastName);

		List<Person> peopleByFirstName = personService.getPeopleByFirstName("Abhishek");
		System.out.println("\npeopleByFirstName -> " + peopleByFirstName);

		Person personById = personService.getPerson(1);
		System.out.println("\npersonById -> " + personById);

		personService.updateAddress(2, "Madikeri");
		System.out.println("\npersonById -> " + personService.getPerson(2));
	}

}
