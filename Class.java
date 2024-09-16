public class Class {
    String fname="Annanya";
    String lname ="Mojumder";
    int roll=43;

     public void Cheerup(){
        System.out.println(fname+" "+lname+" "+" is a good student");
     }

     public void greetings(){
        System.out.println(fname+" "+lname+" "+" Best of Luck ");
     }
    public static void main(String[] args) {
           Class obj=new Class();
           System.out.println(obj.fname);
           System.out.println(obj.lname);
           obj.Cheerup();
           obj.greetings();
    }
}
