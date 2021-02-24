package figure;

public class Circle extends Figures {
    private Point a;
    private Point b;
    private double f;

    public Circle(Point a,Point b){
        super();
        this.a=a;
        this.b=b;
     }
    public Circle() {
        super();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }
    @Override
    public double getArea() {
        double al=a.getDistance(b);
        f=3.14*Math.pow(al, 2);
        return f;
    }


    @Override
    public double getPerimetr(){
        return 2*3.14*a.getDistance(b);
    }
    @Override
    public String toString() {
        return " Круг , "+ " длина окружности "+String.format("%.3f",getPerimetr())+" площадь "+String.format("%.3f",getArea());
    }

}


