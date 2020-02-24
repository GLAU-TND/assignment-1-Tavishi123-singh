package interfaceADT;

public interface ADT<Person> {
    boolean add(Person person);

    boolean delete(int index);

    void search(String name);

    void viewAllContacts();
}
