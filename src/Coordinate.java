public class Coordinate{
    private char xCord;
    private int yCord;
    Coordinate(char x,int y){
        xCord = x;
        yCord = y;
    }
    public String toString(){
        String end =  xCord + Integer.toString(yCord);
        return end;
    }
    public char getX(){
        return xCord;
    }
    public int getY(){
        return yCord;
    }
}
