package n01_strategy_pattern.TextFormatter;

public class TextFormatterApp {

    public TextFormatterApp() {

        // strategy pattern : TextFormatter
        TextFormatter formatter = new CapTextFormatter();
        TextEditor editor = new TextEditor(formatter);
        editor.publishText("Testing text in caps formatter");

        formatter = new LowerTextFormatter();
        editor = new TextEditor(formatter);
        editor.publishText("Testing text in lower formatter");
    }

}