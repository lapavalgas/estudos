package n01_strategy_pattern.CharacterWeapon;

public class Queen extends Character {

    public Queen() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Queen is fighting!!!");
        weapon.useWeapon();
    }
    
}