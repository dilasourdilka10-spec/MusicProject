public class Playlist {
    String name;
    Song song1;
    Song song2;
    Song song3;

    public Playlist(String name, Song song1, Song song2, Song song3) {
        this.name = name;
        this.song1 = song1;
        this.song2 = song2;
        this.song3 = song3;
    }
    public String getName() {
        return name;
    }
    public Song getSong1() {
        return song1;
    }
    public Song getSong2() {
        return song2;
    }
    public Song getSong3() {
        return song3;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSong1(Song song1) {
        this.song1 = song1;
    }
    public void setSong2(Song song2) {
        this.song2 = song2;
    }
    public void setSong3(Song song3) {
        this.song3 = song3;
    }
    public void printPlaylist() {
        System.out.println("Плейлист: " + name);
        System.out.println("1. " + song1.getTitle() + " - " + song1.getArtist());
        System.out.println("2. " + song2.getTitle() + " - " + song2.getArtist());
        System.out.println("3. " + song3.getTitle() + " - " + song3.getArtist());
    }
}
