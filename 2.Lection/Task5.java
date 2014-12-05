import java.util.Scanner;

/**
 * Created by Asus on 2.12.2014 г..
 */
public class Task5 {
    public  static void main(String args[]){
        Scanner input=new Scanner(System.in,"UTF-8");
        System.out.println("Enter your points from 1 to 9: ");
        int points=input.nextInt();

        if(points>=1 && points<=3){
            points=points*5;
            System.out.println("POINTS: "+points);
        } else if(points>=4 && points<=6) {
            points = points * 10;
            System.out.println("POINTS: "+points);
        } else if(points>=7 && points<=9){
            points=points*50;
            System.out.println("POINTS: "+points);
        } else{
            System.out.println("Invalid points!");
        }
    }
}
