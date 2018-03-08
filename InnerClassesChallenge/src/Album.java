import java.util.ArrayList;

public class Album {

    private String albumName;
//    private ArrayList<Song> songArrayList;
    private SongList songList;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songList = new SongList();
//        this.songArrayList = new ArrayList<>();
    }

    public String getAlbumName() {
        return albumName;
    }

//    public ArrayList<Song> getSongArrayList() {
//        return songArrayList;
//    }

    public SongList getSongArrayList() {
        return songList;
    }



    public class SongList {
        private ArrayList<Song> songArrayList;

        public SongList() {
            this.songArrayList = new ArrayList<>();
        }

        public void add (Song songToBeAdded){
            this.songArrayList.add(songToBeAdded);
        }

        public Song findSong(String name) {
            for (Song s : this.songArrayList) {
                // check if the song exists in this album
                if (s.getSongName().equals(name)) {
                    return s;
                }
            }
            return null;
        }

        public boolean isSong(String name) {
            for (Song s : this.songArrayList) {
                if (s.getSongName().equals(name)) {
                    return true;
                }
            }
            return false;
        }


    }


}
