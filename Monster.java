// JENNY BARAN, MARIA VASILKIN, MIRANDA CHAIKEN
// pd 8
// HW26
// 2013-11-15

public class Monster extends Character {

    public Monster(){
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
	String retStr = (
"              ,      ,   "+
"\n            /(.----.)\\"+
"\n        |\\  \\/      \\/  /|"+
"\n        | \\ / =.  .= \\ / |"+
"\n        \\( \\   o\\/o   / )/"+
"\n         \\_   -/  \\-   _/"+
"\n           /   \\__/   \\"+
"\n           \\ \\__/\\__/ /"+
"\n         ___\\ \\|--|/ /___"+
"\n       /`    \\      /    `\\"+
"\n      /        ----        \\");
//credit to http://www.geocities.com/spunk1111/haloween.htm#demon as we were too lazy to make these ourselves
	return retStr;
    }


}
