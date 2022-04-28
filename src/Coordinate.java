public class Coordinate{
    private String xCord;
    private int yCord;
    Coordinate(String x,int y){
        xCord = x;
        yCord = y;
    }
    public String toString(){
        String end =  xCord + yCord;
        return end;
    }
}
