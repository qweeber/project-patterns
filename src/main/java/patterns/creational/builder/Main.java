package patterns.creational.builder;

public class Main {
    public static void main(String[] args) {

        Car car = new Car.Builder()
                .withBrand("Ford")
                .withModel("Mustang")
                .withCcm(5)
                .withColor("czarny chrom")
                .withMaxSpeed(350)
                .build();

        System.out.println(car);
    }
}
