package n01_strategy_pattern;

import n01_strategy_pattern.BankInterest_en.BankInterestEnApp;
import n01_strategy_pattern.BankInterest_pt_br.BankInterestPtApp;
import n01_strategy_pattern.CharacterWeapon.CharacterWeaponApp;
import n01_strategy_pattern.MiniDuckSimulator.MiniDuckSimulatorApp;
import n01_strategy_pattern.TextFormatter.TextFormatterApp;

public class StrategyPattern {

    public StrategyPattern() {

        System.out.println("\nMiniDuckSimulator.java");
        new MiniDuckSimulatorApp();

        System.out.println("\nCharacterWeapon.java");
        new CharacterWeaponApp();

        System.out.println("\nTextFormatter.java");
        new TextFormatterApp();

        System.out.println("\nBankInterest_pt_br.java");
        new BankInterestPtApp();

        System.out.println("\nBankInterest_en.java");
        new BankInterestEnApp();

    }
}
