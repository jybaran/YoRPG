// JENNY BARAN, MARIA VASILKIN, MIRANDA CHAIKEN
// pd 8
// HW26
// 2013-11-15

public class Knight extends Character {

    public Knight( String name ) {
	super(name);
	_hp = 100;
	_str = 50;
	_altdef = _def*2;
	_altattack = _attack*(2/3);
    }
    
    public String getName() {
	return _name;
    }

    public int attack(Character opponent) {
	return super.attack(opponent);
    }

    public void specialize() {
	if (_attack < _altattack) {
	    double tempA = _attack;
	    _attack = _altattack;
	    _altattack = tempA;
	    int tempD = _def;
	    _def = _altdef;
	    _altdef = tempD;
	}
	/*if the attack stat is larger than the alt attack, the warrior is
	  already prepped for a special attack, so nothing changes*/
    }

    public void normalize() {
	if (_attack > _altattack) {
	    double tempA = _attack;
	    _attack = _altattack;
	    _altattack = tempA;
	    int tempD = _def;
	    _def = _altdef;
	    _altdef = tempD;
	}
	/*if the attack stat is smaller than the alt attack, the warrior is
	  already prepped for a normal attack, so nothing changes*/
    }

    public static String about() {
	String retStr = "Very brave and loyal. Kind to all (except dragons). ";
	retStr += "Stronger than a standard warrior, but more easily killed (all that time in a ";
	retStr += "glorifed tin can isn't great for the health)."
	return retStr;
    }

    public String ascii() {
	String retStr = "";
	retStr += "\n          _,.";
        retStr += "\n        ,` -.)";
        retStr += "\n       ( _/-\\\\-._";
        retStr += "\n      /,|`--._,-^|            ,";
        retStr += "\n      \\_| |`-._/||          ,'|";
        retStr += "\n        |  `-, / |         /  /";
        retStr += "\n        |     || |        /  /";
        retStr += "\n         `r-._||/   __   /  /  ";
        retStr += "\n     __,-<_     )`-/  `./  /  ";
        retStr += "\n    '  \\   `---'   \\   /  /    ";
        retStr += "\n        |           |./  /       ";
        retStr += "\n        /            /  /       ";
        retStr += "\n    \\_/' \\         |/  /       ";
        retStr += "\n     |    |   _,^-'/  /       ";
        retStr += "\n     |    , ``  (\\/  /_";
        retStr += "\n      \\,.->._    \\X-=/^";
        retStr += "\n      (  /   `-._//^`  ";
 	retStr += "\n       `Y-.____(__}";
 	retStr += "\n        |     {__)";
	retStr += "\n             ()";
	return retStr;
    }

}
