package Gaming;

public class Player2 extends Player1{
	private int health;
	private boolean armour;
	
	public Player2(String name, String weapon, int health, boolean armour) {
		super(name,weapon,health);
		if(health < 0 || health > 100 ) {
			this.health = 100;
		}
		else {
		this.health = health;
		
		}
		this.armour = armour;
	}
	
  
	@Override
	public void damagedByGun1() {
		if(armour) {
		this.health -=20;
		if(this.health <=0) this.health= 0;
		System.out.println("Armour is ON.Got hit by gun 1. Health is reduced by 20. New health is "+this.health);
	}
	if(!armour) {
		this.health -=30;
		if(this.health <=0) this.health= 0;
		System.out.println("Armour is OFF.Got hit by gun 1. Health is reduced by 30. New health is "+this.health);
	}
	if (this.health == 0) {
		System.out.println(getName()+" is dead");
	}
		
	}


	@Override
	public void damagedByGun2() {
		if(armour) {
		    this.health -=40;
	     	if(this.health <=0) this.health= 0;
		    System.out.println("Armour is ON.Got hit by gun 1. Health is reduced by 40. New health is "+this.health);
	    }
	    if(!armour) {
		    this.health -=50;
		    if(this.health <=0) this.health= 0;
		    System.out.println("Armour is OFF.Got hit by gun 1. Health is reduced by 50. New health is "+this.health);
	   }
	   if (this.health == 0) {
		   System.out.println(getName()+" is dead");
	  }
		
	}


	@Override
	public void Heal() {
		if(this.health <=0) {
			System.out.println("Heal is not possible");
		}
		else {
			this.health = 100;
			System.out.println("healed health is "+ this.health);
		}
	}
	
	
	
	
    
}
