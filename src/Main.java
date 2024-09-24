public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Fruit fruit = new Fruit("Apple", 20, "Fuji");
        Weapon weapon = new Weapon("Sword", 2, 75, "Melee");

        inventory.addItem(fruit);
        inventory.addItem(weapon);

        inventory.addItem("Orange", 12, "Mandarin");
        inventory.addItem("Gun", 1, 60, "Ranged");

        inventory.displayInventory();
    }
}