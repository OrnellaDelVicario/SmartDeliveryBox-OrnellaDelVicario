public class SmartBox<T> {
    private T item;

    // Method to add an item
    public void addItem(T item) {
        this.item = item;
    }

    // Method to obtain an item
    public T getItem() {
        return item;
    }
}
