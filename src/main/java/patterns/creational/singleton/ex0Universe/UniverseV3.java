package patterns.creational.singleton.ex0Universe;

//Singleton leniwy(lazy)
public class UniverseV3 {

    private static UniverseV3 instance;

    public UniverseV3(){}

    public static UniverseV3 getInstance(){
        if(instance == null){
            instance = new UniverseV3();
        }
        return instance;
    }

    //----------------------------------------------
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
