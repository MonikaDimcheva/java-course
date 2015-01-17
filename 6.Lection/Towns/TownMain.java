import java.util.HashSet;


public class TownMain {
	public static void main(String[] args) {
		
		Town samokov=new Town("Samokov","Bulgaria","Bulgari");
		Town paris=new Town("Paris","France","Francois");
		Town bern=new Town("Bern","Germany","German");
		Town london=new Town("London","England","English");
		Town athens=new Town("Athens","Greece","Greek");
		
		
		HashSet<Town> towns = new HashSet<Town>();
		
		towns.add(samokov);
		towns.add(paris);
		towns.add(bern);
		towns.add(london);
		towns.add(athens);
		
		
		System.out.println(towns);
		
		System.out.println(towns.contains(samokov));
		
		towns.remove(bern);
		System.out.println(towns);
	}

}
