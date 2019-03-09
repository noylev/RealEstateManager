import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        RealEstateManager realEstateManager= RealEstateManager.getInstance();
        Property apartment1 = new GardenApartment("TLV", "Ben Yehuda",4,5,20,3);
        Property apartment2 = new StandardApartment("TLV", "Dizingoff",12,3,2,2);

        realEstateManager.setProperty(apartment1);
        realEstateManager.setProperty(apartment2);
        LinkedList<Property> list = realEstateManager.priceLowerThan(20000000);
        System.out.println(list.getFirst().toString());
        System.out.println(list.getLast().toString());

        System.out.println(apartment1.toString());

    }
}
