
public class Rifle {
	// instance level variables
	int rounds;
	String gunType;
	String defaultColor;
	double ammoType;

	// class constructor..showing what the class will consist of..
	public  Rifle(int rounds, String gunType, String defaultColor, double ammoType) {
		// declaring/initializing instance variables
		this.rounds = rounds;
		this.defaultColor = defaultColor;
		this.ammoType = ammoType;
		this.gunType = gunType;

		System.out.println("the number of rounds in a " + gunType + " is " + rounds + ", the default color is "
				+ defaultColor + " and the ammo it uses is " + ammoType + "mm.");

	}

	// main runs the program
	public static void main(String[] args) {
		Rifle m4 = new Rifle(30, "M4", "Black", 5.56);
		Rifle g36 = new Rifle(30, "G36", "Black", 5.56);
		Rifle scarH = new Rifle(20, "Scar-H", "Tan", 7.62);
		Rifle m16 = new Rifle(30,"M16", "Black", 5.56);
		//m4 is my rifle object.. shoot is my method
		m4.shoot();
		g36.shoot();
		scarH.shoot();
		m16.shoot();
		

	}

	// simple method to show my object doing something.
	public void shoot() {
		while (rounds > 1) {
			rounds --;
			System.out.println(gunType + " is shooting now\n" + rounds + " \nCLACK! CLACK! CLAK! CLAK! CLAK!");
			if (rounds == 1) {
				System.out.println("Magazine's Empty!! \nRELOAD!!\nRELOAD!!!\nRELAOD!!!");
				return;
			}

		}

	}
}
