import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {
    String street;
    String suite;
    String city;
    String zipcode;

    public Address() {
    }

    public Address(String street, String suite, String city, String zipcode) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
    }


    public String getStreet() {
        return street;
    }

    public String getSuite() {
        return suite;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\n' +
                ", suite='" + suite + '\n' +
                ", city='" + city + '\n' +
                ", zipcode='" + zipcode + '\n' +
                '}';
    }
}
