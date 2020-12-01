package n01_strategy_pattern.CharacterWeapon;

public class King extends Character {

    public King() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("King is fighting!!!");
        weapon.useWeapon();
    }
    
}