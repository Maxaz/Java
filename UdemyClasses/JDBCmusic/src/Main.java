import model.Artist;
import model.Datasource;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        datasource.open();

        List<Artist> artists = datasource.queryArtists();
        if (artists == null) {
            System.out.println("No artists");
            return;
        }
        artists.forEach(System.out::println);



        datasource.close();
    }
}
