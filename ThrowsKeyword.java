public class ThrowsKeyword {

    static void checkNumber() throws Exception {

        throw new Exception(
                "Something went wrong");
    }

    public static void main(String[] args) {

        try {

            checkNumber();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}