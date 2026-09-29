public class VariableScope {

    static int staticVariable = 100;

    int instanceVariable = 200;

    void display() {

        int localVariable = 300;

        System.out.println("Local Variable = " + localVariable);
        System.out.println("Instance Variable = " + instanceVariable);
        System.out.println("Static Variable = " + staticVariable);
    }

    public static void main(String[] args) {

        VariableScope obj = new VariableScope();

        obj.display();
    }
}