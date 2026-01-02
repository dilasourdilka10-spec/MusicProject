import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist("My Playlist");

        playlist.addSong(new Song("That", "Bruno", 250));
        playlist.addSong(new Song("24K", "Bruno", 230));
        playlist.addSong(new Song("Viva", "Coldplay", 220));

        while (true) {
            System.out.println("""
                    1 - Show all songs
                    2 - Find song by title
                    3 - Filter by artist
                    4 - Sort by duration
                    0 - Exit
                    """);

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) break;

            if (choice == 1) {
                playlist.showAll();
            } else if (choice == 2) {
                System.out.print("Title: ");
                String title = sc.nextLine();
                System.out.println(playlist.findByTitle(title));
            } else if (choice == 3) {
                System.out.print("Artist: ");
                String artist = sc.nextLine();
                for (Song s : playlist.filterByArtist(artist)) {
                    System.out.println(s);
                }
            } else if (choice == 4) {
                playlist.sortByDuration();
                System.out.println("Sorted!");
            }
        }

        sc.close();
    }
}
