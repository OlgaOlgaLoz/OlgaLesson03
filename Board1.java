package figure;
import  java.util.ArrayList;
import java.lang.*;
public class Board1 {
    Figures params[];

    public Board1(Figures[] params){
     super();
     this.params=params;
    }
    public Board1(){
    super();
    }

    public double sumArea1(){
        double sum=0;
     for (int sh=0; sh<params.length; sh++){
         if (params[sh]!=null){
             sum+=params[sh].getArea();
            }
        }
       return sum;
    }
    public void remove(int i){
        params[i]=null;
    }
    public void add(Figures x , int i){
        params[i]=x;
    }


    @Override
    public String toString(){
      if (params[0]!=null) {System.out.println(params[0].toString());}
      if (params[1]!=null) { System.out.println(params[1].toString());}
      if (params[2]!=null) {System.out.println(params[2].toString());}
      if  (params[3]!=null) {System.out.println(params[3].toString());}
     return " Площадь фигур в сумме составляет "+ String.format("%.3f",sumArea1());
    }

}
