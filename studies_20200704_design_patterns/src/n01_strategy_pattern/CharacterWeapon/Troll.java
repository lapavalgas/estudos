package n01_strategy_pattern.CharacterWeapon;

public class Troll extends Character {

    public Troll() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Troll is fighting!!!");
        weapon.useWeapon();
    }
    
}