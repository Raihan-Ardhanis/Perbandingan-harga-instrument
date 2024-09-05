public class Instrument {
    private String type;
    private double price;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Instrument() {
        type = "null";
        price = 0;
    }
    

    public Instrument (String c, double e) {
        price = e;
        type = c;
    }

    public void print() {
        System.out.println("Tipe :"+type);
        System.out.println("Harga :"+price);
        
    }
    




    
}
