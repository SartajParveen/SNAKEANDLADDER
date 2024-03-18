package game;
import board.Board;
import coordinates.Coordinates;
import player.Player;
import dice.Dice;
import jumper.Jumper;
public class Game {
    Board board;
    Player pl[];
    boolean isAllowed[];
    Coordinates places[];
    Dice dice;
    int turn;
    public Game(Board board,Player pl[],Dice dice){
        this.board=board;
        this.pl=pl;
        this.dice=dice;
        turn=0;
        isAllowed=new boolean[pl.length];
        places=new Coordinates[pl.length];
        for(int i=0;i<pl.length;i++) places[i]=new Coordinates(board.size-1, 0);


    }
    public void play(){
        while(true){
            int num=dice.diceRoll();
            System.out.println(" player: "+pl[turn].getPlayer()+" rolled -> "+"["+places[turn].getRow()+","+places[turn].getCol()+"]");
            if(!isAllowed[turn]){
                if(num!=1){
                    turn=1-turn;
                    continue;
                }
                else{
                    isAllowed[turn]=true;
                }
            }
            Coordinates c= getnewCoordinates(places[turn],num);
            if(c.getRow()<0){
                System.out.println(pl[turn].getPlayer()+" end coordinates "+"["+c.getRow() +","+ c.getCol()+"]");
                System.out.println("so"+ pl[turn].getPlayer()+" is the winner");
                return ;
            }
            places[turn]=c;
            turn=1-turn;

        }
    }
        Coordinates getnewCoordinates(Coordinates old,int n){
            int row=old.getRow();
            int col = old.getCol();
            while(n>0){
                if(row%2!=0){
                    if(col==board.size-1){
                        row--;
                    }
                    else{
                        col++;
                    }
                }
                else{
                    if(col==0){
                        row--;
                    }
                    else{
                        col--;
                    }
                }
                n--;
            }
                if(row<0){
                    return new Coordinates(row,col);
                }
                if(checkIfJumperExits(row,col)){
                    Jumper j = board.jumpers.get(board.board[row][col]);
                    return j.end;
                }
                return new Coordinates(row,col);
            
        }
        boolean checkIfJumperExits(int row,int col){
            return (board.jumpers.containsKey(board.board[row][col]));
        }

    }

