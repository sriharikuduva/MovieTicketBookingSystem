import java.util.List;

public class CinemaHall {
    private String name;
    private int totalSeats;

    private List<ShowSeat> seats;
    private List<Show> shows;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getTotalSeats() {
        return totalSeats;
    }
    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public List<ShowSeat> getSeats() {
        return seats;
    }
    public void setSeats(List<ShowSeat> seats) {
        this.seats = seats;
    }

    public List<Show> getShows() {
        return shows;
    }
    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}