public class Field {
    public Coordinate coordinate;
    public Piece piece= null;
    Field(Coordinate c){
        coordinate = c;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    public void printState(){
        if(piece != null){
            System.out.print(piece.name);
        }else{
            System.out.print(coordinate.toString());
        }
    }
}
