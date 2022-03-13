public class Main {
    public static void main(String[] args) {
        Car davidCar= new Car();

        //davidCar.model="ionic";
        //davidCar.make="hyundai";
        //davidCar.year=2018;
        //davidCar.numberOfDoors=4;
        //davidCar.maxSpeed=205;
        //davidCar.color="blue";
//
//
        //Car barCar =new Car();
        //barCar.make="peugeot";
        //barCar.model="5008";
        //barCar.color="black";
        //barCar.year= 2018;
        //barCar.numberOfDoors=5;
        //barCar.maxSpeed=198;
//
        //System.out.println(barCar.color);
        //System.out.println(davidCar.year);
        //System.out.println(davidCar.numberOfDoors);
        //System.out.println(davidCar.make);
        //System.out.println(davidCar.model);
        //System.out.println(davidCar.maxSpeed);

        Animal dog = new Animal();
        Animal zebra = new Animal();

        dog.name="jojo the dog";
        dog.age=5;
        System.out.println(dog.name);
        System.out.println(dog.age);

        zebra.name="rosta";
        zebra.age=34;
        System.out.println(zebra.age);
        System.out.println(zebra.name);

        dog.makeSound();
        zebra.makeSound();
        dog.eat();
        zebra.eat();
    }
}
