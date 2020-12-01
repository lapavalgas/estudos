package n01_strategy_pattern.CharacterWeapon;

public class CharacterWeaponApp {

    public CharacterWeaponApp() {

        // strategy pattern : CharacterWeapon.java
        Character king = new King();
        king.fight();
        
        Character queen = new Queen();
        queen.fight();
        queen.setWeapon(new KnifeBehavior());
        queen.fight();
    }

}