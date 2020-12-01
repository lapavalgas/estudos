package n01_strategy_pattern.BankInterest_pt_br;

public interface ICalculadoraDeJurosStrategy {

    public double getTaxaDeJuros(Pedido pedido); // o ideal é Pedido ser uma interface também
    
}