//Team 3: Team Thinking Entity - Jude Grodesky, Brandon Chong, Ricky Lin
//APCS1 pd02
//HW28 -- Ye Olde Role Playing Game, Improved
//2017-11-11

public class Monster extends Character{

    //Attributes every Monster has
    

    //Inintializes instance varibales
    public Monster() {
	HP = 150;
	strength = (int)(Math.random() * 45) + 50;
	defense = 20;
	attack_rating = 1;
    }

    public String about() {
	return "A normal monster approaches";
    }
    
    //Attacks a warrior and deals damage
    public int attack(Protagonist w){
	int damage = (int)(strength * attack_rating) - w.getDefense();
	if (damage < 0){
	    damage = 0;
	}
	w.lowerHP(damage);
	return damage;
    }
}
