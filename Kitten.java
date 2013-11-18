// JENNY BARAN, MARIA VASILKIN, MIRANDA CHAIKEN
// pd 8
// HW26
// 2013-11-15

public class Kitten extends Character {
   
    public Kitten(String name){
	_name = name;
	_hp = 125;
	_str = 40;
	_def = 100;
	_altdef = _def/2;
	_attack = 0.4;
	_hp*=9;
	_altattack = _attack*10;
    }

    public String getName() {
	return _name;
    }

    public int attack(Character opponent) {
	return super.attack(opponent);
    }

    public void specialize() {
	if (_attack < _altattack) {
	    double tempA = _attack; //set attack
	    _attack = _altattack;
	    _altattack = tempA;
	    int tempD = _def; //set defense
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
	return ("A smaller and more adorable Cat. Fond of milk, balls of yarn, cuddling, yawning cutely, " + 
		"and clawing out the eyes of their opponents. Ferocious attacker, not great defenders, " +
		"but they do have seem to have strangely long lives... almost as though there are 9 of them...");
    }

    public String ascii() {
	String retStr = "";
	retStr += "\n (`.";
        retStr += "\n  ) )";
        retStr += "\n ( (";
        retStr += "\n  \\ \\";
        retStr += "\n   \\ \\";
        retStr += "\n .-'  `-.";
        retStr += "\n/        `.";
        retStr += "\n(      )    `-._ ,   _";
        retStr += "\n)   ,'         (.\\--'(";
        retStr += "\n\\  (         ) /      \\";
        retStr += "\n \\  \\_(     / (    <6 (6";
        retStr += "\n \\_)))\\   (   `._  .:Y)__";
        retStr += "\n '''  \\   `-._.'`---^_)))";
        retStr += "\n        `-._ )))       ```";
        retStr += "\n             ```";
        return retStr;
    }


}
