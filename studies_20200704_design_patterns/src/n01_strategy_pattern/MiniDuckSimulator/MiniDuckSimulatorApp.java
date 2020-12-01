package n01_strategy_pattern.MiniDuckSimulator;

public class MiniDuckSimulatorApp {

    public MiniDuckSimulatorApp() {
        
        // strategy pattern : MiniDuckSimulator.java
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}