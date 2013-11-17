// JENNY BARAN, MARIA VASILKIN, MIRANDA CHAIKEN
// pd 8
// HW26
// 2013-11-15

public class Monster extends Character {

    public Monster() {
	_hp = 150;
	_str = 20 + (int)( Math.random() * 45 );
	_def = 20;
	_attack = 1;

    }

    public String getName() {
	return "";
    }
    
    public int attack(Character opponent) {
	return super.attack(opponent);
    }

    public void specialize() { }

    public void normalize() { }

    public static String about() {
	String retStr = "All we know about this monster is that it will probably ";
	retStr += "bite your head off. That's really all that matters though, right?";
	return retStr;
    }

    public String ascii() {
	String retStr = "   '     '    \n" +
	    "   /(   )\\   \n"+
	    "  |   U   |  \n"+
	    "   ) o o (   \n"+
	    "  |       |    \n"+
	    "   \\  W  /    \n"+
	    "     \\V/       \n";
	return retStr;
    }


}
