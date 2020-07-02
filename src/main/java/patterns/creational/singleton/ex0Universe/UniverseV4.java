package patterns.creational.singleton.ex0Universe;

public class UniverseV4 {
    private volatile static UniverseV4 instance;

    private UniverseV4(){}

    public static UniverseV4 getInstance(){
        if(instance == null){
            synchronized (UniverseV4.class){
                if(instance == null){
                    instance = new UniverseV4();
                }
            }
        }
        return instance;
    }


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
