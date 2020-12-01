package n01_strategy_pattern.BankInterest_en;

public class InterestCalculator {

    private IBankStrategy bankCalculator;

    public InterestCalculator(IBankStrategy bankCalculator){
        this.bankCalculator = bankCalculator;
    }

    public double calculate(IOrderStrategy order){
        return this.bankCalculator.getTaxaDeJuros(order);
        
    }
    
}