public class VariableScopes {
    // Class scope variable (field)
    static int classScopeVar = 10;

    // Instance variable (also class scope, but per object)
    int instanceVar = 20;

    public static void main(String[] args) {
        // Method scope variable
        int methodScopeVar = 30;
        System.out.println("Class scope variable: " + classScopeVar);
        
        // Accessing instance variable requires an object
        Main obj = new Main();
        System.out.println("Instance variable: " + obj.instanceVar);
        System.out.println("Method scope variable: " + methodScopeVar);

        // Loop scope variable
        for (int i = 0; i < 2; i++) {
            // 'i' is only accessible inside this loop
            System.out.println("Loop scope variable i: " + i);
            
            // Bracket scope variable
            if (i == 1) {
                int bracketScopeVar = 100;
                System.out.println("Bracket scope variable: " + bracketScopeVar);
            }
            // Uncommenting the next line would cause an error because bracketScopeVar is not visible here
            // System.out.println(bracketScopeVar);
        }
        // Uncommenting the next line would cause an error because 'i' is not visible here
        // System.out.println(i);

        // Variable shadowing demonstration
        int classScopeVar = 50; // This shadows the class scope variable within main method
        System.out.println("Shadowed classScopeVar in main: " + classScopeVar);
        obj.shadowingExample();
    }

    void shadowingExample() {
        int instanceVar = 99; // Shadows the instance variable
        System.out.println("Shadowed instanceVar in method: " + instanceVar);
        System.out.println("Actual instance variable: " + this.instanceVar);
    }
}
