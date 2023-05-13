public class Motorbike {
    private String id;
    private String name;
    private String manu;
    private int quantity;
    private double price;
    private double weight;
    private String date;

    public void printMotorbike() {
        System.out.println(this.id + " " + this.name + " " + this.manu + " " + this.quantity + " " + this.price + " " +
                this.weight + " " + this.date);
    }
}