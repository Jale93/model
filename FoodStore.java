
package zooproject;

import java.util.HashMap;

public class FoodStore {
    
    HashMap<String,Integer> foods = null; 

    public FoodStore() {
        foods = new HashMap();
    }
    
  public void addFood(String food,int quantity){
      if(foods.containsKey(food)){
          int currentQuantity = foods.get(food);
          foods.put(food, currentQuantity+quantity);
          if(currentQuantity > 0){
              
          }
      }
  }  
  public void takeFood(String food){
    if(foods.containsKey(food)){
        int currentQuantity  = foods.get(food);
        if(currentQuantity > 0){
            foods.put(food,currentQuantity - 1);
            
        }
        else{
            System.out.println("Sorry, no more "+food);
        }
    }  
    else{
        System.out.println("Sorry,you don't take non existing food");
    }
  }
      
  }

