package Gaming;

public class Player1 {
	private String name;
	private String weapon;
	private int health;
	
	public Player1(String name, String weapon, int health) {
		this.name = name;
		this.weapon = weapon;
		if(health < 0 || health > 100 ) {
			this.health = 100;
		}
		else {
		this.health = health;
		
		}
	}
	
	public void damagedByGun1() {
		this.health -= 30;
		if(this.health <= 0) {
			this.health = 0;
		}
		System.out.println("Got hit by gun 1. Now the health is reduced by 30. New health is : "+ this.health);
		if(this.health == 0) {
			System.out.println(getName() + " is dead");
		}
	}
	public void damagedByGun2() {
		this.health -= 50;
		if(this.health <= 0) {
			this.health = 0;
		}
		System.out.println("Got hit by gun 2. Now the health is reduced by 50. New health is :" + this.health);
		if(this.health == 0) {
			System.out.println(getName() + " is dead");
		}
	}
	
	public void Heal() {
		if(this.health <=0) {
			System.out.println("Heal is not possible");
		}
		else {
			this.health = 100;
			System.out.println("healed health is "+ this.health);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	

}
