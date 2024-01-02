public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String firstName = "Abdullah";
        String lastName = "Bin Essa";
        int age = 23;
        double amount = 30;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(amount);

        boolean isMarried = false;

        String deposit = "deposit";
        String withdraw = "Withdraw";

        System.out.println("The amount is " + amount);
        System.out.println("Would you like to " + deposit + " or " + withdraw + " the amount?");

        int amount2 = 5;

        System.out.println(amount2 + " plus " + amount2 + " makes " + (amount2 + amount2));

        String fullName = " John doe";

        System.out
                .println("my name is " + fullName.substring(1, 5) + " and my last name length is "
                        + fullName.substring(6, 9).length());

        System.out.println(fullName.substring(6, 9).startsWith("d"));

        double amountKWD = 86;

        double amountUSD = amountKWD * 3.25;

        System.out.println(amountKWD + " KWD = " + amountUSD + " USD");

    }
}
