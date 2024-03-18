package board;
import jumper.Jumper;
import java.util.*;

public class Board {
    public int size;
    public String board[][];
    public HashMap<String,Jumper> jumpers;
    
    public Board(int size,HashMap<String,Jumper> jumpers ){
        this.size=size;
        board=new String[size][size];
        this.jumpers=jumpers;
        int k=1;
        for(int i=size-1;i>=0;i--){
            
                if(i%2!=0){
                    for(int j=0;j<size;j++){
                    board[i][j]=k+"";
                    k++;
                    }
                }
                else{
                    for(int j=size-1;j>=0;j--){
                    board[i][j]=k+"";
                    k++;
                    }
                }
        }
    }
    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(board[i][j]+" ");
                if(board[i][j].length()==1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

