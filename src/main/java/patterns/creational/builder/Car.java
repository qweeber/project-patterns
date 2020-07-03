package patterns.creational.builder;

public class Car {
    private String model;
    private String brand;
    private int maxSpeed;
    private int ccm;
    private String color;

    public Car(String model, String brand, int maxSpeed, int ccm, String color) {
        this.model = model;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.ccm = ccm;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCcm() {
        return ccm;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", ccm=" + ccm +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder{
        private String model;
        private String brand;
        private int maxSpeed;
        private int ccm;
        private String color;

        public Builder withModel(String model){
            this.model = model;
            return this;
        }

        public Builder withBrand(String brand){
            this.brand = brand;
            return this;
        }

        public Builder withMaxSpeed(int maxSpeed){
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder withCcm(int ccm){
            this.ccm = ccm;
            return this;
        }

        public Builder withColor(String color){
            this.color = color;
            return this;
        }

        public Car build(){
            return new Car(model, brand, maxSpeed, ccm, color);
        }
    }
}
