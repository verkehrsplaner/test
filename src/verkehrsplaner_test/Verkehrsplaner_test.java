
package verkehrsplaner_test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;

public class Verkehrsplaner_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Build Start: " + format.format(Calendar.getInstance().getTime()));
        SoundCheck sound = new SoundCheck();
        sound.start();
        System.out.println("Starte GUI..");
        JFrame f = new TestGUI();
        f.setVisible(true);
    }
    
}
