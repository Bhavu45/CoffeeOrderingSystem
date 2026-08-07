package Practice;

public class BankAccount {
    String HolderName;
    int Balance;
    int age;
    void showBalance(){
        System.out.println("The "+HolderName+" has a balance of rupees "+Balance);
    }
    void showDetails(){
        System.out.println("The Details of AccountHolder is : \n  Practice.Name: "+HolderName+" \n Age:"+age+"\n Balance:"+Balance);
    }
}
class BankInfo{
    public static void main(String[] args) {
        BankAccount obj=new BankAccount();
        obj.HolderName="Bhavya";
        obj.Balance=50000;
        obj.age=20;
        obj.showDetails();
        obj.showBalance();
    }
}
