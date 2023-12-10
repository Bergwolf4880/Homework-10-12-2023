
public class Main {
    public static void main(String[] args) {


        String techToSearch = "Java";

        Person person = new Person("Vassili", "Pupkin");

        Programmer[] programmers = {
                new Programmer(new Person("Georgij", "Knigov"), new String[]{"Java", "SQL", "Spring Boot"}),
                new Programmer("Alexej", "Serov", new String[]{"C#", "PHP", "SQL"}),
                new Programmer(person, "Java, SQL, Spring Boot"),
                new Programmer("Vitaly Zuckermann", new String[]{"Java", "Rust", "SQL"})
        };

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