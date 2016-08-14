
public class Pistol {
	// instance level variables
	int rounds;
	String gunType;
	String defaultColor;
	int ammoType;

	// object constructor
	public Pistol(int rounds, String gunType, String defaultColor, int ammoType) {
		// declaring/initializing/setting instance level variables
		this.rounds = rounds;
		this.gunType = gunType;
		this.ammoType = ammoType;
		this.defaultColor = defaultColor;

		System.out.println("the number of rounds in a " + gunType + " is " + rounds + ", the default color is "
				+ defaultColor + " and the ammo it uses is " + ammoType + "mm.");

	}

	// main runs the program
	public static void main(String[] args) {
		Pistol m9 = new Pistol(15, "M9", "Black", 9);
		Pistol desertEagle = new Pistol(7, "Desert Eagle", "Black/Silver", 50);
		// m9 object created from pistol "class" object constructor.
		m9.shoot();

		desertEagle.shoot();

	}

	// method showing clip emptying.. just to get an idea of what's happening
	// with my object.
	public void shoot() {
		while (rounds > 1) {
			rounds--;
			System.out.println(gunType + " is shooting now\n" + rounds + " \nCLACK! CLACK! CLAK! CLAK! CLAK!");
			if (rounds == 1) {
				System.out.println("Magazine's Empty!! \nRELOAD!!\nRELOAD!!!\nRELAOD!!!");
				return;
			}

		}

	}

}
