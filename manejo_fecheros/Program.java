package manejo_fecheros;
import java.util.*;

 class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }   public void getWinner(){
         int maxValor=0;
         String name=null;
         for(HashMap.Entry<String, Integer> juego:players.entrySet()){
             if(juego.getValue()>maxValor){
                 maxValor=juego.getValue();
                 name=juego.getKey();
             }
         }
         System.out.println(name);

     }
 

}

public class Program {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String name=sc.nextLine();
            int points =sc.nextInt();
            points=(Integer)points;
            game.addPlayer(name, points);
            sc.nextLine();
        }
        game.getWinner();
    }
}



