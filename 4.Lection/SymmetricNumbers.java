package LectionFour;

public class SymmetricNumbers {
	public static void main(String[] args) {
		
		
		printSymmetricNums();
		
	}
public static void printSymmetricNums(){
	
		for(int number=0; number<=999; number++){
			if(number<10){
				System.out.print(number+ ",");
			} else if(number==11 || number==22 || number==33 || number==44 || number==55 ||
					  number==66 || number==77 || number==88 || number==99){
				System.out.print(number+",");
			} else if(number>=100 && number%10==1 && number<=200){
				System.out.print(number+",");
			} else if(number>=200 && number%10==2 && number<=300){
				System.out.print(number+",");
			} else if(number>=300 && number%10==3 && number<=400){
				System.out.print(number+",");
			} else if(number>=400 && number%10==4 && number<=500){
				System.out.print(number+",");
			} else if(number>=500 && number%10==5 && number<=600){
				System.out.print(number+",");
			} else if(number>=600 && number%10==6 && number<=700){
				System.out.print(number+",");
			} else if(number>=700 && number%10==7 && number<=800){
				System.out.print(number+",");
			} else if(number>=800 && number%10==8 && number<=900){
				System.out.print(number+",");
			} else if(number>=900 && number%10==9 && number<=999){
				System.out.print(number+",");
			} 
		}
		

}

}
/*    public static void printSymmetricNums(){
              for (int number=0; number<=999; number++) {
                      if(number<10){ 
                            System.out.print(number+",");
                     } else if(number==11 || number==22 || number==33 || number==44 || number==44 || number==55 ||
                               number==66 || number==77 || number==88 || number==99){
                            System.out.print(number+",");
                     
                     } else if(number>100 && number%10==number/100 ){
                            System.out.print(number+",");
                         }
               } }
                */


