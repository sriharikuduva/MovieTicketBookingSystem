# MovieTicketBookingSystem

Our ticket booking service should meet the following requirements:

1) It should be able to list the cities where affiliate cinemas are located.
2) Each cinema can have multiple halls and each hall can run one movie show at a time.
3) Each Movie will have multiple shows.
4) Customers should be able to search movies by their title, language, genre, release date, and city name.
5) Once the customer selects a movie, the service should display the cinemas running that movie and its available shows.
6) The customer should be able to select a show at a particular cinema and book their tickets.
7) The service should show the customer the seating arrangement of the cinema hall. The customer should be able to select multiple seats according to their preference.
8) The customer should be able to distinguish between available seats and booked ones.
9) The system should send notifications whenever there is a new movie, as well as when a booking is made or canceled.
10) Customers of our system should be able to pay with credit cards or cash.
11) The system should ensure that no two customers can reserve the same seat.
12) Customers should be able to add a discount coupon to their payment.

We have five main Actors in our system:

Admin: Responsible for adding new movies and their shows, canceling any movie or show, blocking/unblocking customers, etc.

FrontDeskOfficer: Can book/cancel tickets.

Customer: Can view movie schedules, book, and cancel tickets.

Guest: All guests can search movies but to book seats they have to become a registered member.

System: Mainly responsible for sending notifications for new movies, bookings, cancellations, etc.

Here are the top use cases of the Movie Ticket Booking System:

Search movies: To search movies by title, genre, language, release date, and city name.

Create/Modify/View booking: To book a movie show ticket, cancel it or view details about the show.

Make payment for booking: To pay for the booking.

Add a coupon to the payment: To add a discount coupon to the payment.

Assign Seat: Customers will be shown a seat map to let them select seats for their booking.

Refund payment: Upon cancellation, customers will be refunded the payment amount as long as the cancellation occurs within the allowed time frame.
