import java.util.List;

public abstract class Piece{
    Piece(String name, Coordinate cor){
        this.name = name;
        this.cor = cor;
    }
    private String name;
    public Coordinate cor;

    public List<Coordinate> allowedMoves() {
        return null;
    }
    public void printMoves(){
    }
    public void makeMove(){

    }
}
