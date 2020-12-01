package n01_strategy_pattern.CharacterWeapon;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Cuting with knife!");
    }

}