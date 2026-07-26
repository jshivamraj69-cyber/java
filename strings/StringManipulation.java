package strings;

public class StringManipulation {
    public static void main(String[] args) {
        String firstName = "Shivam";
        String lastName = "Raj";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
    }
}
