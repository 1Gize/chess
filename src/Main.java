public class Main {
    public static void main(String args[]) {
        //  System.out.print("hello");
        Board b = new Board();
        b.printBoard();
        Bishop bp = new Bishop("Black bishop", new Coordinate('C', 3));
        //bp.allowedMoves();
        //bp.printMoves();
        Rook rook = new Rook("White rook", new Coordinate('C', 5));
        rook.allowedMoves();
        //rook.printMoves();
        Knight knight = new Knight("White knight", new Coordinate('D', 4 ));
        //knight.allowedMoves();
        //knight.printMoves();
        Queen qq = new Queen("white queen", new Coordinate('D',4));
        qq.allowedMoves();
        qq.printMoves();
    }
}
