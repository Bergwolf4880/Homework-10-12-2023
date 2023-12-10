//        Реализовать метод который в массиве программистов находить программистов со знанием заданной технологии
//        (например,всех кто знает Java)и выводит на экран.
//
//        Метод,реализованный в п.2должен не выводить на экран,
//        а формировать новый массив Programmer[]содержащий всех программистов с заданной технологией.
//

public class Programmer {

    private Person person;

    private String[] listOfTechnologies;

    public Programmer(Person person, String[] listOfTechnologies) {
        this.person = person;
        this.listOfTechnologies = listOfTechnologies;

    }

    public Programmer(Person person, String listOfTechnologies) {
        this.person = person;
        this.listOfTechnologies = listOfTechnologies.split(",");

    }

    public Programmer(String firstName, String lastName, String[] listOfTechnologies) {
        this.person = new Person(firstName, lastName);
        this.listOfTechnologies = listOfTechnologies;
    }

    public Programmer(String fullName, String[] listOfTechnologies) {
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];
        this.person = new Person(firstName, lastName);
        this.listOfTechnologies = listOfTechnologies;
    }


    public String toString() {
        String temp = "Name: " + person.toString() + "\nTechnologies: ";
        for (String i : listOfTechnologies) {
            temp = temp + i + " ";
        }

        return temp;
    }



    public boolean hasProgrammerSkill(String technology) {
        for (String tech : listOfTechnologies) {
            if (tech.equals(technology)) {
                return true;
            }
        }
        return false;
    }

    public static void arrayToString (Programmer[]programmers){

    }
}
