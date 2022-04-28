import java.util.List;

public class Knight extends Piece{
    Knight(String name, Coordinate cor) {
        super(name, cor);
    }

    @Override
    public List<Coordinate> allowedMoves() {//i dont like this method should be smaller divided into more???
            if(cor.getX() + 2 <= valueOfH){
                if(cor.getY() + 1 <= 8){
                    allMoves.add(new Coordinate((char)(cor.getX() + 2),cor.getY() + 1));
                }if(cor.getY() - 1 >= 1){
                    allMoves.add(new Coordinate((char)(cor.getX() + 2),cor.getY() - 1));
                }
            }
            if(cor.getX() - 2 >= valueOfA){
                if(cor.getY() + 1 <= 8){
                    allMoves.add(new Coordinate((char)(cor.getX() - 2),cor.getY() + 1));
                }
                if(cor.getY() - 1 >= 1){
                    allMoves.add(new Coordinate((char)(cor.getX() - 2),cor.getY() - 1));
                }
            }
            if(cor.getY() + 2 <= 8){
                if(cor.getX() + 1 <= valueOfH){
                    allMoves.add(new Coordinate((char)(cor.getX() + 1),cor.getY() + 2));
                }
                if(cor.getX() - 1 >= valueOfA){
                    allMoves.add(new Coordinate((char)(cor.getX() - 1),cor.getY() + 2));
                    }
            }
        if(cor.getY() - 2 >= 0){
            if(cor.getX() + 1 <= valueOfH){
                allMoves.add(new Coordinate((char)(cor.getX() + 1),cor.getY() - 2));
            }
            if(cor.getX() - 1 >= valueOfA){
                allMoves.add(new Coordinate((char)(cor.getX() - 1),cor.getY() - 2));
            }
        }

        return allMoves;
    }
}
