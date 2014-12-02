/**
 * Created by Asus on 2.12.2014 г..
 */
public class Task4 {
    public  static void main(String args[]){
        int edno=1;
        int dve=3;

        System.out.println("Chislo edno e: " +edno+"\nChislo dve e: "+dve);
        edno = edno^dve;
        dve = dve^edno;
        edno = edno^dve;

        System.out.println("Chislo edno e: "+edno+"\nChislo dve e: "+dve);

    }
}
