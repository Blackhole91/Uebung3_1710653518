import javax.swing.*;

public class Vehicle {

    private int power;
    private double weight;
    private String name;


    public Vehicle(int power, double weight, String name) {
        this.setPower(power);
        this.setWeight(weight);
        this.setName(name);
    }
    public String printName (){
        System.out.println(this.getName());
        return name;
    }
    public void calculatePower(){
    JOptionPane.showMessageDialog(null,"Ps: "+this.getPower()*1.36);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
