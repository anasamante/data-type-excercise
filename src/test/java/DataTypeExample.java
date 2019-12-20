public class DataTypeExample {
    /**
     * comentario
     **/

    public static void main(String[] args) {

        Car car = new Car(4, 2, 4, "b", false, "abc", "asdffas12343");

        car.setDoors(5);
        car.setBrand("FIAT");

        car.getQtyLights();
        car.getDoors();
        car.getBrand();


    }
}
