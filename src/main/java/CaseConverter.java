import java.util.Scanner;

public class CaseConverter {

    public static void main(String[] args) {
        initialise();
    }

    public static void initialise() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.next();
        System.out.print("String entered was written in: ");

        if (string.matches(".*[A-Z].*")) {
            System.out.println("CamelCase");
            string = ConvertCase.toSnakeCase(string);
        } else if (string.matches(".*_.*")) {
            System.out.println("SnakeCase");
            System.out.print("Capitalise: ");
            string = ConvertCase.toCamelCase(string, Boolean.parseBoolean(scanner.next()));
        }

        System.out.println(string);
    }
}
