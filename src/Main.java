public class Main {
    public static void main(String args[]) {
        //  System.out.print("hello");
        Board b = new Board();
        b.printBoard();
        Bishop bp = new Bishop("Black bishop", new Coordinate('C', 3));
        //System.out.println(Integer.valueOf("H"));
        //bp.allowedMoves();
        //bp.printMoves();
        Rook rook = new Rook("White rook", new Coordinate('C', 5));
        rook.allowedMoves();
        rook.printMoves();
    }
}
