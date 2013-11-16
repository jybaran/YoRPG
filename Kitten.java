// JENNY BARAN
// pd 8
// HW25
// 2013-11-14

public class Kitten extends Character {
    public Kitten(String name){
	this(name);
	hp*=9;
    }
    public String getName() {
	return _name;
    }

    public int attack(Monster opponent) {
	return super.attack(opponent);
    }

    public void specialize() {
	if (_attack < _altattack) {
	    double tempA = _attack;//Set attack
	    _attack = _altattack;
	    _altattack = tempA;
	    int tempD = _def;//set defense
	    _def = _altdef;
	    _altdef = tempD;
	}
	/*if the attack stat is larger than the alt attack, the warrior is
	  already prepped for a special attack, so nothing changes*/
    }

    public void normalize() {
	if (_attack > _altattack) {
	    double tempA = _attack;//normalize attack
	    _attack = _altattack;
	    _altattack = tempA;
	    int tempD = _def;//normalize defense 
	    _def = _altdef;
	    _altdef = tempD;
	}
	/*if the attack stat is smaller than the alt attack, the warrior is
	  already prepped for a normal attack, so nothing changes*/
    }

    public static String about() {
	return ("A smaller and more adorable Cat. Fond of milk, balls of yarn, cuddling, yawning cutely,"+ 
			 "and clawing out the eyes of their opponents. Ferocious attacker, not great defenders,"+
		" but they do have seem to have strangely long lives... almost as though there are 9 of them...");
    }

}
