public class Song {
    String title;
    String artist;
    int duration;

    public Song(String title, String artist, int duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int getDuration(){
        return duration;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public void printInfo() {
        System.out.println(title + " - " + artist + " (" + duration + " сек)");
    }
}
