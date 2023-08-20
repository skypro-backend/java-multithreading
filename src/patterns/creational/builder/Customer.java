package patterns.creational.builder;

public class Customer {
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static class CustomerBuilder {

        private final Customer customer;

        public CustomerBuilder() {
            this.customer = new Customer();
        }

        public CustomerBuilder setFirstName(String firstName) {
            this.customer.firstName = firstName;
            return this;
        }

        public CustomerBuilder setLastName(String lastName) {
            this.customer.lastName = lastName;
            return this;
        }

        public CustomerBuilder setAge(Integer age) {
            this.customer.age = age;
            return this;
        }

        public CustomerBuilder setAddress(String address) {
            this.customer.address = address;
            return this;
        }

        public Customer build() {
            return this.customer;
        }
    }
}