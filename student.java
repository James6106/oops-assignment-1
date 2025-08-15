public class Student {
	 private String name;
	    private int age;
	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        if (name != null && !name.trim().isEmpty()) {
	            this.name = name;
	        } else {
	            System.out.println("Invalid name! Must be a non-empty string.");
	        }
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        if (age > 0) {
	            this.age = age;
	        } else {
	            System.out.println("Invalid age! Must be a positive integer.");
	        }
      }
	    public void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
}
