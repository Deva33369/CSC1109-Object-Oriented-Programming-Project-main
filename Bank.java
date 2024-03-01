import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private int bankId;
    private List<Customer> customerList;
    private List<Branch> branchList;

    public Bank(String bankName, int bankId){
        this.bankName = bankName;
        this.bankId = bankId;
        this.customerList = new ArrayList<>();
        this.branchList = new ArrayList<>();
    }

    public void addCustomer(String name){
        System.out.println("Customer added");
        Customer customer = new Customer(bankId, name, name, name, bankId);
        customerList.add(customer);
    }

    public void addBranch(String branchName, int branchNumber, String branchLocation, int branchContact){
        Branch branch = new Branch(branchName, branchNumber, branchLocation, branchContact);
        branchList.add(branch);
        System.out.println("Branch added");
    }

    public void displaybranches(){
        for (Branch branch : branchList) {
            System.out.println(branch.getDetails());
        }
    }

    public void displayCustomer(){
        for (Customer customer : customerList) {
            System.out.println(customer.getDetails());
        }
    }


}