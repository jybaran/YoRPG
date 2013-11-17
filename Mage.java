// JENNY BARAN, MARIA VASILKIN, MIRANDA CHAIKEN
// pd 8
// HW26
// 2013-11-15

public class Mage extends Character {

    public Mage( String name ) {
	super(name);
	_str = 30;
	_altattack = _attack*3;
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
	String retStr = "Bit more magicky than your average human. Not as strong as ";
	retStr += "a Warrior, but has a more powerful special attack.";
	return retStr;
    }

    public String ascii() {
	String retStr = "";
        retStr += "\n      /^\\";    
        retStr += "\n       /\\    V";
        retStr += "\n      /__\\   I  ";   
        retStr += "\n     //..\\\\  I ";   
        retStr += "\n     \\].`[/  I";
        retStr += "\n    /l\\/j\\  (] ";  
        retStr += "\n    /. ~~ ,\\/I  ";     
        retStr += "\n    \\\\L__j^\\/I  ";    
        retStr += "\n      \\/--v} I  ";   
        retStr += "\n      |    | I  "; 
        retStr += "\n      |    | I ";
        retStr += "\n      |    l I  ";
        retStr += "\n    _/j  L l\\\\_!  ";
        retStr += "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ";
	return retStr;
    }

}
