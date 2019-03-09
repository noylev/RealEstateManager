import java.util.*;

public class RealEstateManager {
    private  Map<String,  HashMap<String,HashSet<Property>>> RealEstateManager = new HashMap<String, HashMap<String,HashSet<Property>>>();
    private ArrayList<Property> propertiesByPrice = new ArrayList<Property>();

    private static RealEstateManager instance = null;
    private RealEstateManager() {
       // Map<String, LinkedList<String>> RealEstateManager = new HashMap<String, LinkedList<String>>();

        // Exists only to defeat instantiation.
    }
    public static RealEstateManager getInstance() {
        if(instance == null) {
            instance = new RealEstateManager();
        }
        return instance;
    }

    public void setProperty(Property property){
        this.propertiesByPrice.add(property); //add to the prices list first

        String city = property.getCityName();
        String street = property.getStreetName();
        if(this.RealEstateManager.get(city)== null){ //this is case the city did not existed
            System.out.println("hereeee");
            HashMap<String,HashSet<Property>> cityMap = new  HashMap<String,HashSet<Property>>();
            HashSet<Property> streetProperties = new HashSet<Property>();
            streetProperties.add(property);
            cityMap.put(street, streetProperties);
            this.RealEstateManager.put(city, cityMap);
        }
        else{
            HashMap<String,HashSet<Property>> cityMap = this.RealEstateManager.get(city);
            if(cityMap.get(street) == null){
                HashSet<Property> streetProperties = new HashSet<Property>();
                streetProperties.add(property);
                cityMap.put(street, streetProperties);
            }
            else{
                HashSet<Property> streetProperties = cityMap.get(street);
                streetProperties.add(property);// no need to check duplicates because its a set

            }


        }
    }

     public HashMap<String,HashSet<Property>> getPropertiesByCity(String city) throws NullPointerException{
         HashMap<String,HashSet<Property>> cityProperties = this.RealEstateManager.get(city);
         if(cityProperties == null){
             throw new NullPointerException();
         }
         return cityProperties;
    }

    public HashSet<Property> getPropertiesByStreet(String city, String street){

        HashMap<String,HashSet<Property>> cityProperties = getPropertiesByCity(city);
        HashSet<Property> streetProperties = cityProperties.get(street);
        if(streetProperties == null){
            throw new NullPointerException();
        }
        return streetProperties;

    }

    public LinkedList<Property> priceLowerThan(double z) throws NullPointerException{

        LinkedList<Property> list = new LinkedList<Property>();
        int count = 0;
        while (count < propertiesByPrice.size()) {
            Property property = propertiesByPrice.get(count);
            if(property.getPrice() < z){
                list.add(property);
            }
            count++;
        }
        if(list == null){
            throw new NullPointerException();
        }
        return list;
    }

}