package Structural.Adapter;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer amp;
    public MediaAdapter(String audiotype){
        if(audiotype.equalsIgnoreCase("VLC")){
            amp = new VLCPlayer();
        }
        else if(audiotype.equalsIgnoreCase("MP4")){
            amp = new MP4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("VLC")){
            amp.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("MP4")){
            amp.playMp4(fileName);
        }
    }
}
