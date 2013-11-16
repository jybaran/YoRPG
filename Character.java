// JENNY BARAN
// pd 8
// HW25
// 2013-11-14

public abstract class Character {

    protected int _hp;
    protected int _str;
    protected int _def;
    protected double _attack;
    protected String _name;
    protected int _altdef;
    protected double _altattack;

    public Character ( String name ) {
	_name = name;
	_hp = 125;
	_str = 40;
	_def = 100;
	_altdef = _def/5;
	_attack = 0.4;
	_altattack = _attack*10;
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
	oponent.lowerHP(damage);
	return damage;
    }

    public abstract void specialize();

    public abstract void normalize();

    public static String about() {
	String retStr = "";
	return retStr;
    }

}
