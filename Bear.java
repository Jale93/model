
package zooproject;

public class Bear extends Animal{

    public Bear() {
        eats = new String[]{"fish","steak"};
        lifeExpenctancy = 18;
    }
     public void hug(){
         health += 3;
     }
    @Override
    public void treat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
