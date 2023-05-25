import java.util.*;
public class Main {
    public static void main (String args []){
        int op,ch;
        int x=0;;
        String userid,pass;
        int flag=0;

        Scanner sc=new Scanner (System.in);
        Customer obj=new Customer();
        
        System.out.println("Choose the option from below:");
        System.out.println("1.Register\n"+"2.Exit");
        op=sc.nextInt();
        
        
        switch(op){
            case 1:
            	
            obj.getdata();
            System.out.println("Registration completed...Pls kindly login");
            System.out.println("-------------------------------------------------");
            System.out.println();
            do{
            System.out.println("1.Login\n"+"2.Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter Your Username:");
                userid=sc.next();

                System.out.println("Enter Your Password:");
                pass= sc.next();

                if(obj.userid.equals(userid) && obj.password.equals(pass)){
                    flag=1;
                    System.out.println("Login Successfully!!");

                    System.out.println();
                    System.out.println("************* Welcome back "+obj.firstname+" ******************");
                    do{
                        System.out.println("1.Withdraw\n2.Deposit\n3.Transfer");
                        System.out.println("4.Check Balance\n5.Transaction History\n6.Exit");
                        x=sc.nextInt();
                        switch(x){
                            case 1:
                            obj.Withdrawal();
                            break;

                            case 2: 
                            obj.Deposit();
                            break;

                            case 3:
                            obj.Transfer();
                            break;

                            case 4: 
                            obj.output();
                            break;

                            case 5:
                            obj.Transaction_History();
                            break;
                            

                            
                        }

                    }while(x<6);
                }

                else{
                    flag=0;
                }

                if(flag==0){
                    System.out.println("Wrong Username or Password...Kindly Login Again");
                }


            }
        
            }while(flag==0 || x==6);


                case 2:
                break;
        }
    
            }

        }
    