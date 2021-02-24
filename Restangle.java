package figure;

public class Restangle extends Figures {
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private double f;
    public Restangle(Point a,Point b,Point c,Point d){
        super();
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    public Restangle() {
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

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }
    public Point getD() {
        return d;
    }
    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }
    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public double getArea() {
        double al=a.getDistance(b);
        double bl=a.getDistance(c);
        f=al*bl;
        return f;
    }


    @Override
    public double getPerimetr(){
     return a.getDistance(b)+ b.getDistance(d)+a.getDistance(c)+c.getDistance(d);
    }
    @Override
    public String toString() {
        return " Прямоугольник , "+ " периметр "+String.format("%.3f",getPerimetr())+" площадь "+String.format("%.3f",getArea());
    }

}
