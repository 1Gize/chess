import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece{
    Bishop(String name, Coordinate cor) {
        super(name, cor);
    }

    @Override
    public List<Coordinate> allowedMoves() {
        boolean isThereMore = true;
        for(int x= 1; x < 8; x++){
            if(cor.getX() - x >= valueOfA && cor.getY() - x >= 1) {
                allMoves.add(new Coordinate((char)(cor.getX()- x),cor.getY() - x ));
            }
            if(cor.getX() + x <= valueOfH && cor.getY() + x <= 8){
                allMoves.add(new Coordinate((char)(cor.getX() + x),cor.getY() + x));
            }
            if(cor.getX() + x <= valueOfH && cor.getY() - x >= 1){
                allMoves.add(new Coordinate((char)(cor.getX() + x),cor.getY() - x));
            }
            if(cor.getX() - x >= valueOfA && cor.getY() + x <= 8){
                allMoves.add(new Coordinate((char)(cor.getX() - x),cor.getY() + x));
            }
        }
        return allMoves;
    }
}
