// JENNY BARAN
// pd 8
// HW26
// 2013-11-15

public class Knight extends Character {

    private String _name;
    private int _altdef;
    private double _altattack;

    public Knight( String name ) {
	_name = name;
	_hp = 100;
	_str = 50;
	_def = 100;
	_altdef = _def*2;
	_attack = 0.4;
	_altattack = _attack*(2/3);
    }
    
    public String getName() {
	return _name;
    }

    public int attack(Monster opponent) {
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

}
