//Team 3: Team Thinking Entity - Jude Grodesky, Brandon Chong, Ricky Lin
//APCS1 pd02
//HW30 -- Ye Olde Role Playing Game , Improved
//2017-11-11

abstract class Character{

    //Attributes every Character needs
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attack_rating;

    public abstract String about();
    
    //returns whether the Character is alive or dead
    public boolean isAlive(){
	if (HP <= 0){
	    return false;
	}
	return true;
    }

    //Accessor for defense
    public int getDefense(){
	return defense;
    }

    //Reduces Character's HP
    public void lowerHP(int loss){
	HP -= loss;
    }

    //Calculates attacks
    public int attack(Character c){
	int damage = (int)(strength * attack_rating) - c.getDefense();
	if (damage < 0){
	    damage = 0;
	}
	c.lowerHP(damage);
	return damage;
    }
}
