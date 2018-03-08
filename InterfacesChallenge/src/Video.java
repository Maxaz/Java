import java.util.ArrayList;
import java.util.List;

public class Video implements ISaveable {

    private String videoAuthor;
    private String videoName;
    private Double videoDuration;
    private int videoVolume;

    public Video(String videoAuthor, String videoName, int videoMinutes, int videoSeconds) {
        this.videoAuthor = videoAuthor;
        this.videoName = videoName;
        this.videoDuration = (double) videoMinutes + ((double) videoSeconds / 60);
        this.videoVolume = 100;

    }

    @Override
    public String toString() {
        return "Video{" +
                "videoAuthor='" + videoAuthor + '\'' +
                ", videoName='" + videoName + '\'' +
                ", videoDuration=" + videoDuration +
                ", videoVolume=" + videoVolume +
                '}';
    }

    @Override
    public List<String> save() {
        List<String> videos = new ArrayList<>();
        videos.add(0, videoAuthor);
        videos.add(1, videoName);
        videos.add(2, "" + this.videoDuration);
        videos.add(3, "" + this.videoVolume);

        return videos;
    }

    @Override
    public void read(List<String> savedSong) {
        if ((savedSong != null) && savedSong.size() > 0) {
            this.videoAuthor = savedSong.get(0);
            this.videoName = savedSong.get(1);
            this.videoDuration = Double.parseDouble(savedSong.get(2));
            this.videoVolume = Integer.parseInt(savedSong.get(3));

        }

    }
}