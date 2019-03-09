class GardenApartment extends Apartment {

    public GardenApartment(String cityName, String streetName, int propertyNumber, int floor, int apartmentNum, int roomNum){
        super(cityName,streetName,propertyNumber, floor, apartmentNum,roomNum);
    }

    public double setPrice(){
        int base = 1000000;
        int percentage = 10*2; //floor in Garden Apartment is equal as 2nd floor in price
        int price = ((percentage * base)/100) + base;
        if(this.roomNum > 2){
            int extraRooms = this.roomNum - 2;
            price = price + (3*extraRooms* price)/100;
        }
        price = price + ((5 * price)/100);
        return price;
    }

    @Override
    public String toString() {
        return "Type: Garden Apartment"+super.toString();
    }
}
