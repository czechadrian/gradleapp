package hello;
import java.util.*;
public class HelloMain {
    public static void main(String args[]){

        GeneratePerson person = new GeneratePerson();
        List<String> lista = new ArrayList<String>();
        for(int i =0;i<101;i++)
            lista.add(person.generateName() + person.generateSurnames() +
                    person.generateEmails());
        Collections.sort(lista);
        for(int i = 0;i<101;i++)
            System.out.println(lista.get(i));
    }
}
