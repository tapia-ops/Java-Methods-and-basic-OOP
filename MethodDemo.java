public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to the Method Demo!");
        
        printGreetring("Alice");
        printGreetring("Bob");

        int result = sumNumbers(5, 7);
        System.out.println("The sum of 5 and 7 is: " + result);
    }
    
    public static void printGreetring(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java methods");
    }

    private static int sumNumbers(int a, int b) { // Add a second method to sum integers
        return a + b;
    }
}
