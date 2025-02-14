package practiceFromStart;
public class OOPSPractice {
    public static void main(String[] args) {
//        Abstraction-> Similar to Encapsulation data hiding but in encapsulation it hides all the data even unnecessary data but in abstraction it only hides unnecessary and shows the important parts to users
//        Two Ways Of Doing This-> Abstract Classes And Interfaces
//        1. Abstract Class->To create abstract class we use "abstract" keyword, We Cannot Create an instance(object) of abstract class, and it can have abstract/non-abstract method, We can create constructor in abstract class
//        Calling Of Constructor Parent->Child->SubChild And So On
//        Horse h1=new Horse();
//        h1.eat();
//        h1.walk();
//        Chicken c1=new Chicken();
//        c1.walk();
//        c1.eat();

//        Polymorphism-> When We Want To Do The Similar Work In Many Forms Called This
//        Two Types-> 1. Compile Time-> Method Overloading, Run Time-> Method Overriding
//        Compile Time(Method Overloading)->
//        Calculator c1=new Calculator();
//        System.out.println(c1.sum(1,2));
//        System.out.println(c1.sum(1,2,3));
//        System.out.println(c1.sum((float)1.5,(float)2.5));

//        Run Time(Method Overriding) We Use "extends" keyword
//        Deer d1=new Deer();
//        d1.eat();


//        Inheritance
//        Here We Declear A Object Of Child and From This Child We Are Inheriting The Animal Class Which is It's Parent
//        This is Single Level Inheritance
//        Fish shark=new Fish();
//        When We Call The The Out Also Gets Printed Of The Parent Class Beacuse We Inheritaed it
//        shark.eat();
//        shark.breath();
//        shark.swims();

//        Multilevel inheritance
//        Tuna t1=new Tuna();
//        t1.eat();
//        t1.swims();
//        t1.sing();

//        Hierarchal Inheritance
//        Horse h1=new Horse();
//        h1.eat();
//        h1.runs();
//
//        Cow c=new Cow();
//        c.eat();
//        c.givesMilk();

//        Heribrid Inheritance Combination Of All




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
//        Student s1=new Student();
//        s1.name="Abhishek";
//        s1.roll=1234;
//        s1.password="jasdjas";
//        Student s2=new Student(s1);
//        s2.password="asdas";

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
//class Student{
//    String name;
//    int roll;
//    String password;
//
////    Here We are doing coping of the constructor
//    Student(Student s1){
//        this.name= s1.name;
//        this.roll= s1.roll;
//    }
//    Student(){
//        System.out.println("This is constructor");
//    }
//}





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



//Inheritance-> When The Properties Of The Parent Class(Base Class) Gets Called Or Inherit By The Child Class(Derived Class) Then It is called Inheritance
//For Inherit The Class Of The Parent Class To Child Class We Use Keyword Called "extends"



//class Animal{
//    String color;
//    void eat(){
//        System.out.println("Animal Eats");
//    }
//    void breath(){
//        System.out.println("Animal Breath");
//    }
//}
////This extends all the properties of Animal Class And Along With That We Can Write It's Own Properties Also
////This is Single Level Inheritance Base->Derived Inherits Base
//class Fish extends Animal{
//    int fins;
//    void swims()
//    {
//        System.out.println("Fish Swims");
//    }
//}
//
////MultiLevel Inheritance
//class Tuna extends Fish{
//    int mustash;
//    void sing(){
//        System.out.println("Tuna Fish Sings");
//    }
//}
//
////Herirachal Inheritance-> Single Base Class And Multiple Derieved Class
//class Horse extends Animal{
//    int legs;
//    void runs(){
//        System.out.println("It runs Fast");
//    }
//}
//class Cow extends Animal{
//    String name;
//    void givesMilk(){
//        System.out.println("Cow Gives Milk");
//    }
//}




//Polymorphism
//1. Compile Time(Method OverLoading)-> Multiple Functions With Same Name But Has Different Parameters, And Also Should Have Different Counts
//class Calculator{
//    int sum(int a,int b){
//        return a+b;
//    }
//    float sum(float a, float b){
//        return a+b;
//    }
//    int sum(int a,int b,int c){
//        return a+b+c;
//    }
//}

//2. Run Time(Method Overriding)-> Parent And Child Class Contains Same Function But With Different Definition
//class Animal{
//    void eat(){
//        System.out.println("Eats Everything");
//    }
//}
//class Deer extends Animal{
//    void eat(){
//        System.out.println("Eats Grass");
//    }
//}


//Abstract Class
abstract class Animal{
    void eat(){
        System.out.println("Animal Eats");
    }
//    We did not write the implementation in this method so it is abstract method, abstract methods are those methods which do not have implementation
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("Walks On 4 Legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walks On 2 legs");
    }
}