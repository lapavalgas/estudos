package n01_strategy_pattern.MiniDuckSimulator;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}