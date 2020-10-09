import metadata.BookingStatus;

import java.util.Date;
import java.util.List;

public class Booking {
    private String bookingNumber;
    private int numberOfSeats;
    private Date createdOn;
    private BookingStatus status;

    private Show show;
    private List<ShowSeat> seats;
    private Payment payment;


    public String getBookingNumber() {
        return bookingNumber;
    }
    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Date getCreatedOn() {
        return createdOn;
    }
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public BookingStatus getStatus() {
        return status;
    }
    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public Show getShow() {
        return show;
    }
    public void setShow(Show show) {
        this.show = show;
    }

    public List<ShowSeat> getSeats() {
        return seats;
    }
    public void setSeats(List<ShowSeat> seats) {
        this.seats = seats;
    }

    public Payment getPayment() {
        return payment;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void makePayment(Payment payment) {}
    public void cancel() {}
    public void assignSeats(List<ShowSeat> seats) {}
}

