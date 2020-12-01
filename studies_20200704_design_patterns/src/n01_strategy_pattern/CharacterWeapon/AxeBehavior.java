package n01_strategy_pattern.CharacterWeapon;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Chopping with axe!");
    }

}