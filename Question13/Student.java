class Student {
    String name;
    int roll_no;
    public Student(String name ,int roll_no) {
        this.name =name ;
        this.roll_no= roll_no;
    }
    void display() {
       System.out.println("Hello " + name);
       System.out.println("roll_no " + roll_no);
    }
    public static void main(String[] args) {
        Student s1 = new Student("priya", 230);
        s1.display();
    }
}