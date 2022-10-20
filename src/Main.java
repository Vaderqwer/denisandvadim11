import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print ("Сторона 1 равна:");
        int a =  in.nextInt ();
        System.out.print ("Сторона 2 равна:");
        int b = in.nextInt ();
        System.out.print ("Сторона 3 равна:");
        int c = in.nextInt ();
        System.out.print ("Формируют ли указанные стороны треугольник:" + isValidTriangle (a, b, c));
    } public static boolean isValidTriangle  (int a, int b, int c)
    {return (a + b> c && b + c> a && c + a> b);}
}