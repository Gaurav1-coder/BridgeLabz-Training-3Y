package JavaClassAndObject.level1;


class ClassEmployee {
    String name;
    int id;
    double salary;

    ClassEmployee(String name, int id, double salary) {
        this.name = name ;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name of employee: " + name);
        System.out.println("ID of employee: " + id);
        System.out.println("Salary of employee: " + salary);
    }
}
