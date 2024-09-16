class A {
    int a=10;
    void display(){
       System.out.println("Parent Display Function");

    }
}

class B extends A{
    int a=20;
    void display(){
     super.display();
     System.out.println("Child Display");
     System.out.println("The Value of a"+this.a);
     System.out.println("The Value of a"+super.a);


    }
}



public class InheritanceOverriding {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2 = new B();
        obj1.display();
        obj2.display();
    }
}
