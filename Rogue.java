//Jenny Baran, Miranda Chaiken, Maria Vasilkin
//HW26
//2013.11.16
public class Rogue extends Character {

    public Rogue( String name ) {
	super(name);
        _str = 75;
        _def = 125;
        _attack = 0.3;
    }
    
    public String getName() {
        return _name;
    }

    public int attack(Character opponent) {
        return super.attack(opponent);
    }
    
    public void specialize() {}
    public void normalize() {}
    public static String about() {
        String retStr = "The wandering vagabond.Not that strong but resilient. ";
	retStr += "/n Low strength, high defense";
        return retStr;
    }

}
