package n01_strategy_pattern.BankInterest_pt_br;

public class CalculadoraDeJuros {
    
    private ICalculadoraDeJurosStrategy calculadora;

    public CalculadoraDeJuros(ICalculadoraDeJurosStrategy calculadora){
        this.calculadora = calculadora;    
    }

    public double calcular(Pedido pedido){ // o ideal seria utilizar uma interface
        return this.calculadora.getTaxaDeJuros(pedido);
    }


}