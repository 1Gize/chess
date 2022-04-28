import java.util.List;

public class Rook extends Piece{
    Rook(String name, Coordinate cor) {
        super(name, cor);
    }

    @Override
    public List<Coordinate> allowedMoves() {
        for(int x = 1; x < 8; x++){
            if(cor.getX() + x <= valueOfH){
               allMoves.add(new Coordinate((char)(cor.getX()+ x), cor.getY()));
            }
            if(cor.getX() - x >= valueOfA){
                allMoves.add(new Coordinate((char)(cor.getX()-x), cor.getY()));
            }
            if(cor.getY() + x <= 8){
                allMoves.add(new Coordinate(cor.getX(),cor.getY() + x));
            }
            if(cor.getY() - x >= 1){
                allMoves.add(new Coordinate(cor.getX(), cor.getY() - x));
            }
        }
        return allMoves;
    }
}
