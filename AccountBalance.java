package Mypack;

class Balance1 {
    String name;
    float balanceAmount; 

    // Constructor
    public Balance1(String s, float f) {
        name = s;
        balanceAmount = f;
    }

    // Method to display balance
    void displayShow() {
        if (balanceAmount < 0) {
            System.out.println("No Balance");
        } 
	  else if (balanceAmount > 0) {
            System.out.println("Name: " + name);
            System.out.println("Balance: " + balanceAmount);
        }
    }
}

class AccountBalance {
    public static void main(String args[]) {
        // Use Balance1 here to match the class name
        Balance1 current[] = new Balance1[3]; 

        // Initialize objects of Balance1 class
        current[0] = new Balance1("A", 1000.0f);
        current[1] = new Balance1("B", 2000.0f);
        current[2] = new Balance1("C", -2.0f);

        // Display account balance for each
        for (int i = 0; i < 3; i++) {
            current[i].displayShow();
        }
    }
}
