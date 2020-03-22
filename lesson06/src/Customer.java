public class Customer {

    private Account account;
    String name;
    String lastName;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Customer(String name, String lastName, Account account){
        this.name = name;
        this.lastName = lastName;
        this.account = account;
    }
}
