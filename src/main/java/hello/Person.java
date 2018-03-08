package hello;

class Person {

    private String name;
    private String surname;
    private String email;

    Person(String name,String surname,String email){
        this.name=name;
        this.surname=surname;
        this.email=email;
    }
    public String toString(){
        if(name.matches("^[a-zA-Z]+$")
                ||surname.matches("^[a-zA-Z]+$")
                ||email.matches("^[^@]+@[a-z]+\\.[a-z]{3}$"))
            return "name: " + name + " surname: " + surname
                    + " email: " + email;
        else
            return "error with data,try again";

    }

}
