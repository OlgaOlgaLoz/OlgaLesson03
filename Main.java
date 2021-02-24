package figure;
import java.lang.reflect.Method;
public class Main {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        Point c = new Point(3, 0);
        Point d = new Point(3, 4);

        Triangular aTriangular = new Triangular(a, b, c);
        Restangle aRestangle = new Restangle(a, b, c, d);
        Circle aCircle = new Circle(a, c);
        Circle bCircle = new Circle(b, c);

        Figures[] params= new Figures[4];
        params[0]=aTriangular;
        params[1]=aRestangle;
        params[2]=aCircle;
        params[3]=bCircle;

        Board1 aBoard1 = new Board1(params);
       // aBoard1.remove(3);
       //   aBoard1.add(bCircle,3);
        System.out.println(aBoard1.toString());
     }
}
