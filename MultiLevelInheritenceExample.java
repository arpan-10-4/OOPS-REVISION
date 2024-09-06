class GrandParent{
	public int x=10;
	private int y =20;
	protected int z=30;
	
	void displayG(){
		System.out.println("GrandParent Mehtod - Display");
		  System.out.println("Public   :x:"+x);
		  System.out.println("Private   :y:"+y);
		  System.out.println("Protected  :z:"+z);	
	}
}

class Father extends GrandParent{
	
	  
    public int a=40;
    private int b=50;
    protected int c=60;
    
    void displayF() {
        System.out.println("Father Mehtod - Display");
        System.out.println("Public   :x:"+x);
        System.out.println("Protected  :z:"+z);	
        System.out.println("Public   :a:"+a);
        System.out.println("Private   :b:"+b);
        System.out.println("Protected  :c:"+c);
    }
}
class Son extends Father{
	public int i=70;
	private int j=80;
	protected int k =90;
	void displayS() {
		System.out.println("Child Method display");
		System.out.println("Public :x"+x);
		System.out.println("Private :z"+z);
		System.out.println("Public   :a:"+a);
		 //System.out.println("Private   :b:"+b);
		 System.out.println("Protected  :c:"+c);
		 System.out.println("Public   :i:"+i);
		  System.out.println("Private   :j:"+j);
		  System.out.println("Protected  :k:"+k);
	    	
	}
}



public class MultiLevelInheritenceExample {

	public static void main(String[] args) {
		GrandParent G = new GrandParent();
		G.displayG();
		//GrandFather class object can access only its own method
       
		Father F = new Father();
		F.displayG();
		F.displayF();
		//Father class object can access its own method and GrandFather 
		
		Son S  = new Son();
		S.displayF();
		S.displayG();
		S.displayS();
		
	}

}
