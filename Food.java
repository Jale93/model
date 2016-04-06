
package zooproject;

public class Food {
  private int waste;
 private int health;
  private String name;

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
    public Food() {
        this.name = "";
        this.waste = 0;
        this.health = 0;
    }

    public Food( String name,int health,int waste ) {
        this.waste = waste;
        this.health = health;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" + "waste=" + waste + ", health=" + health + ", name=" + name + '}';
    }
 
  
}
