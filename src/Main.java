
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Employee("John", "Lennon","Musician(Legend)",27045.78));
        persons.add(new Employee("George", "Harrison","AlsoLegend",50000.00));
        persons.add(new Student("Ringo", "Starr", 1.89));
        persons.add(new Student("Paul", "McCartney", 3.85));
        Collections.sort(persons);
        printData(persons);
    }
    public static void printData(Iterable<Person> persons){
        for(Person person : persons){
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}