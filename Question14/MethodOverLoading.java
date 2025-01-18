class Student {
    String name;
    int roll_no;
    
    public Student (){
        this("unknown",0);
    }
    public Student (String name){
        this(name ,0);
    }
    public Student (String name , int roll_no){
       this.name= name ;
       this.roll_no =roll_no;
    }
    void  show(){
        System.out.println("my name is " + name);
        System.out.println("the roll no is " + roll_no);
    }
}
public class MethodOverLoading{
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2 = new Student("ashu");
        Student s3 = new Student("ashu",45);
        System.out.println("student 1");
        s1.show();
        System.out.println("student 2");
        s2.show();
        System.out.println("student 3");
        s3.show();
    }
} 