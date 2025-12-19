public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Alice");
        Driver driver = new Driver("Bob");
        Car car = new Car("Toyota Prius", "ABC-123");

        Trip trip = passenger.requestTrip(driver, car);

        driver.acceptTrip(trip);

        trip.startTrip();
        trip.finishTrip();

        passenger.rateDriver(driver, 5);

        System.out.println(driver.getName() + "'s average rating: " + driver.getAverageRating());
    }
}