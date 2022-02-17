class Location {
    String street;
    String city;

    public Location(String city) {
        this.city = city;
    }

    public Location(String street, String city) {
        this(city);
        this.street = street;
    }

    @Override
    public String toString() {
        return "Street : " + street + ", City : " + city + "\n";
    }

}

class Address {
    Location location;
    String state;
    String country;

    public Address(Location location, String state) {
        this.location = location;
        this.state = state;
    }

    public Address(Location location, String state, String country) {
        this.location = location;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return location + "State : " + state + ", Country : " + country + "\n";
    }

}

class UPIPaymentApps implements Cloneable {
    String name;
    String country;
    int dailyLimit;
    double maxDailyAmount;
    Address headOfficeLocation;

    public UPIPaymentApps(String name, String country, int dailyLimit, double maxDailyAmount,
            Address headOfficeLocation) {
        this.name = name;
        this.country = country;
        this.dailyLimit = dailyLimit;
        this.maxDailyAmount = maxDailyAmount;
        this.headOfficeLocation = headOfficeLocation;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Address address = new Address(this.headOfficeLocation.location, this.headOfficeLocation.state,
                this.headOfficeLocation.country);
        return new UPIPaymentApps(this.name, this.country, this.dailyLimit, this.maxDailyAmount, address);
    }

    @Override
    public String toString() {
        return "UPIPaymentApp :-\nName : " + name + "\ncountry :" + country + "\ndailyLimit : " + dailyLimit
                + "\nmaxDailyAmount : " + maxDailyAmount + "\nHead Office Location :-\n" + headOfficeLocation + "\n";
    }

}

public class UPIApps {
    public static void main(String[] args) throws Exception {
        Location bhimLocation = new Location("Janakpuri", "Delhi");
        Address bhimAddress = new Address(bhimLocation, "Delhi", "India ");
        UPIPaymentApps bhim = new UPIPaymentApps("BHIM", "India", 10, 100000, bhimAddress);
        System.out.println(bhim);

        UPIPaymentApps paytm = (UPIPaymentApps) bhim.clone();
        paytm.name = "PayTm";
        Location paytmLocation = new Location("Sector 12", "Noida");
        Address paytmAddress = new Address(paytmLocation, "Uttar Pardesh", "India");
        paytm.headOfficeLocation = paytmAddress;
        System.out.println(paytm);

        System.out.println("Bhim Info After Changes:-");
        System.out.println(bhim);

    }
}
