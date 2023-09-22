package MyCar;

public class TestCar {
    public static void main(String[] args) {
        new TestCar().run() ;
    }

    private void run() {
        Car car1 = new Car("Fiat", "500", "DUUT DUUT");  // because we have setters in contructor, we can just put in the arguments
        Car car2 = new Car( "Bugatti" , "Chiron" , "GRRR BAOW");

        car1.turnEngineOn();
       car1.sound();
       car1.drive();
       car1.park();
       car1.turnEngineOff();
        System.out.println("\n\n");
       car2.drive();
        System.out.println(car2.getHonkSound());
        car2.turnEngineOn();
        car2.drive();
        car2.park();
        car2.turnEngineOff();



    }
}
