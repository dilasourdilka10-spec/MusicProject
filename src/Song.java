import java.util.Objects;

public class Song extends MusicItem {

    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        super(title);
        this.artist = artist;
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String getInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return title + " - " + artist + " (" + duration + " sec)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return title.equals(song.title) && artist.equals(song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }
}
