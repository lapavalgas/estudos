package n01_strategy_pattern.BankInterest_en;

public class BankItauStrategy implements IBankStrategy {

    @Override
    public double getTaxaDeJuros(IOrderStrategy order) {
        return 20.0;
    }
    
}