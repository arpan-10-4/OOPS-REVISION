class Voter {
    String fname;
    String lname;
    int id;

    Voter() {
        this.fname = "Arpan";
        this.lname = "Bhattacharya";
        this.id = 44; 
    }

    Voter(String x, String y, int z) {
        this.fname = x;
        this.lname = y;
        this.id = z;
    }

    Voter(Voter passingObject) {
        this.id = passingObject.id;
        this.fname = passingObject.fname;
        this.lname = passingObject.lname;
    }

    void display() {
        System.out.println(this.id);
        System.out.println(this.fname);
        System.out.println(this.lname);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Voter original = new Voter("Arpan", "Bhattacharya", 44);
        Voter copy = new Voter(original);  
        
        System.out.println("Original Voter:");
        original.display();
        
        System.out.println("Copied Voter:");
        copy.display();
    }
}
