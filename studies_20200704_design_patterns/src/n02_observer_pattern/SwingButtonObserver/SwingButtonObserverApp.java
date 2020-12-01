package n02_observer_pattern.SwingButtonObserver;

public class SwingButtonObserverApp {

    public static void main(String[] args) {

        SwingButtonObserver example1 = new SwingButtonObserver();
        example1.go();

        SwingButtonObserver_lambdas example2 = new SwingButtonObserver_lambdas();
        example2.go();
    }

}