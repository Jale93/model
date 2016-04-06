package zooproject;

public abstract class Animal {
    protected int age;
    protected char gender;
    protected String [] eats;
    protected int health;
    protected int lifeExpenctancy;
    Enclosure enclosure;

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }
    
    // getAge(), getGender(), getLifeExpectancy(), canEat(String)

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getLifeExpenctancy() {
        return lifeExpenctancy;
    }
    public boolean canEat(String eat){
        boolean available = false;
        for (String item : eats) {
            if(item.equals(eat)){
                available = true;
                break;
            }
            
        }
        return available;
    }
    
    public  void eat(){
        
    }
    public  void aMonthPasses(){
        
    }
    public  void decreaseHealth(){
        
    }
    public abstract void treat();
}
