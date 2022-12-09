package bankaccountapp;

public class Savings extends Account {
    //list the properties specific to a Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKEY;


    //Call a Constructor to initialize Savings account properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();

    }
    @Override
    public void setRate(){
        rate = getBaseRate() - .15;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));

        safetyDepositBoxKEY = (int) (Math.random() * Math.pow(10, 4));

    }

    //list any method specific to a Savings account
    public void showInfo() {
        //System.out.println("ACCOUNT TYPE : Savings");
        super.showInfo();
        System.out.println(" Your Savings Account Features" +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box Key: " + safetyDepositBoxKEY);

    }

}
