package zooproject;

public class Tiger extends BigCat {

    public Tiger() {
        eats = new String[]{"steak", "celery"};
        lifeExpenctancy = 24;
    }

    public void stroked() {
        health += 3;
    }

    @Override
    public void treat() {
        stroked();
    }

}
