/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package texttospeech;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 *
 * @author abhis
 */
public class TextToSpeech {

    public static void main(String[] args) {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin");
        if (voice != null) {
            voice.allocate();
            voice.speak("Hello Abhisek .I am your AI.");

            
            System.out.println(voice.getName());
            System.out.println(""+voice.getRate());
            System.out.println(""+voice.getPitch());
            System.out.println(""+voice.getVolume());
            voice.deallocate();
        }
    }
}


