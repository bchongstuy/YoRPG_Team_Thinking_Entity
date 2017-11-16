public class Warrior extends Protagonist{

    public Warrior (String name){
	super(name);
	strength += 25;
    }

    public String about(){
	return "A warrior has trained with a fearsome sword, giving him more strength";
    }

    public void specialize(){
	defense -= 25;
	attack_rating += 0.5;
    }

    public void normalize(){
	defense += 25;
	attack_rating -= 0.5;
    }
    public void heal() {
	HP += (int) (Math.random() * 1000);
	attack_rating -= 0.5;
    }
}




