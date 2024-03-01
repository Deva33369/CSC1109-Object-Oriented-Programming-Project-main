import java.util.Date;
import java.util.ArrayList;
import java.lang.Math;

import static java.lang.Math.pow;

public class Account {
    // Attributes

    //** Represents the account number */
    private int accountNumber;

    //** Represents the card number linked to the account */
    private int linkedCard;

    //** Represents the type of account; 1 = Savings Account, 2 = Current Account */
    private int accountType; 

    //** Represents the account owner */
    private int accountOwner;

    //** Represents the remaining balance in the account */
    private double remainingBalance;

    //** Represents the available balance in the account */
    private double availableBalance;

    //** Represents the interest rate of the account */
    private double interestRate;

    //** Represents the currency of the account; SGD, USD, EUR, etc. */
    private String currency;

    //** Represents the status of the account; Frozen, Closed */
    private String accountStatus; 

    //** Represents the transaction history of the account */
    private ArrayList<String> transactionHistory; // [Date/Time, Transaction Type, Source, Destination, Amount, Balance] // Tue Feb 20 10:09:57 SGT 2024  | TRANSFER | AC1 -> AC2 | $900 | $100
    
    //** Represents the date the account was opened */
    private Date openDate;

    //** Represents the date the account was closed */
    private Date closeDate;

    //** Represents the local transfer limit of the account */
    private int localTransferLimit;

    //** Represents the local withdraw limit of the account */
    private int localWithdrawLimit;

    //** Represents the overseas transfer limit of the account */
    private int overseasTransferLimit;

    //** Represents the overseas withdraw limit of the account */
    private int overseasWithdrawLimit;

    // Getters and Setters

    /**
    *@return Returns the account number. 
    */

    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber Accepts the account number of the Account and sets it on Account object */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /** 
     * @return Returns the card number linked to the account
     */

    public int getLinkedCard() {
        return linkedCard;
    }

    /** 
     * @param linkedCard Accepts the card number linked to the account and sets it on Account object
     */

    public void setLinkedCard(int linkedCard) {
        this.linkedCard = linkedCard;
    }

    /**
    * @return Returns the type of account; 1 = Savings Account, 2 = Current Account 
    */
    public int getAccountType() {
        return accountType;
    }

    /** 
     * @param accountType Sets the type of account; 1 = Savings Account, 2 = Current Account 
    */

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    /**
     * @return Returns the account owner
     */
    public int getAccountOwner() {
        return accountOwner;
    }

    /** 
    * @param accountOwner Sets the account owner 
    */
    public void setAccountOwner(int accountOwner) {
        this.accountOwner = accountOwner;
    }

    /**
     * @return Returns the remaining balance in the account
     */

    public double getRemainingBalance() {
        return remainingBalance;
    }

    /** 
     * @param remainingBalance Sets the remaining balance in the account
     */
    public void setRemainingBalance(double remainingBalance) {
        this.remainingBalance = remainingBalance;
    }

    /**
     * @return Returns the available balance in the account
     */

    public double getAvailableBalance() {
        return availableBalance;
    }

    /** 
     * @param availableBalance Sets the available balance in the account
     */

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    /**
     * @return Returns the interest rate of the account
     */
    public double getInterestRate() {
        return interestRate;
    }

    /** 
     * @param interestRate Sets the interest rate of the account
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * @return Returns the currency of the account; SGD, USD, EUR, etc.
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * @param currency Sets the currency of the account; SGD, USD, EUR, etc.
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return Returns the status of the account; Frozen, Closed
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /** 
     * @param accountStatus Sets the status of the account; Frozen, Closed
     */
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * @return Returns the transaction history of the account
     */

    public ArrayList getTransactionHistory() {
        return transactionHistory;
    }

    /** 
     * @param transactionHistory Sets the transaction history of the account
     */
    public void setTransactionHistory(ArrayList<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    /**
     * @return Returns the date the account was opened
     */
    public Date getOpenDate() {
        return openDate;
    }

    /** 
     * @param openDate Sets the date the account was opened
     */
    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    /**
     * @return Returns the date the account was closed
     */
    public Date getCloseDate() {
        return closeDate;
    }

    /** 
     * @param closeDate Sets the date the account was closed
     */
    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    /**
     * @return Returns the local transfer limit of the account
     */

    public int getLocalTransferLimit() {
        return localTransferLimit;
    }

    /** 
     * @param localTransferLimit Sets the local transfer limit of the account
     */
    public void setLocalTransferLimit(int localTransferLimit) {
        this.localTransferLimit = localTransferLimit;
    }

    /**
     * @return Returns the local withdraw limit of the account
     */
    public int getLocalWithdrawLimit() {
        return localWithdrawLimit;
    }

    /** 
     * @param localWithdrawLimit Sets the local withdraw limit of the account
     */
    public void setLocalWithdrawLimit(int localWithdrawLimit) {
        this.localWithdrawLimit = localWithdrawLimit;
    }

    /**
     * @return Returns the overseas transfer limit of the account
     */
    public int getOverseasTransferLimit() {
        return overseasTransferLimit;
    }

    /** 
     * @param overseasTransferLimit Sets the overseas transfer limit of the account
     */
    public void setOverseasTransferLimit(int overseasTransferLimit) {
        this.overseasTransferLimit = overseasTransferLimit;
    }

    /**
     * @return Returns the overseas withdraw limit of the account
     */
    public int getOverseasWithdrawLimit() {
        return overseasWithdrawLimit;
    }

    /** 
     * @param overseasWithdrawLimit Sets the overseas withdraw limit of the account
     */
    public void setOverseasWithdrawLimit(int overseasWithdrawLimit) {
        this.overseasWithdrawLimit = overseasWithdrawLimit;
    }

    // Methods


    public void deposit(int destinationAcc, double amount){
        availableBalance += amount;
    }

    //
    public void withdraw(int sourceAcc, double amount){
        if (availableBalance < amount) {
            System.out.println("Error");
        } else {
            availableBalance -= amount;
        }
    }

    public void transfer(int sourceAcc, int destinationAcc, double amount){
        withdraw(sourceAcc, amount);
        deposit(destinationAcc, amount);
    }

    public void linkCard(int cardNumber, int accountNumber) {

    }

    public double checkBalance(int accountNumber){
        return getAvailableBalance();
    }

    public void displayAccountInfo(){
        System.out.println("--Account Details--");
        System.out.println("Holder: " + getAccountOwner());
        System.out.println("Number: " + getAccountNumber());
        System.out.println("Type: " + getAccountType());
        System.out.println("Open Date: " + getOpenDate());
        System.out.println("Balance: " + getAvailableBalance());
        System.out.println("Currency: " + getCurrency());
        System.out.println("Interest Rate: " + getInterestRate());
        System.out.println("Linked Card: " + getLinkedCard());
    }

    public void internalTransfer(int sourceAcc, int destinationAcc, double amount) {
    }

    public void thirdPartyTransfer(int sourceAcc, int destinationAcc, double amount) {

    }
    //Change this to get data from txt file
    public void displayTransactionHistory(ArrayList<String> transactionList){
        for (int i = transactionList.size()-1; i >= 0; i--) {
            System.out.println(transactionList.get(i));
        }
    }

    //Change this to add data to txt file
    public void addTransaction(ArrayList<String> transactionList, String transactionType, int sourceAccount, int destinationAccount, double amount){
        if (transactionList.size() > 10) {
            transactionList.remove(1);
        }
        transactionList.add("\n" + new Date() + " | " + transactionType + " |  " + sourceAccount + " -> " + destinationAccount + " | " + amount + " | " + getAvailableBalance());
    }

    // Need something to count the years
    public double calculateInterest(int years){
        return availableBalance * Math.pow(1 + getInterestRate(), years);
    }

    public static void main(String[] args) {

    }
}