public class GrocerySearch {

    public static int findItem(String[] receipt, String target) {
        // Iterate through every item in the receipt
        for (int i = 0; i < receipt.length; i++) {
            if (receipt[i].equalsIgnoreCase(target)) {
                return i;  // Return the index where the item is found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        String[] receipt = {
                "Milk", "Bread", "Tomatoes", "Cereal", "Chicken",
                "Bananas", "Rice", "Juice", "Eggs", "Butter",
                "Pasta", "Salt", "Pepper", "Onions", "Garlic",
                "Carrots", "Beef", "Oil", "Soap", "Water",
                "Yogurt", "Cheese", "Fish", "Spinach", "Avocados"
        };

        String target = "Avocados";
        int index = findItem(receipt, target);

        if (index != -1) {
            System.out.println(target + " found at index: " + index);
        } else {
            System.out.println(target + " not found in the receipt.");
        }
    }
}
