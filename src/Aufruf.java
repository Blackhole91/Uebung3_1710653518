public class Aufruf {
    public static void  main (String []args){

        Vehicle vehicle1 = new Vehicle(100,2000,"Audi");
        Vehicle vehicle2 = new Vehicle(200,3000,"BMW");

        vehicle1.printName();
        vehicle1.calculatePower();

        System.out.println("");

        vehicle2.printName();
        vehicle2.calculatePower();
    }
}
