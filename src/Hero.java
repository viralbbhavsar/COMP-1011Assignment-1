/**
 * 
 */

/**
 * @author Viral
 *@version 1.1
 */
public class Hero {
	
	//Private properties------------------------------------------------
	
	private int strength;
	private int speed;
	private int health;
	
	//public properties-------------------------------------------------
	
	public String name;
	
	// Constructor-----------------------------------------------------
	
	public Hero(String name) {
		this.name = name;
		generateAbilities();
	}
	
	//Public methods------------------------------------------------------
	
	public void fight() {
		hitAttempt();
	}
	
	public void show() {
		System.out.println("Strength:" + this.strength);
		System.out.println("Speed:" + this.speed);
		System.out.println("health:" + this.health);
	}
	
	//private methods----------------------------------------------------
	
	private void generateAbilities() {
		
		this.strength = (int)(Math.random()*100+1);
		this.speed = (int)(Math.random()*100+1);
		this.health = (int)(Math.random()*100+1);
	}
	
	private boolean hitAttempt() {
		int check = (int)(Math.random()*100+1);
		if(check > 1 && check < 21) {
			System.out.println("Hero has been hit.");
			hitDamage();
			return true;
		}
		else {
		return false;
		}
	}
	
	private int hitDamage() {
		int damage = strength * (int)(Math.random()*6+1);
		System.out.println("The damage is " + damage);
		return damage;
	}
}
