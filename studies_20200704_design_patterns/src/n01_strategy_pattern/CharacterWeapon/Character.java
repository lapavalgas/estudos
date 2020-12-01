package n01_strategy_pattern.CharacterWeapon;

public abstract class Character {
    WeaponBehavior weapon;

    Character () {}

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon){
        this.weapon = weapon;
    }

}