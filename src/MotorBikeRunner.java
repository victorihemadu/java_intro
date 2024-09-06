public class MotorBikeRunner {

    public static void main(String[] args) {
        MotorBike honda = new MotorBike();
        MotorBike suzuki = new MotorBike();

        honda.start();
        suzuki.start();

        honda.setSpeed(100);
        System.out.println(honda.getSpeed());
        suzuki.setSpeed(50);
        System.out.println(suzuki.getSpeed());
    }

}
