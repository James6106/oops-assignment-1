public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("james", 18);
        System.out.println("Initial Details:");
        student1.displayInfo();
        student1.setName("Bob");
        student1.setAge(22);
        System.out.println("\nUpdated Details:");
        student1.displayInfo();
        student1.setName("");
        student1.setAge(-5);
    }
}
