package pl.imiajd.olszak;

public class Address {
    private String street;
    private int houseNumb;
    private int apartmentNumb;
    private String city;
    private String postcode;

    public Address(String street, int houseNumb, int apartmentNumb, String city, String postcode){
        this.street = street;
        this.houseNumb = houseNumb;
        this.apartmentNumb = apartmentNumb;
        this.city = city;
        this.postcode = postcode;

    }

    public Address(String street, int houseNumb, String city, String postcode){
        this.street = street;
        this.houseNumb = houseNumb;
        this.apartmentNumb = 0;
        this.city = city;
        this.postcode = postcode;

    }

    public void print(){
        if(apartmentNumb!=0) {
            System.out.println(this.postcode + " " + this.city);
            System.out.println(this.street + " " + this.houseNumb + "/" + this.apartmentNumb);
        }else{
            System.out.println(this.postcode + " " + this.city);
            System.out.println(this.street + " " + this.houseNumb);
        }
    }

//    if this.Address is before otherAddress
    public boolean before(Address otherAddress){  // Polish postcode: dd-ddd
        int iter=0;
        while(iter<6){
            if(this.postcode.charAt(iter)>otherAddress.postcode.charAt(iter))
                return false;
            else if(this.postcode.charAt(iter)<otherAddress.postcode.charAt(iter))
                return true;
            iter++;
        }
        return false;
    }
}
