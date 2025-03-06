package Interface.AudioPlayer;

public class WAVPlayer implements AudioPlayer
{ 
    
    @Override
    public void play() 
    {
        System.out.println("Playing WAV file");
    }
    
    @Override
    public void pause() 
    {
        System.out.println("Pause WAV file");
    }
    
    @Override
    public void stop() 
    {
        System.out.println("Stopping WAV playback");
    }
}
