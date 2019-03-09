abstract class Property{
    private final String cityName;
    private final String streetName;
    private final int propertyNumber;
    private double price;

    public Property(String cityName, String streetName, int propertyNumber){
        this.cityName = cityName;
        this.streetName = streetName;
        this.propertyNumber = propertyNumber;
        this.price = setPrice();
    }


    protected String getCityName(){
        return this.cityName;
    }

    protected String getStreetName(){
        return this.streetName;
    }

    protected int getProperyNumber(){
        return this.propertyNumber;
    }

    public double getPrice(){
        return this.price;
    }

    public abstract double setPrice();

}