package zooproject;

public class Gorilla extends Ape {

    public Gorilla() {
        eats = new String[]{"fruit", "ice-cream"};
        lifeExpenctancy = 32;
    }

    public void painting() {
        health += 4;
    }

    @Override
    public void treat() {
        painting();
    }

}
