public class Birthday {

    static int cake=1000;
    public static void main(String[] args) {
    System.out.println("The total Quantity "+Birthday.cake);
    Birthday  am = new Birthday();
    am.cake-=500;
    System.out.println("Am takes her part now cake is "+Birthday.cake);
    Birthday ab = new Birthday();
    ab.cake-=500;
    System.out.println("Ab takes his part now cake is "+Birthday.cake);
    Birthday satyaki = new Birthday();
    satyaki.cake+=1000;
    System.out.println("Satyaki da buy a new cake now cake is "+Birthday.cake);
    

    }
}
