public class Employeers {
    String name;
    int age;
    String salary;


    public Employeers(String _name, int _age, String _salary) {
        this.name = _name;
        this.age = _age;
        this.salary = _salary;
    }

    public void info () {
        System.out.printf("Name %s, Salary %s, Age %d", name, salary, age);
    };
}
