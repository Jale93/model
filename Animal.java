
package model;

public abstract class Animal {
    // eat(),treat(),decreaseHealth() methods not be declared
    int age;
    char gender ;
    String[] eats;
    Health health;
    int lifeExpectancy;
    enum Health{

        VERY_HEALLTY(10),NINE(9),EIGHT(8),SEVEN(7),SIX(6),FIVE(5),FOUR(4),THREE(3),TWO(2),ONE(1),DEAD(0);
        int health;
       private Health(int health) {
           this.health = health; 
        }
        
        
    }
    public Animal(int age, char gender, String[] eats, Health health, int lifeExpectancy) {
        this.age = age;
        this.gender = gender;
        this.eats = eats;
        this.health = health;
        this.lifeExpectancy = lifeExpectancy;
    }
    public Animal(){
        
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }
    public boolean canEat(String eat){
        boolean available = false;
        for(String item : eats){
           if(eat.equals(item)){
               available = true;
           }  
        }
        if(!available){
            return true;
        }
       else
            return false;
    }
    public abstract boolean aMonthPasses();
}
