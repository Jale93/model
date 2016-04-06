
package zooproject;

public class Chimpanzee extends Ape {

    public Chimpanzee() {
        eats = new String[]{"fruit","ice-cream"};
        lifeExpenctancy = 24;
    }

     public void playChess(){
         this.health +=4;
     }
    @Override
    public void treat() {
         playChess();
     }
    
}
