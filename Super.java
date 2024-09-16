class One{
  int a=20;
    One(int a){
        System.out.println("_Parent Constructor Callling_");
        System.out.println("Parameter a = "+a);
        System.out.println("Data Member = "+this.a);
        this.a=a;
        System.out.println("Data Member "+this.a);

    }
    
    void display(){
        System.out.println("Parent Display Function()");
    }



}

class Two extends One{
     int a=30;
     Two(int a,int b){
        super(b);
        System.out.println("Child Constructor Calling");
		System.out.println("a="+a+"b= "+b);
		System.out.println("Child Data member a="+this.a);
     }
     void display() {
		super.display();
		System.out.println("Child Display()");
		System.out.println("The value of  : "+this.a);
		System.out.println("The value of  : "+super.a);
	}
    
}


public class Super{
    public static void main(String[] args) {
        System.out.println("Parent class obj :: obj1");
		One obj1 = new One(10);
		obj1.display();
		
		System.out.println();
		System.out.println("Child class obj :: obj2");
		Two obj2 = new Two(70,30);
        obj2.display();
    }
}
