package assignment7;

import java.util.ArrayList;

public interface PhonebookInterface {

    boolean create(Phonebook pb);
    ArrayList<Phonebook> getList();
    boolean update(Phonebook pb);
    boolean delete(Phonebook pb);
}
