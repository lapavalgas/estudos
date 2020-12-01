package n02_observer_pattern.SwingButtonObserver;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class DevilListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Come on, do it!");
    }
}