package zooproject;

public class Giraffe extends Animal {

    public Giraffe() {
        eats = new String[]{"hay", "fruit"};
        lifeExpenctancy = 28;
    }

    public void neckMassage() {
        health += 4;
    }

    @Override
    public void treat() {
        neckMassage();
    }

}
