class Vehical {
    protected String brand = "Ford"; //protected: The code is accessible in the same package and subclasses
    public void honk() {
        System.out.println("Tuut, Tuut!");
    }
}

class Car extends Vehical {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        // create a Car object
        Car myCar = new Car();

        // myCar object inherits the method from class Vehical
        myCar.honk();

        // myCar object inherits the "brand" attribute from class Vehical
        System.out.println(myCar.brand + " - " +myCar.modelName);
    }
}