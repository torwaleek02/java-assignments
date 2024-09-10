//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private String firstName;  //instance variable
    private static int studntsCount; // class variable
    public static void main(String[] args) {
        int age;  // local variable


        System.out.println("Using static variable");
        studntsCount = 0;
        System.out.println("Number of students: " + studntsCount);

        System.out.println("Using Instance variable");

        Main main = new Main();
        main.firstName = "Tork";
        studntsCount++;
        System.out.println("Firstname: " + main.firstName);
        System.out.println("Number of students: " + studntsCount);

        System.out.println("Using Local variables");
        age = 24;
        System.out.println("Age: " + age);

    }
}