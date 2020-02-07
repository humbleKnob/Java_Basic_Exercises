public class Car {
    private int year;
    private String make;
    private int miles;
    private String model;



    public Car(int year, int miles, String model, String make) {
        this.year = year;
        this.miles = miles;
        this.model = model;
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public int getMiles() {
        return miles;
    }

    public void drive(int miles) {
        this.miles += miles;
    }

    public void setMiles(int miles) { this.miles = miles; }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "This car is a " + this.getYear() + " " + this.getModel() +
                " " + this.getMiles();
    }
}
