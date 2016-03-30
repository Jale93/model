package interfaceexample;

import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        List<Ucan> ucanlar = new ArrayList();
        List<Uzen> uzenler = new ArrayList();
        List<Qacan> qacanlar = new ArrayList();
        List<Yeriyen> yeriyenler = new ArrayList();
        Insan i = new Insan();
        Ordek o = new Ordek();
        Baliq b = new Baliq();
        ucanlar.add(o);
        uzenler.add(b);
        uzenler.add(o);
        uzenler.add(i);
        qacanlar.add(i);
        qacanlar.add(o);
        yeriyenler.add(o);
        yeriyenler.add(i);
        System.out.println("Qacanlar:");
        for (Qacan qac : qacanlar) {
            System.out.println(qac);
        }
        System.out.println("Ucanlar:");
        for (Ucan uc : ucanlar) {
            System.out.println(uc);
        }
        System.out.println("------------------------------");
        System.out.println("Uzenler:");
        for (Uzen uz : uzenler) {
            System.out.println(uz);
        }
        System.out.println("------------------------------");
        System.out.println("Yeriyenler:");
        for (Yeriyen yeri : yeriyenler) {
            System.out.println(yeri);
        }
    }

}
