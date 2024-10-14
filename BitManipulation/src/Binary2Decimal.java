public class Binary2Decimal {

    public static void main(String[] args) {
        int decimalNumber = 15;

        System.out.println("Decimal: " + decimalNumber);

        String binaryNumber = "";
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryNumber = remainder + binaryNumber;

            decimalNumber /= 2;
        }

        System.out.println("Binary Number of the decimal is:" + binaryNumber);
        Binary2Decimalfuntion();
    }

    private static void Binary2Decimalfuntion() {
        String binaryString = "1010"; // Example binary string
        int decimal = Integer.parseInt(binaryString, 2); // Convert binary to decimal
        System.out.println("Binary: " + binaryString + " in Decimal: " + decimal);
    }
}
