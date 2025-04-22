package Java8.OptionalClass;

import java.util.Optional;
class Address {
    private String city;

    public Address(String city) {
        this.city=city;
    }

    public Optional<String> getCity() {
        return Optional.ofNullable(city);
    }
}

class User{
    private Address address;

    public User(Address address) {
        this.address=address;
    }

    public Optional<Address> getAddress() {
        return Optional.ofNullable(address);
    }
}

public class OptionalAddress {

    public static void main(String[] args) {
        Address user1Address = new Address("Pune");
        Address User2Address = new Address(null);

        User user1 = new User(user1Address);
        System.out.println(getCityName(user1));

        User user2 = new User(User2Address);
        System.out.println(getCityName(user2));
    }

    public static String getCityName(User user) {
        return user.getAddress().flatMap(Address::getCity).orElse("City not available");
    }

}
