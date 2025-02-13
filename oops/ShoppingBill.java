

abstract class ShoppingBill {
    abstract void addItem(String item, int quantity, double price);
    abstract void generateBill();
}


class Bill extends ShoppingBill {
     double total = 0;
    
   
    void addItem(String item, int quantity, double price) {
        double cost = quantity * price;
        total += cost;
        System.out.println(item + " (" + quantity + " x " + price + ") = " + cost);
    }
    

    void generateBill() {
        System.out.println("----------------------");
        System.out.println("Total Bill: $" + total);
        System.out.println("----------------------");
    }
}


 class ShoppingBillSystem {
    public static void main(String[] args) {
        ShoppingBill bill = new Bill();
        bill.addItem("Pen", 10, 2);
        bill.generateBill();
    }
}

