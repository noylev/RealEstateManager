abstract class LandHouse extends Property{

    int area; //including the yard
    int roomNum;

    public LandHouse(String cityName, String streetName, int propertyNumber, int area, int roomNum){
        super(cityName, streetName,propertyNumber);
        this.area = area;
        this.roomNum = roomNum;
    }
    @Override
    public String toString() {
        return "\nCity Name: " +this.getCityName()+ "\nStreet Name: "+ this.getStreetName() +
                "\nArea (Square Meters): "+this.area+"\nNumber of Rooms: "+roomNum + "\nPrice: "+(int)this.getPrice();
    }

}