package Task15;

class Point{
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void print (){
        System.out.println("(" + x + "," + y + ")");
    }

    // Scale method to bring the pointer closer to (0,0)

    public void scale(){
        x /= 2;
        y /= 2;
    }
    }

public class Tasksheet125 {
    public static void main(String[] args) {
        Point point1 = new Point(32,32);
        for (int i = 0; i <5; i++){
            point1.scale();
            point1.print();
        }
    }
}
