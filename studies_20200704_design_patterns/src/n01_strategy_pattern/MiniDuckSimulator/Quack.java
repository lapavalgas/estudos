package n01_strategy_pattern.MiniDuckSimulator;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}