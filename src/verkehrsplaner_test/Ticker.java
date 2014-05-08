/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verkehrsplaner_test;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Developer
 */
public class Ticker extends JPanel implements Runnable {

    JLabel label;
    String str = "The Message to Scroll ";

    public Ticker() {
        super();
        label = new JLabel(str);
        add(label);
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            char c = str.charAt(0);
            String rest = str.substring(1);
            str = rest + c;
            label.setText(str);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }
}

