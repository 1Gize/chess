public class Main {
    public static void main(String args[]){
        //  System.out.print("hello");
        Board b = new Board();
        b.printBoard();
    Bishop bp = new Bishop("Black bishop",new Coordinate('C',3));
    //System.out.println(Integer.valueOf("H"));
    bp.allowedMoves();
    for(Coordinate c: bp.allMoves){
        System.out.print(c.toString() + ", ");
        }
    }
}
