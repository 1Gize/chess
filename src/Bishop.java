import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece{
    Bishop(String name, Coordinate cor) {
        super(name, cor);
    }

    @Override
    public List<Coordinate> allowedMoves() {
        List<Coordinate> aM = new ArrayList<>();
        boolean isThereMore = true;
        while(isThereMore){

            isThereMore = false;
        }
        return super.allowedMoves();
    }
}
