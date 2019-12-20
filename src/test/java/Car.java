public class Car {
    /* car attributes*/

    /*primitives*/

    public int qtyWheels = 0;
    public int qtyLights = 0;
    public int doors = 0;
    public String prefixDomain = "A";
    public boolean turnOn = false;

    /*non primitives*/

    public String brand = "Ford";
    public String fullDomain = null;

    /*verificar*/
    public final String CHASIS_NUM = "ASDASD1234";

    /**Cosntructor**/

    public Car(int qtyWheels, int qtyLights, int doors, String prefixDomain, boolean turnOn, String brand, String fullDomain) {
        this.qtyWheels = qtyWheels;
        this.qtyLights = qtyLights;
        this.doors = doors;
        this.prefixDomain = prefixDomain;
        this.turnOn = turnOn;
        this.brand = brand;
        this.fullDomain = fullDomain;
    }

    /**getter**/
    public int getQtyWheels() {
        return qtyWheels;
    }

    public int getQtyLights() {
        return qtyLights;
    }

    public int getDoors() {
        return doors;
    }

    public String getPrefixDomain() {
        return prefixDomain;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public String getBrand() {
        return brand;
    }

    public String getFullDomain() {
        return fullDomain;
    }

    public String getCHASIS_NUM() {
        return CHASIS_NUM;
    }

    /**setters*/

    public void setQtyWheels(int qtyWheels) {
        this.qtyWheels = qtyWheels;
    }

    public void setQtyLights(int qtyLights) {
        this.qtyLights = qtyLights;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setPrefixDomain(String prefixDomain) {
        this.prefixDomain = prefixDomain;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFullDomain(String fullDomain) {
        this.fullDomain = fullDomain;
    }
}
