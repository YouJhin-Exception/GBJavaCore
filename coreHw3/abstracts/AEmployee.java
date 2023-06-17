package coreHw3.abstracts;

public abstract class AEmployee {
    private String firstName;
    private String lastName;

    private int age;
    private String post;
    private int salary;

    public AEmployee() {
        firstName = "John";
        lastName = "Doe";
        age = 0;
        post = "nowhere";
        salary = 0;
    }

    public AEmployee(String firstName, String lastName, int age, String post, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Our employees {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }

    //public abstract void changeSalary();
}
