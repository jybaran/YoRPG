// JENNY BARAN, MARIA VASILKIN, MIRANDA CHAIKEN
// pd 8
// HW26
// 2013-11-15

public class Dragon extends Character {

    public Dragon(){
        _hp = 110;
        _str = 25 + (int)( Math.random() * 45 );
        _def = 60;
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
        String retStr = "Well dragons have cool scales that make them shiny and hard to slay.";
        retStr += "But it's been wholed up in a castle for centuries, and (luckily) doesn't have much life left in it";
        return retStr;
    }

    public String ascii() {
        String retStr = (
        "/n                       ,-,-" +      
        "/n                      / / |"+      
        "/n    ,-'             _/ / / "+      
        "/n   (-_          _,-' `Z_/        "+
        "/n     #:      ,-'_,-.    \  _     "+
        "/n     #'    _(_-'_()\     \" |  "+  
        "/n   ,--_,--'                 |    "+
        "/n  / ""                      L-'\ "+
        "/n  \,--^---v--v-._        /   \ | "+
        "/n    \_________________,-'      | "+
        "/n              \           "+
        "/n               \          "+
        "/n                \        ";)

//from http://www.ascii-art.de/ascii/def/dragon.txt
        return retStr;
    }


}
