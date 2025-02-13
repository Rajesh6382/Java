import java.lang.*;


class Main {
    String name;
    int age;
    char grade;

   
    Main() {
        this.name = "John";
        this.age = 20;
        this.grade = 'A';
    }

    
    Main(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public static void main(String[] args) {
        
        Main stu1 = new Main();

       
        Main stu2 = new Main("Alice", 22, 'B');

        
        System.out.println("Default Student:");
        System.out.println("Name: " + stu1.name);
        System.out.println("Age: " + stu1.age);
        System.out.println("Grade: " + stu1.grade);

        System.out.println("\nCustom Student:");
        System.out.println("Name: " + stu2.name);
        System.out.println("Age: " + stu2.age);
        System.out.println("Grade: " + stu2.grade);
    }
}


class Book{
    String title;
    String author;
    double price;

 Book(String title,String author,double price){
    this.title=title;
    this.author=author;
    this.price=price;
    
}
public static void main(String[] args) {
    Book book=new Book("Programming Basics","Alice",25.99);

    System.out.println("Title   :"+book.title);
    System.out.println("author  :"+book.author);
    System.out.println("Price   :$"+book.price);    
}
}

class Empolyee{
    private String name;
    private String position;
    private int salary;

    void setname(String name){
        this.name=name;
    }
    void setpos(String position){
        this.position=position;
    }
    void setsalary(int salary){
        this.salary=salary;
    }


String getname(String name){
    return name;
}
String getpos(String position){
    return position;
}
int getsalary(int salary){
    return salary;
}

public static void main(String[] args) {
    Empolyee emp =new Empolyee();

    emp.setname("Alice");
    emp.setpos("Manager");
    emp.setsalary(50000);

    System.out.println("Name        :"+emp.name);
    System.out.println("Position    :"+emp.position);
    System.out.println("Salary      :$"+emp.salary);
}
}




class Rectangle{
    int length =5 ;
    int width =10;


static class Area extends Rectangle{
    int area(){
        int are =0;
        are = length * width;
        return are;
    }
}

static class Perimeter extends Rectangle{
    int perimeter(){
        int peri=0;
        peri = 2*(length + width);
        return peri;
    }
}
    public static void main(String[] args) {
      Area area = new Area();
      Perimeter perimeter = new Perimeter();

      System.out.println("Area      :"+area.area());
      System.out.println("Perimeter :"+perimeter.perimeter());
    }
}


class Circle{
    double radius =7;

static class Area extends Circle{
    double area(){
        double area;
        area = (22/7)*(radius*radius);
        return area;
    }
}

static class Circumference extends Circle{
    double circumference(){
        double circumference;
        circumference = 2*(22/7)*radius;
        return circumference;
    }
    public static void main(String[] args) {
        Area area = new Area();
        Circumference peri = new Circumference();

        System.out.println("Area               :"+area.area());
        System.out.println("Circumferance      :"+peri.circumference());
    
    }
}
}


class Bankacc{
    private int acc_no;
    private String holder_name;
    private double balance;

    void setacc_no(int acc_no){
        this.acc_no=acc_no;
    }
    void setholder_name(String holder_name){
        this.holder_name=holder_name;
    }
    void setbalance(double balance){
        this.balance=balance;
    }


int getacc_no(int acc_no){
    return acc_no;
}
String getholder_name(String holder_name){
    return holder_name;
}
double getbalance(double balance){
    return balance;
}

public static void main(String[] args) {
    Bankacc acc =new Bankacc();

    acc.setacc_no(12345);
    acc.setholder_name("John");
    acc.setbalance(1000);

   
    System.out.println("Balance    :$"+acc.balance);
}
}

class Car{
    String brand;
    String model;
    int year;

static class BMW extends Car{
     void car(){
        this.brand="BMW";
        this.model="X60";
        this.year=2022;
        System.out.println("Car : "+brand+" "+model+" "+"("+year+")");
     }


static class Porche extends Car{
        void car(){
           this.brand="Porche";
           this.model="Turbo";
           this.year=2024;
           System.out.println("Car1 : "+brand+" "+model+" "+"("+year+")");
        }

}
public static void main(String[] args) {
    BMW bmw = new BMW();
    Porche porche = new Porche();
    bmw.car();
    porche.car();
}
}
}


class Inventry{

    String product;
    int quantity;
    double price;

    

    void product(){
        this.product="HP Laptop";
        this.quantity=8;
        this.price=1600;
        System.out.print("Product     : "+product);
        System.out.print("Quantity    : "+quantity);
        System.out.println("Price       :$ "+price);

    }

    void product1(){
        this.product="MAC BOOK M5";
        this.price=3500;
        System.out.print("Product     : "+product);
        System.out.print("Price       :$ "+price);
    }


    public static void main(String[] args) {
        Inventry inventry = new Inventry();

        inventry.product();
        inventry.product1();
       
    }
}


class Library{

    String title;
    String author;

static class Book extends Library{
    void A_rack(){
        this.title="Data Science Basics";
        this.author="Jane Doe";
        System.out.println("Title : "+title+" Author :"+author+" (Avaliable)");
    }
static class CoreBook extends Library{
    void B_rack(){
        this.title="Computer Networks";
        this.author="William Hary";
    }
}
}
    public static void main(String[] args) {
        Book books=new Book();
        books.A_rack();   
    }
}

class StudentMark {

    int math = 80;
    int science = 70;
    int english = 90;

    void average() {
        int avg = (math + science + english) / 3; 
        System.out.println("Average Mark = " + avg);
    }

    public static void main(String[] args) {
        StudentMark mark = new StudentMark();
        mark.average(); 
    }
}

class Travel {
    String destination;
    int days;
    int cost;
}

class TravelPack extends Travel {
    void tour_france() {
        this.destination = "France";
        this.days = 10;
        this.cost = 1600;
    }
}

class TravelParis extends Travel {
    void tour_japan() {
        this.destination = "Paris";  
        this.days = 7;
        this.cost = 1500;
        System.out.println("Package: " + destination + ", " + days + " Days, $" + cost);
    }
}

 class TravelTour {
    public static void main(String[] args) {
        TravelParis japan = new TravelParis(); 
        japan.tour_japan();  
    }
}



