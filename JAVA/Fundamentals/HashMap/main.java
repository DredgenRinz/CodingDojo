import java.util.HashMap;
import java.util.Set;
public class main {
    public static void main (String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Never Fade Away", "A thing of beauty - I Know.. Will never fade away");
        trackList.put("A Like Supreme", "So-so savage the new machine, Kill it all for a Like Supreme");
        trackList.put("Chippin' In", "Chippin' In - I'm the man of steel, Chippin' In - I'm real");
        trackList.put("Black Dog", "Black dog in my head guiding me to the end");
        // get the keys by using the keySet method
        Set<String> songs = trackList.keySet();
        for(String song : songs) {
            System.out.println("Track Name: " + song);
            System.out.println("Chorus Lyric: " + trackList.get(song));    
        }
    }
}