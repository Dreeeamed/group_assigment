public class Car {
    private String model;
    private String plate;

    public Car() {
        this.model = "Camry";
        this.plate = "AAA111";
    }

    public Car(String model, String plate) {
        this();
        setModel(model);
        setPlate(plate);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String toString() {
        return getModel() + " (" + getPlate() + ")";
    }
}