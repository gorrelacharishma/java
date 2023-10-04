import java.io.*;
public class ArrayDemo{
    public static void main(String args[]){
        int a[];
        a=new int[3];
        a[0]=11;
        a[1]=22;
        a[2]=33;
        System.out.println("the Array elements are");
        for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
           
        }
    }
}