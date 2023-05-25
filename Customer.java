import java.util.*;


public class Customer extends Person {
	 private int Balance=20000;
    private int withdrawal;
    private int deposit;
    // protected static int Balance;
    private int withdrawal_limit = 10000;
    private int transfer;
    private String rec_name;
    private Long rec_acc_no;
    Scanner sc=new Scanner(System.in);
    Scanner sc1=new Scanner(System.in);
    Map<Integer,String> Statement=new HashMap<>();

 

    public void Deposit() {
   {
        System.out.println("Enter amount to be Deposited");
        deposit = sc.nextInt();
        Balance = Balance + deposit;
        System.out.println("Balance=" + Balance);
        Statement.put(deposit,"Amount Deposited");
     }
        
    }

    public void Withdrawal() {

        System.out.println("How many amount to be withdrawal");
        withdrawal = sc.nextInt();
        if (withdrawal > withdrawal_limit) {
            System.out.println("Daily limit is exceeded ");
        } else if (withdrawal > Balance){
            System.out.println("Insufficient Balance");
        } else {
            Statement.put(withdrawal,"Amount Withdrawl");
            Balance = Balance - withdrawal;
            System.out.println("Total amount =" + Balance);
        }

        // System.out.println("Enter amount to be Withdrawal");
        // Balance=sc.nextInt();
    }
    
    public void Transaction_History(){
        for(Map.Entry<Integer,String> m:Statement.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
    
    public void Transfer(){
        System.out.println("Enter receiver's name:");
        rec_name=sc1.nextLine();
        System.out.println("Enter receiver's account number:");
        rec_acc_no=sc.nextLong();
        System.out.println("Enter amount to be transfer:");
        transfer=sc.nextInt();
        Balance=Balance-transfer;
        System.out.println("Successfully transfered to "+rec_name);
        System.out.println("Available Balance="+Balance);
        Statement.put(transfer,"Amount Transfered");
    }
    
  
    
    public void output() {
        System.out.println("YOUR BALANCE IS " + Balance);
    }

}