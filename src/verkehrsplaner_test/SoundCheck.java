package verkehrsplaner_test;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Felix
 */
public class SoundCheck {
    
    public SoundCheck() {
        
    }
    
    public void start() {
        AudioInputStream stream = null;
        try {
            stream = AudioSystem.getAudioInputStream(getClass().getResource("nerviger_song.aiff"));
            AudioFormat format = stream.getFormat();
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
//            Thread.sleep(10000);
//            clip.stop();
//            clip.close();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(SoundCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SoundCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(SoundCheck.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stream.close();
            } catch (IOException ex) {
                Logger.getLogger(SoundCheck.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
