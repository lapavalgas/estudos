package n01_strategy_pattern.MiniDuckSimulator;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}