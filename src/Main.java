public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Merei");
        Driver driver = new Driver("Aman");
        Car car = new Car("Cobalt", "ABC-123");

        Trip trip = passenger.requestTrip(driver, car);

        driver.acceptTrip(trip);

        trip.startTrip();
        trip.finishTrip();

        passenger.rateDriver(driver, 5);

        System.out.println(driver.getName() + "'s average rating: " + driver.getAverageRating());
    }
}