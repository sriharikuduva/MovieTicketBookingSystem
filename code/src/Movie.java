import java.util.Date;
import java.util.List;

public class Movie {
    private String title, description, language, country, genre;
    private int durationInMins;
    private Date releaseDate;
    private Admin movieAddedBy;
    private List<Show> shows;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDurationInMins() {
        return durationInMins;
    }
    public void setDurationInMins(int durationInMins) {
        this.durationInMins = durationInMins;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Admin getMovieAddedBy() {
        return movieAddedBy;
    }
    public void setMovieAddedBy(Admin movieAddedBy) {
        this.movieAddedBy = movieAddedBy;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
    public List<Show> getShows() {
        return shows;
    }
}