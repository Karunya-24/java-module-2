public class PassByValue {

    static void changeValue(int number) {
        number = 100;
    }

    public static void main(String[] args) {

        int value = 10;

        System.out.println("Before method call = " + value);

        changeValue(value);

        System.out.println("After method call = " + value);
    }
}