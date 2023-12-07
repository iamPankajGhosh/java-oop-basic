public class Main {
    public static void main(String[] args) {
        // Declare variables
        String name = "pankaj";
        int age = 18;
        boolean isLoggedIn = true;
        
        // Output the data types
        System.out.println("Type of name: " + name.getClass().getSimpleName());
        System.out.println("Type of age: " + age.getClass().getSimpleName());
        System.out.println("Type of isLoggedIn: " + isLoggedIn.getClass().getSimpleName());
    }
}
