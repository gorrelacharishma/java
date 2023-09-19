import java.io.*;
import java.util.*;
class Rectangle{
     int l,b,a;
     Rectangle(){
    l=0;
    b=0;
    a=l*b;
    }
Rectangle(int x,int y){
    l=x;
    b=y;
    a=l*b;
}
Rectangle(Rectangle r)
{
    this.l=r.l;
    this.b=r.b;
    a=l*b;
}
}
public class ConstructorOverloadingDemo{
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(5,4);
        Rectangle r3=new Rectangle(r2);
        System.out.println("Area of rectangle 1 is "+ r1.a);
        System.out.println("Area of reactangle 2 is "+r2.a);
        System.out.println("Area of rectangle 3 is "+r3.a);
    }
        
}