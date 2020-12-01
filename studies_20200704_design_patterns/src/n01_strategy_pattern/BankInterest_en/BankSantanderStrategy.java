package n01_strategy_pattern.BankInterest_en;

public class BankSantanderStrategy implements IBankStrategy {

    @Override
    public double getTaxaDeJuros(IOrderStrategy pedido) {
        return 10.0;
    }
    
}