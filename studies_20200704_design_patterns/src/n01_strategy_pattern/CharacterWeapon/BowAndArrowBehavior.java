package n01_strategy_pattern.CharacterWeapon;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Shooting with bow and arrow!");
    }

}