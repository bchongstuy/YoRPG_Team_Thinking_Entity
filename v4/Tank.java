public class Tank extends Protagonist{

    public Tank (String name){
	super(name);
	defense = 75;
    }

    public  String about(){
	return "A tank's armor protects him, granting him greater defense" ;
    }
}
