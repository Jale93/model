package zooproject;

import java.util.ArrayList;

public class Zoo {

    Enclosure[] enclosures;
    ArrayList<Zookeeper> zookeepers;
    private ArrayList<Food> foods;

    public Zoo() {
        foods = new ArrayList();
        foods.add(new Food("hay", 1, 4));
        foods.add(new Food("steak", 3, 4));
        foods.add(new Food("fruit", 2, 3));
        foods.add(new Food("celery", 0, 1));
        foods.add(new Food("fish", 3, 2));
        foods.add(new Food("ice-cream", 1, 3));
        enclosures = new Enclosure[5];
        for (int i = 0; i < enclosures.length; i++) {
            enclosures[i] = new Enclosure();
            enclosures[i].addAnimal(null);
        }
        int animalCount = (int) (Math.random() * 10);
        System.out.println("Creating " + animalCount + " lions");
        //Enclosure 1-lion + tiger
        for (int i = 0; i < animalCount; i++) {
            Lion l = new Lion();
            l.setEnclosure(enclosures[0]);
            enclosures[0].addAnimal(l);
            System.out.println("Adding new lion into enclosure 1");
        }
        animalCount = (int) (Math.random() * 10);
        System.out.println("Creating " + animalCount + " tigers");
        for (int i = 0; i < animalCount; i++) {
            Tiger t = new Tiger();
            t.setEnclosure(enclosures[0]);
            enclosures[0].addAnimal(t);
            System.out.println("Adding new tiger into enclosure 1");
        }
        animalCount = (int) (Math.random() * 10);
        System.out.println("Adding " + animalCount + " chimpanzee");
        for (int i = 0; i < animalCount; i++) {
            Chimpanzee c = new Chimpanzee();
            c.setEnclosure(enclosures[1]);
            enclosures[1].addAnimal(c);
            System.out.println("Adding new chimpanzee into enclosure 2");
        }
        animalCount = (int) (Math.random() * 10);
        System.out.println("Adding " + animalCount + " gorilla");

        for (int i = 0; i < animalCount; i++) {
            Gorilla g = new Gorilla();
            g.setEnclosure(enclosures[1]);
            enclosures[1].addAnimal(g);
            System.out.println("Adding new gorilla into enclosure 2");
        }
        animalCount = (int) (Math.random() * 10);
        System.out.println("Adding " + animalCount + " elephant");

        for (int i = 0; i < animalCount; i++) {
            Elephant e = new Elephant();
            e.setEnclosure(enclosures[2]);
            enclosures[2].addAnimal(e);
            System.out.println("Adding new elephant into enclosure 3");
        }
        animalCount = (int) (Math.random() * 10);
        System.out.println("Adding " + animalCount + " giraffe");

        for (int i = 0; i < animalCount; i++) {
            Giraffe girraffe = new Giraffe();
            girraffe.setEnclosure(enclosures[2]);
            enclosures[2].addAnimal(girraffe);
            System.out.println("Adding new giraffe into enclosure 3");
        }
        animalCount = (int) (Math.random() * 10);
        System.out.println("Adding "+animalCount+" penguin");

        for (int i = 0; i < animalCount; i++) {
            Penguin p = new Penguin();
            p.setEnclosure(enclosures[3]);
            enclosures[3].addAnimal(p);
            System.out.println("Adding new penguin into enclosure 4");
        }
         animalCount = (int) (Math.random() * 10);
        System.out.println("Adding "+animalCount+" penguin");

        for (int i = 0; i < animalCount; i++) {
            Bear b = new Bear();
            b.setEnclosure(enclosures[4]);
            enclosures[4].addAnimal(b);
            System.out.println("Adding new bear into enclosure 5");
        }
    }

    public ArrayList<Food> getMenu() {
        return foods;
    }

    public void aMonthPasses() {
        for (Zookeeper z : zookeepers) {
            z.aMonthPasses();
        }
        for (Enclosure enc : enclosures) {
            enc.aMonthPasses();
        }
    }
}
