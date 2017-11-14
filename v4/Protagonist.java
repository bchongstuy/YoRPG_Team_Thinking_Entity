//Team 3: Team Thinking Entity - Jude Grodesky, Brandon Chong, Ricky Lin
//APCS1 pd02
//HW28 -- Ye Olde Role Playing Game, Improved
//2017-11-11

public class Protagonist extends Character{
    
    //Attributes every Protagonist needs
    protected String name;
    
    //constructor (customizable name)
    public Protagonist (String newName){
	name = newName;
	HP = 100;
	strength = 50;
	defense = 50;
	attack_rating = 0.5;
    }

    //Accessor for name
    public String getName(){
	return name;
    }

    //Attacks a monster and deals damage
    public int attack(Monster m){
	int damage = (int)(strength * attack_rating) - m.getDefense();
	if (damage < 0){
	    damage = 0;
	}
	m.lowerHP(damage);
	return damage;
    }

   //Ready's a special attack by reducing defence and increasing attack
    public void specialize(){
	defense -= 25;
	attack_rating += 0.5;
    }
    
    //Resets for a normal attack by reducing attack and increasing defense
    public void normalize(){
	defense += 25;
	attack_rating -= 0.5;
    }

    
    
}
