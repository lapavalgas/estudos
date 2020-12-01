package n01_strategy_pattern.MiniDuckSimulator;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can’t fly");
    }
}