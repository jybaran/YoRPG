// JENNY BARAN, MARIA VASILKIN, MIRANDA CHAIKEN
// pd 8
// HW26
// 2013-11-15

public class Rogue extends Character {

    public Rogue( String name ) {
	_name = name;
	_hp = 125;
	_altdef = _def/2;
	_altattack = _attack*2;
        _str = 30;
        _def = 125;
        _attack = 0.3;
    }
    
    public String getName() {
        return _name;
    }

    public int attack(Character opponent) {
        return super.attack(opponent);
    }
    
   /* public void  gainHP () {
        int moves = YoRPG.getMoveCounter();
        if (moves%3 == 0) {
            _HP = (125 - _HP) / 4;
        }
    }*/
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
        String retStr = "The wandering vagabond. Not that strong but resilient. ";
	retStr += "Low strength, high defense";
        return retStr;
    }

    public String ascii() {
	String retStr = "";
	return retStr;
    }

}
