package practiceFromStart;
public class OOPSPractice {
    public static void main(String[] args) {
//        Object Creating
//        Created Pen Object Called p1
//        All The Objects Are Created In Heap
//        Pen p1=new Pen();
//        p1.setColor("Red");
//        p1.setTip(6);
//        System.out.println(p1.color);
//        System.out.println(p1.tip);
//        Student s1=new Student();
//        s1.setPercentage(95,96,98,92);
//        System.out.println(s1.percentage);



//        Pen p1=new Pen();
//        p1.setColor("Red");
//        System.out.println(p1.getColor());
//        p1.setTip(5);
//        System.out.println(p1.getTip());









        //Access Modifiers-> It's A Key Words Which Tells That Which Part Of Code Should Be Accessable To Which Class Or Package, It Basically Restrict The Access Of The Classes, Packages
//There Are Four Access Modifier: ( 1: Private-> The Access Of The Data Is Only Bound To Class Only, We Cannot Access The Data Of Private Class From Outside The Private Class,
// 2: Default->This Access Modifier Is Already Being Used By Us, Because It Is Set As Default In Java We Can Access The Data OutSide The Class, And Within Package, Not Outside The Package,
// Protected-> We Can Access The Data Within Class, Package, And Outside the Package By SubClass Also,
// Public-> It Is Accessable All Over The Place Like, Within Class,Package, Outside Package, etc;

//        BankAccount b1=new BankAccount();
//        b1.username="Ahisjek24";
////        We Can Able To Access The Password As It Is Private But We Can Only Change It
////        b1.password=""
//        b1.setPassword("ashbfkasf");
////        Also We Can Print It Even After Changing The Password
////        System.out.println(b1.password);







//        Constructors-> It is a special of type of method(function) which automatically get invoked at the time of object creation
//        It has the same name as the class
//        It does not have any return type not even (void)
//        It can be only called once at the time of object creation
//        Memory Allocation happens when the constructor is called
//        Student s1=new Student("Abhishek");
//        System.out.println(s1.name);
//        //        Here as we already called constructor we cannot call it again
//        //        Example like this -> s1.Student() this is not possible

//        Copy Constructor
        Student s1=new Student();
        s1.name="Abhishek";
        s1.roll=1234;
        s1.password="jasdjas";
        Student s2=new Student(s1);
        s2.password="asdas";

    }
}



//Constructor
//class Student{
//    String name;
//    int age;
////    This is The Constructor As It HAs The Same Name As The Class And Also If We Do Not Define It Java Will Automatically Create It
//Types Of Constructor
//1. Non-Parametrised Constructor-> It Has not parameters, arguments
//    Student(){
//          System.out.println("This is Non Parameterised");
//      }
//This is Parameterised Constructor because it has parameter
//    Student(String name){
//        this.name=name;
//    }
//}


//Copy Constructor-> When We copy the all properties of one object to another object is called copy constructors
class Student{
    String name;
    int roll;
    String password;

//    Here We are doing coping of the constructor
    Student(Student s1){
        this.name= s1.name;
        this.roll= s1.roll;
    }
    Student(){
        System.out.println("This is constructor");
    }
}





//class BankAccount{
//    public String username;
//    private String password;
////    We Cannot Access It But By Doing This We Can Change
//    public void setPassword(String pwd){
//        password=pwd;
//    }
//}




//Getter-> When We Want To Return The Value We Use This And Setters-> When We Want To Set Value We Use This Or Modify The Value
//this Keyword-> this keyword is used to refer the current object, it is mainly useful when the names of the variable is same
//Class


//This is also called Encapsulation as we wrapping up data and methods(functions) in a single unit which we called class, and also doing data hiding which means using access modifier for the data hiding , so this is also called encapsulation
//class Pen{
////    Prop+Fun
//
////    Prop
//
////    By Doing This We Can Able To Access The color and tip by just calling it with the object and dot operator and to access we have to use getters and setters
//    private String color;
//    private int tip;
//
//    String getColor(){
//        return this.color;
//    }
//    int getTip(){
//        return this.tip;
//    }
////    Fun
//    void setColor(String newColor){
////        Here this.color refers to the String color
//        this.color=newColor;
//    }
//    void setTip(int newTip){
//        tip=newTip;
//    }
//
//}




//class Student{
//    String name;
//    int age;
//    int percentage;
//    void setPercentage(int math,int phy,int chem,int cs){
//        percentage=(math+phy+chem+cs)/4;
//    }
//}