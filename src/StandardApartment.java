class StandardApartment extends Apartment {

    public StandardApartment(String cityName, String streetName, int propertyNumber, int floor, int apartmentNum, int roomNum){
        super(cityName,streetName,propertyNumber, floor, apartmentNum,roomNum);
    }
    public double setPrice(){
        int base = 1000000;
        int percentage = 10*floor;
        int price = ((percentage * base)/100) + base;
        if(this.roomNum > 2){
            int extraRooms = this.roomNum - 2;
            price = price + (3*extraRooms* price)/100;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Type: Standard Apartment"+super.toString();
    }
}
