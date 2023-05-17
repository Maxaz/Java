package InnerClass.exercise;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    public boolean addSong(String title, double length) {

        if (songs.findSong(title) == null) {
            songs.add(new Song(title, length));
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(int trackNum, LinkedList<Song> playList) {

        if (trackNum > 0) {

            Song song = this.songs.findSong(trackNum - 1);
            if (song != null) {
                playList.offer(song);
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = songs.findSong(title);
        if (song != null) {
            playList.offer(song);
            return true;
        } else {
            return false;
        }
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (!songs.contains(song)) {
                songs.add(song);
                return true;
            } else {
                return false;
            }
        }

        private Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            if (trackNumber >= songs.size()) {
                return null;
            }
            return songs.get(trackNumber);
        }
    }

}
