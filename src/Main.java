public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Bruno Mars", "Pop");
        Artist artist2 = new Artist("Coldplay", "Pop rock");
        System.out.println("Артисты:");
        System.out.println(artist1.getName() + " - " + artist1.getGenre());
        System.out.println(artist2.getName() + " - " + artist2.getGenre());
        System.out.println();

        Song song1 = new Song("That's what i like", artist1.getName(), 206);
        Song song2 = new Song("24K Magic", artist1.getName(), 225);
        Song song3 = new Song("Viva La Vida", artist2.getName(), 242);
        System.out.println("Песни:");
        System.out.println(song1.getTitle() + " - " + song1.getArtist() + " (" + song1.getDuration() + " сек)");
        System.out.println(song2.getTitle() + " - " + song2.getArtist() + " (" + song2.getDuration() + " сек)");
        System.out.println(song3.getTitle() + " - " + song3.getArtist() + " (" + song3.getDuration() + " сек)");
        System.out.println();

        Playlist myPlaylist = new Playlist("Мой плейлист", song1, song2, song3);
        System.out.println("Плейлист: " + myPlaylist.getName());
        System.out.println("1. " + myPlaylist.getSong1().getTitle() + " - " + myPlaylist.getSong1().getArtist());
        System.out.println("2. " + myPlaylist.getSong2().getTitle() + " - " + myPlaylist.getSong2().getArtist());
        System.out.println("3. " + myPlaylist.getSong3().getTitle() + " - " + myPlaylist.getSong3().getArtist());
        System.out.println();
        if (song1.getArtist().equals(song2.getArtist())) {
            System.out.println("Песни 1 и 2 одного исполнителя");
        } else {
            System.out.println("Песни 1 и 2 разных исполнителей");
        }
        if (song1.getTitle().equals(song3.getTitle())) {
            System.out.println("Песни 1 и 3 одинаковые");
        } else {
            System.out.println("Песни 1 и 3 разные");
        }
    }
}
