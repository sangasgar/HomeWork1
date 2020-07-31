public class Employeers {
    String fullName;
    String position;
    String email;
    String phone;
    String salary;
    int age;

    public Employeers(String fullName, String position, String email, String phone, String salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void  info () {
        System.out.printf("FullName %s\nposition %s \nemail %s \nphone %s \nsalary %s \nage %d", fullName, position, email, phone, salary, age);
        System.out.println();
        System.out.println();
    }

    public void infoAge(int ageUser) {
        if (age > ageUser) {
            System.out.printf("FullName %s\nposition %s \nemail %s \nphone %s \nsalary %s \nage %d", fullName, position, email, phone, salary, age);
            System.out.println();
            System.out.println();
        }

    }

}