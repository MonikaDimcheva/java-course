import java.util.Scanner;

/**
 * Created by Asus on 30.11.2014 г..
 */
public class Task2 {
    public  static void main (String  args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first side of a triangle: ");
        int firstSide=input.nextInt();
        System.out.println("Enter second side of a triangle: ");
        int secondSide=input.nextInt();
        System.out.println("Enter third side of a triangle: ");
        int thirdSide=input.nextInt();

        boolean a = (firstSide+secondSide>thirdSide);
        boolean b =(firstSide+thirdSide>secondSide);
        boolean c =(secondSide+thirdSide>firstSide);

        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
        System.out.println("c is: "+c);

        if(a && b && c){
            System.out.println("This triangle is possible");
        } else {
            System.out.println("This triangle is IMPOSSIBLE");
        }

    }
}
