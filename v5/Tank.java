public class Tank extends Protagonist{

    public Tank (String name){
	super(name);
	defense += 20;
    }

    public  String about(){
	return "A tank's armor protects him, granting him greater defense" ;
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

