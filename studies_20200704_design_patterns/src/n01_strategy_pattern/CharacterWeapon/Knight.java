package n01_strategy_pattern.CharacterWeapon;

public class Knight extends Character {

    public Knight() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Knight is fighting!!!");
        weapon.useWeapon();
    }
    
}