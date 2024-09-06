public class MotorBike {

    //state
    private int speed; //member variable

    void setSpeed(int speed) { //local variable
        this.speed = speed;
    }

    int getSpeed() {
        return this.speed;
    }

    //behaviour
    void start() {
        System.out.println(speed);
        System.out.println("Bike Started");
    }
}
