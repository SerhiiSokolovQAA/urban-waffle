package ua.kyiv.prog;

public class TestData {
    private String email = "example+116@example.com";
    private String firstName = "Pep";
    private String lastName = "Linders";
    private String password = "P@ssw0rd";
    private String day = "21";
    private String month = "3";
    private String year = "2000";
    private String zipcode = "12345";
    private String phone = "894651332";
    private String alias = "Beast";
    private String company = "YNWA";
    private String address = "AddressLine1";
    private String addresssecond = "AddressLine2";
    private String state = "AnyState";
    private String city = "AnyCity";
    private String quantity = "3";
    private String notExpectedText = "ENTER ACCOUNT INFORMATION";
    private String currencyAmount = "100";
    private String ProductSearchText = "Кавомашина Saeco";
    private static int currencyAmountExpectedValue = (int) 846.62;



    public String getQuantity() {return quantity;}

    public String getProductSearchText() {return ProductSearchText;}

    public static int getCurrencyAmountExpectedValue() {return currencyAmountExpectedValue;}

    public String getCurrencyAmount() {return currencyAmount;}

    public String getnotExpectedText() {
        return notExpectedText;
    }

    public String getEmail() {return email;}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getPhone() {
        return phone;
    }

    public String getAlias() {
        return alias;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getAddresssecond() {return addresssecond;}

    public String getState() {return state;}

    public String getCity() {return city;}

    public String getZipcode() {return zipcode;}

    public String getMobilephone() {return phone;}

}
