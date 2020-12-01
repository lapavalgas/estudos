package n02_observer_pattern.SwingButtonObserver;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingButtonObserver {

    JFrame frame;

    public void go() {

        frame = new JFrame();

        JButton button = new JButton("Should I do it?");

        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        frame.getContentPane().add("BorderLayout.CENTER", button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}