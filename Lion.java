package zooproject;

public class Lion extends BigCat {

    public Lion() {
        eats = new String[]{"steak", "celery"};
        lifeExpenctancy = 24;
    }

    public void stroked() {
        health += 2;
    }

    @Override
    public void treat() {
        stroked();
    }

}
