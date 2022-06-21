package JavaAssessmentPractice;

import JavaAssessmentPractice.PetDog;

import java.util.ArrayList;

public class PetDogTest {

    public static void main(String[] args) {
        PetDog dog = new PetDog();
        PetDog dog1 = new PetDog("Buckee", "mutt", true);
        PetDog dog2 = new PetDog("Dutchess", "cocker spaniel", false);
        PetDog dog3 = new PetDog("Bell", "german shepperd/ husky", true);

        ArrayList<PetDog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

//        System.out.println(dog1.snuggle());
        dog.allSnuggle(dogs);
    }
}
