package n01_strategy_pattern.BankInterest_en;

public class OrderStrategy implements IOrderStrategy {

    private double total;

    public OrderStrategy(double total){
        this.total = total;
    }

    @Override
    public double getTotal() {
        return this.total;
    }
    
}