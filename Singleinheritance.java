class Animal{
    String Name;
   public void Type(String Name) {
           System.out.println(Name+" is one type of animal");
        
   }
  
   public void Bark(String Name){ 
    System.out.println(Name + " also barks like other animals");
}
}

class Dog extends Animal {
    public void display(){
        System.out.println("Dog is a type of animal");
    }
    
}

public class Singleinheritance {
    public static void main(String[] args) {
        Animal cat = new Animal();
        Dog  obj1=new Dog();
         cat.Type("Cat");
         cat.Bark("Cat");
         obj1.display();
         System.out.println("--Calling By another class Object--");
         obj1.Type("Cow");

         
    }
}
