/**
 * 
 */

/**
 * @author Viral
 *@version 1.0
 */
public class Hero {
	
	private int strength;
	private int speed;
	private int health;
	public String name;
	
	private Hero(String name) {
		this.name = name;
		generateAbilities();
	}
	
	private void generateAbilities() {
		
		this.strength = (int)(Math.random()*100+1);
		this.speed = (int)(Math.random()*100+1);
		this.health = (int)(Math.random()*100+1);
	}
	
	public void fight() {
		hitAttempt();
	}
	
	private boolean hitAttempt() {
		int check = (int)(Math.random()*100+1);
		if(check > 1 && check < 21) {
			hitDamage();
			return true;
		}
		else {
		return false;
		}
	}
	
	private int hitDamage() {
		int damage = strength * (int)(Math.random()*6+1);
		return damage;
	}
	
	public void show() {
		System.out.println("Strength:" + this.strength);
		System.out.println("Speed:" + this.speed);
		System.out.println("health:" + this.health);
		
	}

}
