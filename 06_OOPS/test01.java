// class creates---> then usmei sa object banta ha
// creating class
class car {

    String color, brand;
    int speed;

    public void drive() {
        System.out.println("My car is good and it's on highway at speed of " + speed + "km/h");
    }

    public void PrintColor() {
        System.out.println(this.color);
    }

    public void Brand() {
        System.out.println(this.brand);
    }
}

public class test01 {
    public static void main(String[] args) {

        // create object
        car mycar = new car();
        mycar.color = "Red";
        mycar.speed = 45;
        mycar.drive();
        mycar.PrintColor();

        car car2 = new car();
        car2.color = "Black";
        car2.brand = "Sukuki";
        car2.Brand();
        car2.PrintColor();
        car2.speed = 12;
        car2.drive();

    }
}
