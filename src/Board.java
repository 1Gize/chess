import java.util.ArrayList;
import java.util.List;

public class Board {
    public List<Piece> whitePieces = new ArrayList<>();
    public List<Piece> blackPieces = new ArrayList<>();
   Field[][] board;
    Board(){
       board = new Field[][]{
               {new Field(new Coordinate('A', 1)),
                       new Field(new Coordinate('A', 2)),
                       new Field(new Coordinate('A', 3)),
                       new Field(new Coordinate('A', 4)),
                       new Field(new Coordinate('A', 5)),
                       new Field(new Coordinate('A', 6)),
                       new Field(new Coordinate('A', 7)),
                       new Field(new Coordinate('A', 8))},
               {new Field(new Coordinate('B', 1)),
                       new Field(new Coordinate('B', 2)),
                       new Field(new Coordinate('B', 3)),
                       new Field(new Coordinate('B', 4)),
                       new Field(new Coordinate('B', 5)),
                       new Field(new Coordinate('B', 6)),
                       new Field(new Coordinate('B', 7)),
                       new Field(new Coordinate('B', 8))},
               {new Field(new Coordinate('C', 1)),
                       new Field(new Coordinate('C', 2)),
                       new Field(new Coordinate('C', 3)),
                       new Field(new Coordinate('C', 4)),
                       new Field(new Coordinate('C', 5)),
                       new Field(new Coordinate('C', 6)),
                       new Field(new Coordinate('C', 7)),
                       new Field(new Coordinate('C', 8))},
               {new Field(new Coordinate('D', 1)),
                       new Field(new Coordinate('D', 2)),
                       new Field(new Coordinate('D', 3)),
                       new Field(new Coordinate('D', 4)),
                       new Field(new Coordinate('D', 5)),
                       new Field(new Coordinate('D', 6)),
                       new Field(new Coordinate('D', 7)),
                       new Field(new Coordinate('D', 8))},
               {new Field(new Coordinate('E', 1)),
                       new Field(new Coordinate('E', 2)),
                       new Field(new Coordinate('E', 3)),
                       new Field(new Coordinate('E', 4)),
                       new Field(new Coordinate('E', 5)),
                       new Field(new Coordinate('E', 6)),
                       new Field(new Coordinate('E', 7)),
                       new Field(new Coordinate('E', 8))},
               {new Field(new Coordinate('F', 1)),
                       new Field(new Coordinate('F', 2)),
                       new Field(new Coordinate('F', 3)),
                       new Field(new Coordinate('F', 4)),
                       new Field(new Coordinate('F', 5)),
                       new Field(new Coordinate('F', 6)),
                       new Field(new Coordinate('F', 7)),
                       new Field(new Coordinate('F', 8))},
               {new Field(new Coordinate('G', 1)),
                       new Field(new Coordinate('G', 2)),
                       new Field(new Coordinate('G', 3)),
                       new Field(new Coordinate('G', 4)),
                       new Field(new Coordinate('G', 5)),
                       new Field(new Coordinate('G', 6)),
                       new Field(new Coordinate('G', 7)),
                       new Field(new Coordinate('G', 8))},
               {new Field(new Coordinate('H', 1)),
                       new Field(new Coordinate('H', 2)),
                       new Field(new Coordinate('H', 3)),
                       new Field(new Coordinate('H', 4)),
                       new Field(new Coordinate('H', 5)),
                       new Field(new Coordinate('H', 6)),
                       new Field(new Coordinate('H', 7)),
                       new Field(new Coordinate('H', 8))}
       };
   }
   public void printBoard(){
       for(Field[] x: board){
           for(Field field : x){
            field.printState();
            System.out.print(" ");
           }
           System.out.println();
       }
   }
   public Field findField(Coordinate cor){
       for(Field[] f : board){
           for(Field field : f){
           }
       }
       return null;
   }
   public void addPiece(Piece piece){

   }
}
