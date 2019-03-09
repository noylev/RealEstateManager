class Cottage extends LandHouse {

    public Cottage(String cityName, String streetName, int propertyNumber, int area, int roomNum){
        super(cityName,streetName,propertyNumber, area ,roomNum);
    }
    public double setPrice(){
        int base = 1000000;
        double percentage = 1.5* area;
        double price = ((percentage * base)/100) + base;
        price = (1/3 *base)+ price;
        return price;
    }

    @Override
    public String toString() {
        return "Type: Cottage"+super.toString();
    }
}
