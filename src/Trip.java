public class Trip {
    private Passenger passenger;
    private Driver driver;
    private Car car;
    private boolean accepted;
    private boolean started;
    private boolean finished;

    public Trip(Passenger passenger, Driver driver, Car car) {
        this.passenger = passenger;
        this.driver = driver;
        this.car = car;
        this.accepted = false;
        this.started = false;
        this.finished = false;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public void startTrip() {
        if (!accepted) {
            System.out.println("Trip can't start until driver accepts!");
            return;
        }
        started = true;
        System.out.println("Trip started with " + driver.getName() + " driving " + car);
    }

    public void finishTrip() {
        if (!started) {
            System.out.println("Trip can't finish before it starts!");
            return;
        }
        finished = true;
        System.out.println("Trip finished. " + passenger.getName() + " arrived safely!");
    }
}
//aaaa