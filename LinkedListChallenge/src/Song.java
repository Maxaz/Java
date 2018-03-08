import java.util.Date;

public class Song {

    private String songName;
    private Date songDuration;

    public Song(String songName, int songMinutes, int songSeconds) {
        this.songName = songName;
        this.songDuration = new Date(0,0, 0 ,songMinutes, songSeconds);
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Date getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(Date songDuration) {
        this.songDuration = songDuration;
    }
}
