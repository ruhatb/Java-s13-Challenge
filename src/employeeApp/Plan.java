package employeeApp;

public enum Plan {
    GUNLUK("günlük",100),
    AYLIK("aylık", 300),
    YILLIK("yıllık", 900);

    private String name;
    private double price;

    Plan(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
