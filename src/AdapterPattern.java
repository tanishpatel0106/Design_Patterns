import Structural.Adapter.*;
public class AdapterPattern {
    public static void main(String [] args){
        AudioPlayer ap = new AudioPlayer();
        ap.play("MP3", "File1.mp3");
        ap.play("MP4", "File2.mp4");
        ap.play("VLC", "File3.vlc");
        ap.play("AVI", "File4.avi");
    }
}
