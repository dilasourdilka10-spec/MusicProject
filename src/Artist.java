public class Artist {
    String name;
    String genre;

    public Artist(String name, String genre){
        this.name = name;
        this.genre = genre;
    }
    public String getName(){
        return name;
    }
    public String getGenre(){
        return genre;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void printInfo() {
        System.out.println(name + " (" + genre + ")");
    }
}
