package hello;
import java.util.Random;
public class GeneratePerson{

    String names[] = {"Achacja", "Achacjusz", "Achacy","Achilles", "Ada", "Adalbert",
            "Adalberta", "Adalgunda", "Adalruna", "Alruna", "Adalryk", "Alderyk",
            "Adalwin", "Adalwina", "Adam", "Adamina", "Adamnan", "Adaukt", "Addar",
            "Adela", "Adelajda", "Adelard", "Adelina","Adelinda","Ademar" ,"Adolf",
            "Macedoniusz","Machabeusz","Maciej","Macieja","Magdalena","Magnus"
            ,"Maja","Majnard","Majol","Majola","Makaria","Makary","Makrobiusz"
            ,"Makryn","Makryna","Maksencja","Maksencjusz", "Maksanty","Maksym"
            ,"Maksyma","Maksymian","Maksymilian","Maksymiliana","Maksymin"
            ,"Maksymina","Malachiasz","Malchus","Malina","Malkolm","Malwina"
            ,"Małgorzata","Małobąd","Małogost","Małomir","Objęsław", "Ocięsław",
            "Oda", "Odeta" , "Odo" , "Odon" , "Odoryk", "Odylon" , "Odyseusz", "Odys" ,
            "Ofelia" , "Okrzesław" , "Oktawia", "Oktawian" , "Oktawiusz" , "Olaf" ,
            "Oldmir" , "Olga" , "Olgierd" , "Olimpia" , "Olimpiusz" , "Oliwer" ,
            "Oliwia" , "Oliwier" , "Oliwiusz"};
    String surnames[] = {"Gabrowski" , "Gadowski", "Gajda" , "Galewicz" , "Galiński" ,
            "Gałczyński" , "Gałecki" , "Gancarczyk" , "Garbowski" , "Gardocki" ,
            "Gawkowski" , "Gawlik" , "Gawłowski","Damboń" , "Dancewicz" , "Danielak" ,
            "Danysz" , "Dąbek" , "Dąbkowski" , "Dąbrowski" , "Dębicki" , "Dębiński" ,
            "Dłuski" , "Dobiecki" , "Dobrucki" , "Dobrzański" , "Dobrzyński" ,
            "Doliński" , "Dołęga-Zakrzewski" , "Domachowski" , "Domagalski" ,
            "Drągowski" , "Drewniowski" , "Drewnowicz" , "Drewnowski" , "Drobczyński" ,
            "Drzewiecki" , "Duchnowski" , "Dunajewski" , "Dutkiewicz" , "Dziadosz",
            "Niemojowski" , "Niewiadomski" , "Niewiarowscy" , "Nowacki" , "Nowak" ,
            "Nowakowski" , "Nowicka" , "Nowicki" , "Nowiński","    Oborski" ,
            "Obrębscy" , "Ochab" , "Ochocki" , "Odrzywolski" , "Okulski",
            "Olechnowicz" , "Olechowski" , "Olejniczak" , "Olekszyk" , "Olszewski",
            "Rogalski" , "Roguski" , "Romanowicz" , "Romański" , "Roszkowski" ,
            "Różański" , "Różewicz" , "Różycki" , "Rubinowicz" , "Rudnicki"};

    String domain[] = {"gmail.com","onet.pl","interia.pl","yyoyo.qwe"};

    Random rand = new Random();
    String name;
    String surname;
    public String generateName(){
        name = names[rand.nextInt(names.length)];
        return name + " ";
    }
    public String generateSurnames(){
       surname =surnames[rand.nextInt(surnames.length)];
        return surname + " ";
    }
    public String generateEmails(){

        return name + surname +"@" +domain[rand.nextInt(domain.length)];
    }
}
