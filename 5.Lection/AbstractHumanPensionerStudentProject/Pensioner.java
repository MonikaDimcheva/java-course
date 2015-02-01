public class Pensioner extends Human {

	private int pension;

	public Pensioner(String name, int pension) {
		setName(name);
		setPension(pension);

	}

	public void setPension(int pension) {
		this.pension = pension;
	}

	public int getPension() {
		return pension;
	}

	@Override
	public void identify() {
		System.out.printf("Hello!I am a pensioner!\nMy name is " + super.name);
		System.out.println(".\nMy pension is " + this.pension + ".");

	}

}
