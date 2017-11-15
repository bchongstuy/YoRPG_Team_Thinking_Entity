
public class Cleric extends Protagonist {

    public Cleric (String name){
	super(name);
	HP = 200;
    }

    public String about(){
	return "A clerics divine connection grants him greater HP" ;
    }


    public void specialize(){
	defense -= 25;
	attack_rating += 0.5;
    }

    public void normalize(){
	defense += 25;
	attack_rating -= 0.5;
    }
}
