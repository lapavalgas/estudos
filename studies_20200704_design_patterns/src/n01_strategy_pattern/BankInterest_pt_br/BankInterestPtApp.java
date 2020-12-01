package n01_strategy_pattern.BankInterest_pt_br;

public class BankInterestPtApp {

    public BankInterestPtApp() {
        // strategy pattern : BankInterest_pt_br
        // declared call : useful to reuse order, bank and calculator
        Pedido pedido1 = new Pedido(1);
        BancoSantander banco1 = new BancoSantander();

        CalculadoraDeJuros calculadora1 = new CalculadoraDeJuros(banco1);
        double juros1 = calculadora1.calcular(pedido1);

        System.out.println(juros1);

        // implicit call : useful to be short and direct
        double juros2 = new CalculadoraDeJuros(new BancoItau()).calcular(new Pedido(10));
        
        System.out.println(juros2);
    }

}