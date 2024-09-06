class Test{
    int a,b;
    Test(){
        a=0;
        b=0;
    }
     Test(int  x,int y){
      this.a=x;
      this.b=y;
}
}

public class ConstructorExample{
    public static void main(String[] args) {
        Test obj1=new Test(100,22);
        Test obj2=new Test(100,44);
        Test obj3=new Test(50,60);
        System.out.println("Obj1==Obj2"+obj1.equals(obj2));
        System.out.println("Obj2==Obj3"+obj2.equals(obj3));
    }
}

