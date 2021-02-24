package figure;

public class Triangular extends Figures {
    private Point a;
    private Point b;
    private Point c;
    private double f;
    public Triangular(Point a,Point b,Point c){
        super();
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public Triangular() {
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

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    @Override
   public double getArea() {
     double al=a.getDistance(b);
       double bl=b.getDistance(c);
       double cl=c.getDistance(a);
       double p=(al+bl+cl)/2;
        setF(Math.sqrt(p*(p-al)*(p-bl)*(p-cl)));
       return f;
      }


    @Override
    public double getPerimetr(){
      return a.getDistance(b)+ b.getDistance(c)+c.getDistance(a);

    }
    @Override
    public String toString() {
        return " Треугольник , "+ " периметр "+String.format("%.3f",getPerimetr())+" площадь "+String.format("%.3f",getArea());
    }

}
