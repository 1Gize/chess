import java.util.ArrayList;
import java.util.List;

public abstract class Piece{
    Piece(String name, Coordinate cor){
        this.name = name;
        this.cor = cor;
    }
    public final  int valueOfA = 65;
    public final int valueOfH = 72;
    private String name;
    public Coordinate cor;
    public List<Coordinate> allMoves = new ArrayList<>();
    public List<Coordinate> allowedMoves() {
        return null;
    }
    public void printMoves(){
    }
    public void makeMove(){

    }
}
