class OuterClass {
    // Static nested class
    public static class StaticNestedClass {

        // Static nested class can have its own fields and methods
        private int nestedField = 20;

        // Constructor for the static nested class
        public StaticNestedClass() {
            // Empty constructor
        }

        // Method in the static nested class
        public void display() {
            System.out.println("Value of nestedField: " + nestedField);
        }
    }
}

// The StaticNestedClass has its own fields and methods,
// and you can create an instance of it without needing
// an instance of the OuterClass. You can also access the
// instance variables of the OuterClass from within the
// StaticNestedClass if needed.

class StaticNeatsedClassDemo {
    public static void main(String[] args) {
        // Create an instance of the static nested class
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();

        // Access the nested class's method and field
        nestedObj.display();
    }
}