
package arraylinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayLinkedList {

    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        Random r = new Random();
        //ADD ARRAYLIST
        long beginAddTime = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
           int value = r.nextInt(100);
           arrayList.add(value);
        }
        System.out.println(arrayList);
        long endAddTime = System.currentTimeMillis();
        //ADD LINKEDLIST
        long beginAddTime2 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
           int value = r.nextInt(100);
           linkedList.add(value);
        }
        System.out.println(linkedList);
        long endAddTime2 = System.currentTimeMillis();
        //GET ARRAYLIST
        long beginGetTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            arrayList.get(i);
        }
        System.out.println(arrayList);
        long endGetTime = System.currentTimeMillis();
        //GET LINKEDLIST
        long beginGetTime2 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            linkedList.get(i);
        }
        System.out.println(linkedList);
        long endGetTime2 = System.currentTimeMillis();
        //REMOVE ARRAYLIST
        long beginRemoveTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            arrayList.remove(i);
        }
        System.out.println(arrayList);
        long endRemoveTime = System.currentTimeMillis();
        //REMOVE LINKEDLIST
        long beginRemoveTime2 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            linkedList.remove(i);
           
        }
        System.out.println(linkedList);
        long endRemoveTime2 = System.currentTimeMillis();
        System.out.println("---------------------------------------------------");    
        System.out.println("ARRAYLIST  GETTime   ADDTime   REMOVETime");
        System.out.print("             "+(endGetTime-beginGetTime)+"      "+(endAddTime-beginAddTime)+"        "+(endRemoveTime-beginRemoveTime));
        System.out.println("");
        System.out.println("LINKEDLIST  GETTime   ADDTime   REMOVETime");
        System.out.print("             "+(endGetTime2-beginGetTime2)+"      "+(endAddTime2-beginAddTime2)+"        "+(endRemoveTime2-beginRemoveTime2));    
        System.out.println("");
    }
    
}
