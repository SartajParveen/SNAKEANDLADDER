import player.Player;
import coordinates.Coordinates;
import dice.Dice;
import jumper.Jumper;
import board.Board;
import game.Game;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Player pl = Player.setPlayerDetailsFromUser();
        Player p2 = Player.setPlayerDetailsFromUser();
        System.out.println("player1 name:"+pl.getPlayer());
        System.out.println("player2 name:"+p2.getPlayer());

        Dice d = new Dice();
        HashMap<String,Jumper> map = new HashMap<>();
        map.put("6",new Jumper(new Coordinates(9,5),new Coordinates(3,5)));
        map.put("16",new Jumper(new Coordinates(9,5),new Coordinates(4,5)));
        map.put("22",new Jumper(new Coordinates(9,5),new Coordinates(8,5)));
        map.put("43",new Jumper(new Coordinates(9,5),new Coordinates(9,5)));
        map.put("59",new Jumper(new Coordinates(9,5),new Coordinates(7,5)));
        map.put("67",new Jumper(new Coordinates(9,5),new Coordinates(3,9)));
        Board bd = new Board(10,map);
        Game g = new Game(bd,new Player[]{pl,p2},d);
        g.play();
    }
}
