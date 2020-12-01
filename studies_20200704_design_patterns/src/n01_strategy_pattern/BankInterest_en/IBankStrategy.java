package n01_strategy_pattern.BankInterest_en;

public interface IBankStrategy {

    public double getTaxaDeJuros(IOrderStrategy order); // o ideal é Pedido ser uma interface também

}