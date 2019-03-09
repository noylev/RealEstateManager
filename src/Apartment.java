abstract class Apartment extends Property{

    int floor;
    int apartmentNum;
    int roomNum;

    public Apartment(String cityName, String streetName, int propertyNumber, int floor, int apartmentNum, int roomNum){
        super(cityName, streetName,propertyNumber);
        this.floor = floor;
        this.apartmentNum = apartmentNum;
        this.roomNum = roomNum;
    }

    @Override
    public String toString() {
        return "\nCity Name: " +this.getCityName()+ "\nStreet Name: "+ this.getStreetName() + "\nFloor: "+this.floor+
                "\nApartment Number: "+apartmentNum +"\nNumber of Rooms: "+roomNum + "\nPrice: "+(int)this.getPrice()+"\n";
    }
}