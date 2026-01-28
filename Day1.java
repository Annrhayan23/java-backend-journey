class Student{
    String name;
    int age;
    String address;
    int rollno;

    Student(String name,int age,String address,int rollno){
        this.name=name;
        this.age=age;
        this.address=address;
        this.rollno=rollno;
    }

    void showDetails(){
        System.out.println("Name:"+name +",Age:"+age+",Address:"+address+",Rollno:"+rollno);
    }

}
class Day1{
    public static void main(String[]args){
        Student s1=new Student("ann",20,"india",101);
    s1.showDetails();  
}
}
