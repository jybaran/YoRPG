// JENNY BARAN
// pd 8
// HW25
// 2013-11-14

public class Mage extends Character {

    private String _name;
    private int _altdef;
    private double _altattack;

    public Mage( String name ) {
	_name = name;
	_hp = 125;
	_str = 30;
	_def = 100;
	_altdef = _def/2;
	_attack = 0.4;
	_altattack = _attack*3;
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
	String retStr = "Bit more magicky than your average human. Not as strong as ";
	retStr += "a Warrior, but has a more powerful special attack.";
	return retStr;
    }

}