import java.util.ArrayList;

public class Album {

    private String albumName;
    private ArrayList<Song> songArrayList;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songArrayList = new ArrayList<>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public ArrayList<Song> getSongArrayList() {
        return songArrayList;
    }

    public void setSongArrayList(ArrayList<Song> songArrayList) {
        this.songArrayList = songArrayList;
    }

    public Song findSong(String name) {
        for (Song s : songArrayList) {
            // check if the song exists in this album
            if (s.getSongName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public boolean isSong(String name) {
        for (Song s : songArrayList){
            if (s.getSongName().equals(name)){
                return true;
            }
        }
            return false;
    }

}
