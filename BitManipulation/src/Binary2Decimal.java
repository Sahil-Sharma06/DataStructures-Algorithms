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

        System.out.println("Binary Number :" + binaryNumber);
    }
}
