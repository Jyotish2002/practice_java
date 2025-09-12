class student {
    String name;
    int Class, roll, id;

    public void info() {
        System.out.println(
                "My name is " + name + " and I m in class " + Class + " with roll and id is " + roll + " & " + id);
    }

}

public class test02 {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        s1.name = "Jyotish";
        s2.name = "Shubham";
        s3.name = "Pratham";
        s1.Class = 10;
        s2.Class = 11;
        s3.Class = 13;
        s1.roll = 1;
        s2.roll = 2;
        s3.roll = 3;
        s1.id = 001;
        s2.id = 002;
        s3.id = 003;
        s1.info();
        s2.info();
        s3.info();
    }

}
