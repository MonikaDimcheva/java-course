import java.util.Scanner;

/**
 * Created by Asus on 30.11.2014 г..
 */
public class FirstProject {
    public  static  void main(String args[]) {


        Scanner input = new Scanner(System.in, "UTF-8");
        System.out.println("Enter string: ");
        String one = input.nextLine();
        System.out.println("Enter number 1: ");
        int two = input.nextInt();
        System.out.println("Enter number 2: ");
        int three = input.nextInt();

        boolean a=one.length()>10;
        System.out.println("String length= " +one.length() + "\nString length > 10 ? : "+a);
        boolean b=two>three;
        System.out.println("First number: "+two+"\nSecond number: "+three+"\nFirst number>Second number? : "+b);
        boolean c=(three>=-100 && three<15);
        System.out.println("The number is: "+three+"\nIs the number in the interval between{-100;15]? : "+c);
        int four=two%three;
        System.out.println("Ostatak ot delene na number 1 s number 2: "+four);
        boolean f=(two>10 || three<88);
        System.out.println("Number 1 e: " +two+ ">10 ili number 2 e: " + three+ "<88: " +f);


    }
}
