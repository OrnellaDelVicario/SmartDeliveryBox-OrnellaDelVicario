public class Electronic {
    private String name;
    private String brand;

    public Electronic(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

        @Override
        public String toString() {
            return "Electronic: " + name + " (" + brand + ")";
        }
}
