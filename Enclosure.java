
package zooproject;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    private FoodStore foodStore;
    private int waste;
   private List<Animal> animals ;

    public Enclosure() {
        this.waste = waste;
        this.animals = new ArrayList();
        this.foodStore = new FoodStore();
    }
  public void addAnimal(Animal animal){
      animals.add(animal);
  } 
  public void removeAnimal(Animal animal){
      animals.remove(animal);
  }
  public void removeWaste(int waste){
      this.waste -= waste;
      if(this.waste < 0){
          this.waste = 0;
      }
  }
   public void addWaste(int waste){
      this.waste += waste;
  }

    public FoodStore getFoodStore() {
        return foodStore;
    }

    public int getWaste() {
        return waste;
    }
   
   public int size(){
     return animals.size();
   }
   public void aMonthPasses(){
       for (Animal animal : animals) {
           animal.aMonthPasses();
       }
   }
}
