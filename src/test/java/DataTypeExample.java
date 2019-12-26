import java.util.ArrayList;

public class DataTypeExample {
    /**
     * comentario
     **/

    public static void main(String[] args) {

        Car carOne = new Car(4, 2, 4, "b", false, "abc", "asdffas12343");
        Car carTwo = new Car(4, 2, 4, "b", false, "abc", "asdffas12343");
        Car carThree = new Car(4, 2, 4, "b", false, "abc", "asdffas12343");

        carOne.setDoors(5);
        carOne.setBrand("FIAT");

        carOne.getQtyLights();
        carOne.getDoors();
        carOne.getBrand();

        ArrayList<Car> carArrayList = new ArrayList<Car>();

        carArrayList.add(carOne);
        carArrayList.add(carTwo);


    }
}
