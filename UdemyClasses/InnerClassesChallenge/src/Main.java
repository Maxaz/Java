import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Playlist newPlaylist = new Playlist("My playlist");

//        add songs and albums here
        Album firstAlbum = new Album("best album");
        Album secondAlbum = new Album("worst album");
        Song songOne = new Song("One", 1, 30);
        Song songTwo = new Song("Two", 2, 30);
        Song songThree = new Song("Three", 3, 30);
        Song songFour = new Song("Four", 4, 30);


        firstAlbum.getSongArrayList().add(songOne);
        firstAlbum.getSongArrayList().add(songTwo);
        secondAlbum.getSongArrayList().add(songThree);
        secondAlbum.getSongArrayList().add(songFour);



        newPlaylist.getAlbumArrayList().add(firstAlbum);
        newPlaylist.getAlbumArrayList().add(secondAlbum);
        // 2 albums & 4 songs created for test purposes

        newPlaylist.addSongToPlaylist("Three");
        newPlaylist.addSongToPlaylist("Two");
        newPlaylist.addSongToPlaylist("Four");
        newPlaylist.addSongToPlaylist("One");



        startPlaylist(newPlaylist);

    }


    public static void startPlaylist(Playlist playlist) {
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> songIterator = playlist.getPlaylistLinkedList().listIterator();
        boolean quit = false;
        boolean playing = true;

        playlist.printMenu();

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();


            switch (action) {
                case 0:
                    System.out.println("Playlist is over");
                    quit = true;
                    break;
                case 1:
                    if (!playing) {
                        if (songIterator.hasNext()) {
                            songIterator.next().getSongName();
                        }
                        playing = true;
                    }
                    if (songIterator.hasNext()) {
                        System.out.println("now playing " + songIterator.next().getSongName());
                    } else {
                        System.out.println("we are at the end of the playlist");
                        playing = false;
                    }
                    break;
                case 2:
                    if (playing) {
                        if (songIterator.hasPrevious()) {
                            songIterator.previous();
                        }
                        playing = false;
                    }
                    if (songIterator.hasPrevious()) {
                        System.out.println("now playing " + songIterator.previous().getSongName());
                    } else {
                        System.out.println("we are at the start of the playlist");
                        playing = true;
                    }
                    break;
                case 3:
                    if (!songIterator.hasPrevious()){
                        System.out.println("now playing " + songIterator.next().getSongName());
                    } else {
                        songIterator.previous();
                        System.out.println("now playing " + songIterator.next().getSongName());
                        playing = true;
                    }
                    break;
                case 4:
                    playlist.printList();
                    break;
                case 5:
                    System.out.println("Provide the name of the song you wish to add to this playlist: ");
                    String addSong = scanner.nextLine();
                    playlist.addSongToPlaylist(addSong);
                    break;
                case 6:
                    System.out.println("Provide the name of the song you wish to remove from this playlist");
                    String removeSong = scanner.nextLine();
                    playlist.removeSongFromPlaylist(removeSong);
                    break;
                case 7:
                    playlist.printMenu();
                    break;
            }
        }
    }
}

