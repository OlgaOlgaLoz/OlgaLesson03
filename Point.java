package figure;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
     super();
     this.x=x;
     this.y=y;
     }
    public Point(){
      super();

    }
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(Point a) {
     //гипотенуза
        double xL=this.x-a.getX();
        double yL=this.y-a.getY();
        return Math.sqrt(xL*xL+yL*yL);
    }


}
