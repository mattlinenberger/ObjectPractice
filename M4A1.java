
public class M4A1 {
	//instance level variables
	int magazine;
	String color;
	//constructor
	public M4A1(int magazine, String color) {
		//declare instance level variables
		this.magazine = magazine;
		this.color = color;
		System.out.println("The M4A1 carries " + magazine + " rounds and it's default color is  " + color + ".");
	}

	public static void main(String[] args) {
		M4A1 m4 = new M4A1(30, "Black");
		m4.load();
		m4.shoot();

	}
	public void shoot(){
		System.out.println("3....2....1... FIRE!");
		while(magazine > 1){
			magazine--;
			System.out.println(magazine +  " Bang!\n ");
		}
		if(magazine == 1){
			System.out.println("Your empty!");
			return;
		}
	}
	public void load(){
		System.out.println("Loading the rifle! Locked and loaded!");
		return;
	}
	



	

	

}
