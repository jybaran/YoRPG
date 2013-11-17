// JENNY BARAN, MARIA VASILKIN, MIRANDA CHAIKEN
// pd 8
// HW26
// 2013-11-15

public abstract class Character {

    protected int _hp;
    protected int _str;
    protected int _def;
    protected double _attack;
    protected String _name;
    protected int _altdef;
    protected double _altattack;
    protected boolean _knife=true;
    protected boolean _potion=true;
    protected boolean _bomb=true;

    public Character( String name ) {
	_name = name;
	_hp = 125;
	_str = 40;
	_def = 100;
	_altdef = _def/2;
	_attack = 0.4;
	_altattack = _attack*2;
    }
    
    public boolean isAlive() {
	return _hp > 0;
    }

    public abstract String getName();

    public int getDefense() {
	return _def;
    }

    public void lowerHP(int x) {
	_hp -= x;
    }

    public int attack(Character opponent) {
	int damage = (int)(_str*_attack) - opponent.getDefense();
	if (damage < 0)
	    damage = 0;
	opponent.lowerHP(damage);
	return damage;
    }

    public abstract void specialize();

    public abstract void normalize();

    public static String about() {
	String retStr = "";
	return retStr;
    }

    public abstract String ascii();
    
    public String weaponize(boolean weapon){
	String success="";
	if (weapon==true){
	    _hp+=5;
	    weapon=false; 
	    success= "You are weaponized and gained some hP back";
	}
	else{
	    success= "You already used that weapon!";
		}
	return success; 
	}
    public String weaponConvert(int x){
	if (x==1)
	    return this.weaponize(_knife);
	if (x==2)
	    return this.weaponize(_potion);
	if (x==3)
	   return this.weaponize(_bomb);
	else
	    return "Please try and use a weapon you actually HAVE";

    }

}
