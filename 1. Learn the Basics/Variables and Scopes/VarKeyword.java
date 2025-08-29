public class VarKeyword {
    public static void main(String[] args) {
        // The 'var' keyword allows Java to infer the type of the variable at compile time.
        // It can only be used for local variables (inside methods), not for fields or method parameters.

        // Example 1: Integer type inference
        var number = 10; // Java infers 'number' is of type int
        System.out.println("number (int): " + number);

        // Example 2: String type inference
        var message = "Hello, var!"; // Java infers 'message' is of type String
        System.out.println("message (String): " + message);

        // Example 3: List type inference
        var list = java.util.List.of(1, 2, 3); // Java infers 'list' is of type List<Integer>
        System.out.println("list (List<Integer>): " + list);

        // Note: 'var' cannot be used without initialization, or with null, because Java needs to infer the type.
        // var x; // Error: cannot use 'var' without initializer
        // var y = null; // Error: cannot infer type for local variable
    }
}

