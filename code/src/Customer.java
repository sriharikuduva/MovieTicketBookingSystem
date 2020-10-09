import java.util.List;

public class Customer extends Person {

    private List<Booking> bookings;

    public void makeBooking(Booking booking) {
        bookings.add(booking);
    }
    public List<Booking> getBookings() {
        return bookings;
    }

}
