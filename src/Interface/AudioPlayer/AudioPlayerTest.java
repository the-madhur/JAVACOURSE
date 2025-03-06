package Interface.AudioPlayer;

public class AudioPlayerTest 
{
    public static void main(String[] args) 
    {
        AudioPlayer mp3 = new MP3Player();
        mp3.play();
        mp3.pause();
        mp3.stop();
        
        System.out.println("----------------------------");

        AudioPlayer wav = new WAVPlayer();
        wav.play();
        wav.pause();
        wav.stop();
    }
}
