class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine()");
    }

    public void speedUp() {
        System.out.println("Car -> speedUp()");
    }

    public void applyBrake() {
        System.out.println("Car -> brake()");
    }
}

class Tesla extends Car {
    public Tesla(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Tesla -> startEngine()");
    }

    @Override
    public void speedUp() {
        System.out.println("Tesla -> speedUp()");
    }

    @Override
    public void applyBrake() {
        System.out.println("Tesla -> brake()");
    }
}

class Porsche extends Car {
    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Porsche -> startEngine()");
    }

    @Override
    public void speedUp() {
        System.out.println("Porsche -> speedUp()");
    }

    @Override
    public void applyBrake() {
        System.out.println("Porsche -> brake()");
    }
}

class Nissan extends Car {
    public Nissan(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> startEngine()");
    }

    @Override
    public void speedUp() {
        System.out.println(getClass().getSimpleName() + " -> speedUp()");
    }

    @Override
    public void applyBrake() {
        System.out.println(getClass().getSimpleName() + " -> brake()");
    }
}

public class Main {

    public static void main(String[] args) {
        

        for (int i = 1; i < 6; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + ": " + car.getName() + "\n"
                                + "Cylinders: " + car.getCylinders() + "\n");
            car.startEngine();
            car.speedUp();
            car.applyBrake();
            System.out.println("\n");
        }

        }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3 + 1);
        switch (randomNumber) {
            case 1:
                return new Tesla("Model 123", 1);
            case 2:
                return new Porsche("Model 456", 5);
            case 3:
                return new Nissan("Model 678", 5);
        }
        return null;
    }
}