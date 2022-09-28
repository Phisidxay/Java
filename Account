public class Account{
    int id;
    String name;
    int balance;
    public Account(int id, String name){
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
public Account(int id,String name,int balance){
    this.id = id;
    this.name = name;
    this.balance = balance;
}
void display(){
    System.out.println("STK:" + id +", Ten TK:" + name +", So du:"+ balance);
}
void deposit(int amount){
    this.balance += amount;
}
void withdraw(int amount){
    if(amount <= this.balance){
        this.balance -= amount;
        System.out.println(" so du con lai trong tai khoan:"+this.balance);
    }else{
        System.out.println(" so du trong tai khoan du");
    }
}
public static void main(String[] args){
    Account tk1 = new Account(007 , "Madara",50);
    Account tk2 = new Account(232,"Bob", 1000);
    tk1.display();
    tk2.display();
    tk1.deposit(150);
    tk2.deposit(500);
    tk1.withdraw(100);
    tk2.withdraw(100);
}
}
