package Oops;

public class GetterAndSetter {

    // Static inner class
    static class Student {
        // Private data members
        private String name;
        private int age;

        // Setter methods
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    // Main method inside the primary class
    public static void main(String[] args) {
        Student s = new Student();

        // Using setter methods
        s.setName("Rahul");
        s.setAge(20);

        // Using getter methods
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}