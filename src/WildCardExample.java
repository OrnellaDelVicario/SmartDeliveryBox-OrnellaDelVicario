public class WildCardExample {
    public static void printItem(SmartBox<? extends Object> box) {
        System.out.println("Item in box: " + box.getItem());
    }

    public static void main(String[] args) {
        SmartBox<Document> docBox = new SmartBox<>();
        docBox.addItem(new Document("Report", "Report content"));
        printItem(docBox);

        SmartBox<Electronic> electronicBox = new SmartBox<>();
        electronicBox.addItem(new Electronic("Laptop", "BrandY"));
        printItem(electronicBox);
    }
}
