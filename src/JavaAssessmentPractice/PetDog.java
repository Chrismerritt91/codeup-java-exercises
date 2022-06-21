package JavaAssessmentPractice;

import java.util.ArrayList;

public class PetDog extends Pet implements Companion {

    private boolean trained;

    public PetDog(){}

    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }

    public boolean isTrained() {
        return trained;
    }

    @Override
    public String snuggle() {
        return getName() + " wants to snuggle";
    }

    public void allSnuggle(ArrayList<PetDog> dogs){
        for(PetDog pup: dogs){
            System.out.println(pup.snuggle());
        }
    }
}
