//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
            int option = 0;
            double subtotal, count, premiumCounter, total;
            Scanner input = new Scanner(System.in);
            String menu = """
                =========================
                          MENU
                =========================
                Choose the option you prefer
                1. Product basic = $10.000
                2. Product medium = $30.000
                3. Product premium = $70.000
                4. Finish order
                """;
            subtotal = 0;
            count = 0;
            premiumCounter = 0;
    System.out.println(menu);
    System.out.println("");
            do {
                if (input.hasNextInt()){
                    option = input.nextInt();
                }
                //Verify the product and add it to the subtotal and counter
                if (option == 1){
                    subtotal += 10000;
                    count +=1;
                } else if (option ==2){
                    subtotal += 30000;
                    count +=1;
                } else if (option == 3){
                    subtotal += 70000;
                    count +=1;
                    premiumCounter +=1;
                }
            } while (option!=4);
            if (subtotal > 100000){
                subtotal -= (subtotal * 0.1);
            }
            total = subtotal  + (subtotal*0.19);
            //Print the total and counters
    System.out.println("The user has: " + count + " products");
    System.out.println((premiumCounter/count)*100 + " of the total of products in the order are premium");
    System.out.println("Total amount to pay = " + total);
}
