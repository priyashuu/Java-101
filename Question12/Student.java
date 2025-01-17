class Student {
    String  name;
    int roll_no;
    double marks;
    public  Student(String name, int roll_no ,double marks){
        this.name = name;
        this.roll_no = roll_no;
        this.marks= marks;


    }
     void setDetails(String name , int roll_no , double marks ){
        this.name = name;
        this.roll_no = roll_no;
        this.marks= marks;
    }
     void showDetails () {
        System.out.println("The name is " + name);
        System.out.println("roll no is " + roll_no);
        System.out.println("marks is " + marks);
        
    }
    public static void main(String[] args) {
        Student s1  = new Student("priya",2 ,37.8);
        System.out.println("construtor is called");
        s1.showDetails();
        System.out.println("using by methods");
        Student s2 = new Student(" ", 0, 0);
        s2.setDetails("ashu",34 ,87.9 );
        s2.showDetails();
        System.out.println("object refrence");
        Student s3 = new Student("null", 0, 0);
        s3.name="sona";
        s3.roll_no=9;
        s3.marks=87.9;
        s3.showDetails();

        
    }
}
