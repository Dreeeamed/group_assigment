public class Driver {
    private final String name;
    private double averageRating;
    private int ratingCount;

    public Driver(String name) {
        this.name = name;
        this.averageRating = 0;
        this.ratingCount = 0;
    }

    public String getName() {
        return name;
    }

    public void acceptTrip(Trip trip) {
        trip.setAccepted(true);
        System.out.println(name + " accepted the trip for " + trip.getPassenger().getName());
    }

    public void receiveRating(int rating) {
        averageRating = ((averageRating * ratingCount) + rating) / (ratingCount + 1);
        ratingCount++;
    }

    public double getAverageRating() {
        return averageRating;
    }
}