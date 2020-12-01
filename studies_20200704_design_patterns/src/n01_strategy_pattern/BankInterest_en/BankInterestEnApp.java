package n01_strategy_pattern.BankInterest_en;

public class BankInterestEnApp {

    public BankInterestEnApp() {
        
        // strategy pattern : BankInterest_en
        // declared call : useful to reuse order, bank and calculator
        IOrderStrategy order1 = new OrderStrategy(1);
        IBankStrategy bank1 = new BankSantanderStrategy();

        InterestCalculator calculator = new InterestCalculator(bank1);
        double interest1 = calculator.calculate(order1);

        System.out.println(interest1);
        
        // implicit call : useful to be short and direct
        double interest2 = new InterestCalculator(new BankItauStrategy()).calculate(new OrderStrategy(10));

        System.out.println(interest2);
    }

}