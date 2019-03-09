class Villa extends LandHouse {

    public Villa(String cityName, String streetName, int propertyNumber, int area, int roomNum){
        super(cityName,streetName,propertyNumber, area ,roomNum);
    }
    public double setPrice(){
        int base = 1000000;
        double percentage = 1.5* area; //
        double price = ((percentage * base)/100) + base;
        price = (2/3 *base)+ price;
        return price;
    }
    @Override
    public String toString() {
        return "Type: Villa"+super.toString();
    }
}
