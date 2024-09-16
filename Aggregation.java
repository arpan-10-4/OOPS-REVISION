class Address1{
    int StritNum;
    String  city;
    String  state;
    String country;

    public Address1(int StritNum,String city, String state,String country){
        this.StritNum=StritNum;
        this.city=city;
        this.state=state;
        this.country=country;
    }
}


class StudentClass{
    int Roll;
    String Name;
    Address1 Studentadr;
    public StudentClass(int Roll,String Name,Address1 StudentAdr) {
        this.Roll=Roll;
        this.Name=Name;
        this.Studentadr=StudentAdr;
        }
        }




public class Aggregation {
    public static void main(String[] args) {
        Address1 ad = new Address1(10,"Kolkata","WB","India");
        StudentClass obj=new StudentClass(123,"Brijit",ad);
        System.out.println(ad.StritNum);
		System.out.println(ad.state);
		System.out.println(ad.country);
		System.out.println(ad.city);

        System.out.println(obj.Roll);
        System.out.println(obj.Name);
        System.out.println(obj.Studentadr.StritNum);
        System.out.println(obj.Studentadr.city);

        System.out.println(obj.Studentadr.state);

        System.out.println(obj.Studentadr.country);
    }
}
