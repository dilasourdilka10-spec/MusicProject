import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Playlist {

    private String name;
    private ArrayList<Song> songs = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void showAll() {
        for (Song s : songs) {
            System.out.println(s);
        }
    }

    public Song findByTitle(String title) {
        for (Song s : songs) {
            if (s.getTitle().equalsIgnoreCase(title)) {
                return s;
            }
        }
        return null;
    }

    public List<Song> filterByArtist(String artist) {
        List<Song> result = new ArrayList<>();
        for (Song s : songs) {
            if (s.getArtist().equalsIgnoreCase(artist)) {
                result.add(s);
            }
        }
        return result;
    }

    public void sortByDuration() {
        Collections.sort(songs, Comparator.comparingInt(Song::getDuration));
    }
}
