import java.util.Date;
import java.util.List;
import java.util.Map;

public class Catalog implements Search {
    private Map<String, List<Movie>> movieTitles;
    private Map<String, List<Movie>> movieLanguages;
    private Map<String, List<Movie>> movieGenres;
    private Map<Date, List<Movie>> movieReleaseDates;
    private Map<String, List<Movie>> movieCities;

    @Override
    public List<Movie> searchByTitle(String title) {
        return movieTitles.get(title);
    }

    @Override
    public List<Movie> searchByLanguage(String language) {
        return movieLanguages.get(language);
    }

    @Override
    public List<Movie> searchByGenre(String genre) {
        return movieGenres.get(genre);
    }

    @Override
    public List<Movie> searchByCity(String cityName) {
        return movieCities.get(cityName);
    }

    @Override
    public List<Movie> searchByReleaseDate(Date relDate) {
        return movieReleaseDates.get(relDate);
    }
}
