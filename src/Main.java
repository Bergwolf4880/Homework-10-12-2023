//        Давайте создадим класс Programmer. Он будет состоять из следующих полей { Person person, String[] listOfTechnologies }
//        Класс Person содержит всего два поля { String firstName, String lastName }.
//        Необходимо реализовать конструкторы таким образом, что бы Programmer можно было создать:
//
//        используя объект person и массив технологий: new Programmer(person, new String[]{"Java","Spring Boot","SQL"})
//        используя объект person и строке со списком технологий через запятую: new Programmer(person, "Java,Spring Boot,SQL")
//        используя строку firstName, строку lastName и массив технологий: new Programmer("Jack" "Johnson", new String[]{"Java","Spring Boot","SQL"})
//        используя строку ФИО (firstName и lastName разделены пробелом) массив технологий: new Programmer("Jack Johnson", new String[]{"Java","Spring Boot","SQL"})
//        Необходимо создать массив Programmer и вывести его на экран.

public class Main {
    public static void main(String[] args) {


        String techToSearch = "Java";

        Person person = new Person("Vassili", "Pupkin");

        Programmer[] programmers = {
                new Programmer(new Person("Anrey", "Belov"), new String[]{"Java", "SQL", "Spring Boot"}),
                new Programmer("Alexej", "Serov", new String[]{"C#", "PHP", "SQL"}),
                new Programmer(person, "Java, SQL, Spring Boot"),
                new Programmer("Vitaly Zuckermann", new String[]{"Java", "Rust", "SQL"})
        };

        boolean isTrue = programmers[0].hasProgrammerSkill(techToSearch);

        System.out.println(isTrue ? person : "no tech found");
        System.out.println(arrayToString(programmers));

        //System.out.println(arrayToString(programmers, techToSearch));

        System.out.println(arrayToString(sortedProgrammers(programmers, techToSearch)));

    }

    public static String arrayToString(Programmer[] programmers) {
        String result = "";
        for (Programmer temp : programmers) {
            result = result + "\n" + temp;
        }
        return result;
    }

    public static String arrayToString(Programmer[] programmers, String technology) {
        String result = "";
        for (Programmer programmer : programmers) {
            if (programmer.hasProgrammerSkill(technology)) {
                result = result + "\n" + programmer;
            }

        }
        return result;
    }
    public static int timesTechFound(Programmer[] programmers, String technology){
        int times = 0;
        for (Programmer programmer : programmers){
            if(programmer.hasProgrammerSkill(technology)){
                times += 1;
            }
        }
        return times;
    }

    public static Programmer[] sortedProgrammers(Programmer[] programmers, String technology) {
        Programmer[] tempResult = new Programmer[timesTechFound(programmers, technology)];
        int lastResultIndex = 0;

        for (Programmer programmer : programmers) {
            if (programmer.hasProgrammerSkill(technology)){
                tempResult[lastResultIndex] = programmer;
                   lastResultIndex = lastResultIndex +1;
            }

        }
        return tempResult;
    }

}