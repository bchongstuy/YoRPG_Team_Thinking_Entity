//Team 3: Team Thinking Entity - Jude Grodesky, Brandon Chong, Ricky Lin
//APCS1 pd02
//HW30 -- Ye Olde Role Playing Game , Improved
//2017-11-11

public class Character{

    //Attributes every Character needs
    private int HP;
    private int strength;
    private int defense;
    private double attack_rating;

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
    public int lowerHP(int loss){
	HP -= loss;
    }

    //Calculates attacks
    public int attack(Monster m){
	int damage = (int)(strength * attack_rating) - m.getDefense();
	if (damage < 0){
	    damage = 0;
	}
	m.lowerHP(damage);
	return damage;
    }
}
