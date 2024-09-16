class Parent 
{
  final int a=10;
  final int b=20;
  int c=30;
   void display1(){
    System.out.println("Parent display function  1");
   }
   final void display2(){
    System.out.println("Parent display function  2");
   }

}

class Child extends Parent{
    final int a=10;
    final int b =20;
    int c=30;
    void display1() {
		//this.a=5;//we can not assign 
		System.out.println("Parent class display1");
	}

//	void display2() {
//		System.out.println("Parent class display2");
//	}
	
}



public class Final {
    public static void main(String[] args) {
        Parent p=new Parent();
		//p.a23;
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(p.c);
       Child C=new Child();
       System.out.println(C.a);
       System.out.println(C.b);
       System.out.println(C.c);
       C.display1();
    }
}
