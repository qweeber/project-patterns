package patterns.creational.singleton.ex0Universe;

public class Main {
    public static void main(String[] args) {

        UniverseV1 universeV1 = UniverseV1.INSTANCE;
        UniverseV1 universeV12 = UniverseV1.INSTANCE;
        UniverseV2 universeV2 = UniverseV2.getInstance();
        UniverseV3 universeV3 = UniverseV3.getInstance();
        UniverseV4 universeV4 = UniverseV4.getInstance();

        System.out.println(universeV1 == universeV12);





        System.out.println(universeV2);
        System.out.println(universeV3 == UniverseV3.getInstance());
        System.out.println(universeV4 == UniverseV4.getInstance());

        //----------------------------------------------------
        universeV2.setAvgTemperature(5.23);
        universeV2.setMass(1234);



    }
}
