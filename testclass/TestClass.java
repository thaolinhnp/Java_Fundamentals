public class TestClass {
  int x = 5;
  final int y = 3;
  int z;

  // static method
  static void StaticMethod() {
    System.out.println("Called without create an object");
  }

  // public method
  public void PublicMethod() {
    System.out.println("Called with create an object");
  }

  // pulic method with parameter
  public void Age(int Age) {
    System.out.println("I\'m " + Age);
  }

  // contructor: the constructor name must match the class name, and it cannot have a return type (like void).
  public TestClass(int numb){
    z = x + y + numb;
  }

  public static void main(String[] args) {
    int numb = 6;
    TestClass myObj = new TestClass(numb);
    myObj.x = 40;
    // myObj.y = 10; // error: cannot assign a value to final variable y
    System.out.println("x new = " + myObj.x);
    System.out.println(myObj.y);
    System.out.println("x + y + "+ numb + " = " + myObj.z); // Also note that the constructor is called when the object is created.

    StaticMethod();
    myObj.PublicMethod();
    myObj.Age(29);

    // Encapsulation
    Person myObj1 = new Person();
    myObj1.setName("John");
    System.out.println(myObj1.getName());
    /*Class attributes can be made read-only (if you only use the get method),
     or write-only (if you only use the set method)*/
  }
}