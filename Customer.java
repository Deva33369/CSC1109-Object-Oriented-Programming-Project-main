import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String customerName;
    private String idNumber;
    private String address;
    private int contactNumber;
    private List<Account> accountList;
    private Bank bank;

    public Customer(int customerId, String customerName, String idNumber, String address, int contactNumber){
        this.customerId = customerId;
        this.customerName = customerName;
        this.idNumber = idNumber;
        this.address = address;
        this.contactNumber = contactNumber;
        this.accountList = new ArrayList<>();  
    }

    public void updatePersonalInfo(String newAddress, int newContactNumber){
        this.address = newAddress;
        this.contactNumber = newContactNumber;
        System.out.println("Personal info updated");
    }

    public void addAccount(){
        System.out.println("Account added");
    }

    public void removeAccount(Account account){
        accountList.remove(account);
        System.out.println("Account removed");
    }

    public String getName(){
        return customerName;
    }

    public Account getAccount(int accountNumber){
        for (Account account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

}
