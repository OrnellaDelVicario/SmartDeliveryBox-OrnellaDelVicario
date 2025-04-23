public class TestSmartBox {
     public static void main(String[] args) {
            // Smartbox for documents
            SmartBox<Document> documentBox = new SmartBox<>();
            Document doc = new Document("Invoice", "Invoice content here");
            documentBox.addItem(doc);
            System.out.println("Item in Document Box: " + documentBox.getItem());

            // Smartbox for electronics
            SmartBox<Electronic> electronicBox = new SmartBox<>();
            Electronic electronic = new Electronic("Smartphone", "BrandX");
            electronicBox.addItem(electronic);
            System.out.println("Item in Electronic Box: " + electronicBox.getItem());
        }
    }