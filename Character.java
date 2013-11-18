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
	    success= "You are weaponized and gained some hP back";
	}
	else{
	    success= "You already used that weapon!";
	}
	return success; 
    }
    public String weaponConvert(int x){
	String c="";
	if (x==1){
	    c=this.weaponize(_knife);
	    _knife=false;}
	else if (x==2){
	    c=this.weaponize(_potion);
	    _potion=false;}
	else if (x==3){
	   c=this.weaponize(_bomb);
	   _bomb=false;}
	else
	    c="Please try and use a weapon you actually HAVE";
	return c;

    }

}
