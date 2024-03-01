import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
    private String branchName;
    private int branchNumber;
    private String branchLocation;
    private int branchContact;
    private static ArrayList<Branch> branches = new ArrayList<>(); // Static list to store branch instances

    // Constructor
    public Branch(String branchName, int branchNumber, String branchLocation, int branchContact) {
        this.branchName = branchName;
        this.branchNumber = branchNumber;
        this.branchLocation = branchLocation;
        this.branchContact = branchContact;
        branches.add(this); // Add this Branch instance to the list of branches
    }

    // Getters and Setters
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public int getBranchContact() {
        return branchContact;
    }

    public void setBranchContact(int branchContact) {
        this.branchContact = branchContact;
    }

    // Method to list all branches - returns a list of branch details
    public static ArrayList<Branch> listBranches() {
        return branches; // Return the list of branches
    }

    // Method to list services provided by a branch
    public static ArrayList<String> listBranchServices(int branchNumber) {
        // This method would interact with your data storage to retrieve services offered by the specified branch.
        // For demonstration, returning an empty list.
        return new ArrayList<>();
    }

    // Main method for testing
    @SuppressWarnings("resource")
    public static void chooseBranchAndWelcome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a branch:");
        for (int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            System.out.println((i + 1) + ". " + branch.getBranchName() + " - " + branch.getBranchLocation());
        }
        System.out.print("Enter the number of your choice: ");
        int choice = scanner.nextInt();
        if (choice > 0 && choice <= branches.size()) {
            Branch selectedBranch = branches.get(choice - 1);
            System.out.println("Welcome to " + selectedBranch.getBranchName() + " branch located at " + selectedBranch.getBranchLocation() + "!");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {

        new Branch("OCBC", 101, "123 serangoon", 5551234);
        new Branch("OCBC", 102, "Jurong point", 3345613);

        chooseBranchAndWelcome();
    }
}
