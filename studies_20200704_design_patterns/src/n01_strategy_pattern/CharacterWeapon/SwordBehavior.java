package n01_strategy_pattern.CharacterWeapon;

public class SwordBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Swing Sword!");
    }
        
}