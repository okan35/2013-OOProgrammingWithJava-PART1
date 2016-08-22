
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pc
 */
public class Phonebook {

    private ArrayList<Person> phoneBook;

    public Phonebook() {

        this.phoneBook = new ArrayList<Person>();
    }

    public void add(String name, String number) {

        Person p = new Person(name, number);
        phoneBook.add(p);

    }

    public void printAll() {

        for (Person person : phoneBook) {
            System.out.println(person);
        }

    }

    public String searchNumber(String name) {
        for (Person p : phoneBook) {
            if (p.getName().contains(name)) {
                return p.getNumber();
            }
        }

        return "number not known";
    }
}
