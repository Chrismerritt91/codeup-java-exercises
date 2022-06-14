import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person array[], Person name){
        Person[] newPeople;
        newPeople = Arrays.copyOf(array, array.length + 1);
        newPeople[newPeople.length-1] = name;
        return newPeople;

    }

    public static void main(String[] args) {

        Person person1 = new Person("steve");
        Person person2 = new Person("adam");
        Person person3 = new Person("mark");
        Person person4 = new Person("stacy");

        Person[] people = {person1, person2, person3};

//        for(Person person: people){
//            System.out.println(person.getName());
//        }

        Person[] newPeople = ArraysExercises.addPerson(people, new Person("mary"));
        for(Person person: newPeople){
            System.out.println(person.getName());
        }
    //or
//        Person[] newPeople = ArraysExercises.addPerson(people, person4);
//        for(Person person: newPeople){
//            System.out.println(person.getName());
//        }
    }


}
