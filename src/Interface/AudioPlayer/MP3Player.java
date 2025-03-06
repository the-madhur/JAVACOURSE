package Interface.AudioPlayer;

public class MP3Player implements AudioPlayer 
{

    @Override
    public void play() 
    {
        System.out.println("Playing MP3 file");
    }

    @Override
    public void pause() 
    {
        System.out.println("Pause MP3 file");
    }

    @Override
    public void stop() 
    {
        System.out.println("Stopping MP3 playback");
    }
}
