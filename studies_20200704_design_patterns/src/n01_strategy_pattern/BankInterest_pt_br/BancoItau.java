package n01_strategy_pattern.BankInterest_pt_br;

public class BancoItau implements ICalculadoraDeJurosStrategy{

    @Override
    public double getTaxaDeJuros(Pedido pedido) {
        return 20.0;
    }    
    
}