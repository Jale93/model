package zooproject;

public class Elephant extends Animal {

    public Elephant() {
        eats = new String[]{"hay", "fruit"};
        lifeExpenctancy = 36;
    }

    public void bath() {
        health += 5;
    }

    @Override
    public void treat() {
        bath();
    }

}
