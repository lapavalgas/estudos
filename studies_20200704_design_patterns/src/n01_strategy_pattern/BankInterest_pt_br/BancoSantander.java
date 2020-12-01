package n01_strategy_pattern.BankInterest_pt_br;

public class BancoSantander implements ICalculadoraDeJurosStrategy{

    @Override
    public double getTaxaDeJuros(Pedido pedido) {
        return 10.0;
    }    
}