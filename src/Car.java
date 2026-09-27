public class Car {
    String carmodel;
    int year;
    String color;

    void display(){
        System.out.println("The model of your car is " +carmodel+ " with the manufacturing year "+year+ " and the color  "+color);
    }
    void accelerate(){
        System.out.println("The acceleration of "+carmodel+" is 0 to 100 km/h");
    }
    void speed(){
        System.out.println("The speed of "+carmodel+" is 100 km/h");
    }
}
class CarMain{
     public static void main() {
         Car obj= new Car();
         obj.carmodel="Benz";
         obj.color="Black";
         obj.year=2021;
         obj.accelerate();
         obj.speed();
         obj.display();

    }
}