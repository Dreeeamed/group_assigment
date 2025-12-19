public class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Trip requestTrip(Driver driver, Car car) {
        Trip trip = new Trip(this, driver, car);
        System.out.println(name + " requested a trip with " + driver.getName() + " driving " + car.getModel());
        return trip;
    }

    public void rateDriver(Driver driver, int rating) {
        if (rating < 1 || rating > 5) {
            System.out.println("Rating must be between 1 and 5");
            return;
        }
        driver.receiveRating(rating);
        System.out.println(name + " rated " + driver.getName() + " with " + rating + " stars");
    }
}