
package zooproject;

public class Penguin extends Animal{

    public Penguin() {
        eats = new String[]{"fish","ice-cream"};
        lifeExpenctancy = 15;
    }
      public void watcFilm(){
          health += 2;
      }
    @Override
    public void treat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
