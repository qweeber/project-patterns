package patterns.creational.singleton.ex0Universe;

//Singleton zachlanny (eager)
public class UniverseV2 {
    private static UniverseV2 instance = new UniverseV2();

    public static UniverseV2 getInstance(){
        return instance;
    }

    private UniverseV2(){}


    //---------------------------------------------
    private double mass;
    private double avgTemperature;

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getAvgTemperature() {
        return avgTemperature;
    }

    public void setAvgTemperature(double avgTemperature) {
        this.avgTemperature = avgTemperature;
    }
}
