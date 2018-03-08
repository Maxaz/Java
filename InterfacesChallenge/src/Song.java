import java.util.ArrayList;
import java.util.List;

public class Song implements ISaveable {

    private String songAuthor;
    private String songName;
    private Double songDuration;

    public Song(String songAuthor, String songName, int songMinutes, int songSeconds) {
        this.songAuthor = songAuthor;
        this.songName = songName;
        this.songDuration = (double)songMinutes + ((double)songSeconds/60);

}

    public String getSongAuthor() {
        return songAuthor;
    }

    public String getSongName() {
        return songName;
    }

    public Double getSongDuration() {
        return songDuration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songAuthor='" + songAuthor + '\'' +
                ", songName='" + songName + '\'' +
                ", songDuration=" + songDuration +
                '}';
    }

    @Override
    public List<String> save() {
        List<String> songs = new ArrayList<>();
        songs.add(0, this.songAuthor);
        songs.add(1, this.songName);
        songs.add(2, "" + this.songDuration.toString());
        return songs;
    }

    @Override
    public void read(List<String> savedSong) {
        if ((savedSong != null) && savedSong.size() > 0){
            this.songAuthor = savedSong.get(0);
            this.songName = savedSong.get(1);
            this.songDuration = Double.parseDouble(savedSong.get(2));
        }

    }
}
