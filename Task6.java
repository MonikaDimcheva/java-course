import java.util.Scanner;

/**
 * Created by Asus on 2.12.2014 г..
 */
public class Task6 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("Въведи карта (2,3,4,5,6,7,8,9,10,J,Q,K,A) : ");
        String b = input.nextLine();
        char a = b.charAt(0);
        String d = "10";

        if (b.equals(d)) {
            System.out.println("Валидна карта!10");
            return;

        } else if (b.length() > 1) {
            System.out.print("Невалидно число за карта!Картата трябва да бъде от следния интервал===> " +
                    "(2,3,4,5,6,7,8,9,10,J,Q,K,A)\n Въведи нова карта:\n ");
            a=input.next().charAt(0);
        }

        switch(a) {

            case '2':
                System.out.println("Валидна карта!2");
                break;
            case '3':
                System.out.println("Валидна карта!3");
                break;
            case '4':
                System.out.println("Валидна карта!4");
                break;
            case '5':
                System.out.println("Валидна карта!5");
                break;
            case '6':
                System.out.println("Валидна карта!6");
                break;
            case '7':
                System.out.println("Валидна карта!7");
                break;
            case '8':
                System.out.println("Валидна карта!8");
                break;
            case '9':
                System.out.println("Валидна карта!9");
                break;
            case 'J':
                System.out.println("Валидна карта!J");
                break;
            case 'A':
                System.out.println("Валидна карта!A");
                break;
            case 'K':
                System.out.println("Валидна карта!K");
                break;
            case 'Q':
                System.out.println("Валидна карта!Q");
                break;
                default:
                    System.out.println("НЕвалидна карта!");

        }

    }
}
