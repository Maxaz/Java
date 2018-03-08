import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

    private String playlistName;
    private LinkedList<Song> playlistLinkedList;
    private ArrayList<Album> albumArrayList;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.playlistLinkedList = new LinkedList<>();
        this.albumArrayList = new ArrayList<>();
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public LinkedList<Song> getPlaylistLinkedList() {
        return playlistLinkedList;
    }

    public void setPlaylistLinkedList(LinkedList<Song> playlistLinkedList) {
        this.playlistLinkedList = playlistLinkedList;
    }

    public ArrayList<Album> getAlbumArrayList() {
        return albumArrayList;
    }

    public void setAlbumArrayList(ArrayList<Album> albumArrayList) {
        this.albumArrayList = albumArrayList;
    }

    public void addSongToPlaylist(String songName, String albumName) {
        for (Album album : albumArrayList) {
            if (album.getAlbumName().equals(albumName) && album.findSong(songName) != null) {
                playlistLinkedList.add(album.findSong(songName));
            }
        }
    }

    public void addSongToPlaylist(String songName) {
        boolean isSongAdded = false;

//        for (int i = 0; i < albumArrayList.size(); i++) {
//            System.out.println(albumArrayList.get(i).getAlbumName());
//             if (albumArrayList.get(i).isSong(songName)){
//                 playlistLinkedList.add(albumArrayList.get(i).findSong(songName));
//             } else {
//                 System.out.println("Could not find this song. It was not added.");
//             }
//
//        }
        for (Album album : albumArrayList) {
            if (album.isSong(songName)) {
                playlistLinkedList.add(album.findSong(songName));
                isSongAdded = true;
            }
        }
        if (!isSongAdded) {
            System.out.println("Could not find this song. It was not added.");
        } else {
            System.out.println("Added " + songName);
        }
    }

    public void removeSongFromPlaylist(String songName) {
        ListIterator<Song> listIterator = playlistLinkedList.listIterator();
        boolean isRemoved = false;
        while (!isRemoved) {
            if ((!playlistLinkedList.isEmpty()) && listIterator.hasNext()) {
                if (listIterator.next().getSongName().equals(songName)) {
                    listIterator.remove();
                }
            } else if ((!listIterator.hasNext()) || playlistLinkedList.isEmpty()) {
                isRemoved = true;
            } else {
                listIterator.next();
            }
        }
        if (isRemoved) {
            System.out.println("Song " + songName + " was removed from this playlist.");
        }
    }

    public static void printMenu() {
        System.out.println("Available actions:\n press " +
                "0 - to quit\n" +
                "1 - to skip forward\n" +
                "2 - to skip backward\n" +
                "3 - to replay current song\n" +
                "4 - to display the songs on this playlist\n" +
                "5 - to add a song to this playlist\n" +
                "6 - to remove a song from this playlist\n" +
                "7 - to print menu options");
    }

    public void printList() {
        Iterator<Song> i = getPlaylistLinkedList().iterator();
        while (i.hasNext()) {
            System.out.println("Song on the playlist: " + i.next().getSongName());
        }
        if (getPlaylistLinkedList().isEmpty()) {
            System.out.println("There are no songs in this playlist.");
        }
        System.out.println("---------------------");
    }
}
