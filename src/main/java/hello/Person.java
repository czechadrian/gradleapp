package hello;

import java.util.regex.*;

class Person {

    public String name;
    public String surname;
    public String email;

    public Person(String name, String surname, String email) {
       this.name = name;
       this.surname = surname;
       this.email = email;
       this.PersonThreads();
    }

    private void PersonThreads() throws IllegalArgumentException{
        Pattern pNameAndSurname = Pattern.compile("^[-a-zA-ZęĘóÓĄąŚśłŁżŻźŹćĆńŃ]+$");
        Pattern pDomain = Pattern.compile("[-a-zA-ZęĘóÓĄąŚśłŁżŻźŹćĆńŃ]+@[a-z]+\\.[a-z]{2,3}$");

        if(!this.name.matches(pNameAndSurname.toString()))
            throw new IllegalArgumentException("invalid person's name");
        if(!this.surname.matches(pNameAndSurname.toString()))
            throw new IllegalArgumentException("invalid person's surname");
        if(!this.email.matches(pDomain.toString()))
            throw new IllegalArgumentException("invalid person's email");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}