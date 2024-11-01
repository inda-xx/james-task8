public class Item {
    private String itemName;
    private String itemDescription;
    private boolean isCollectible;

    public Item(String itemName, String itemDescription, boolean isCollectible) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.isCollectible = isCollectible;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public boolean isCollectible() {
        return isCollectible;
    }
}