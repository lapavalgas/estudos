package n02_observer_pattern.SwingButtonObserver;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class AngelListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Don’t do it, you might regret it!");
    }
}