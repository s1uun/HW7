public class Account {
    private String ID;
    private String name;
    private int balance = 0;

    public Account(String ID, String name) {
        this.ID = ID;
        this.name = name;
        this.balance = 0;
    }
    public Account(String ID, String name, int balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        balance = balance + amount;
        return balance;
    }
    public int debit(int amount) {
        if( balance >= amount) {
            balance = balance - amount;
        }else {
              System.out.println("لا يوجد مبلغ كافي");
        }
        return balance;
    }
    public int transferTo(Account another, int amount) {
        if( balance >= amount) {
            balance = balance - amount;
            another.credit(amount);
        }else {
            System.out.println("لا يجد مبلغ كافي لتحويله");
        }
        return balance;
    }

    public String toString (){
        return "Account ID: " + ID + "\nAccount Name: " + name + "\nAccount Balance: " + balance;
    }


    public static void main(String[] args) {
        Account account1 = new Account("441850179", "Sawsan Tamim");
        System.out.println(account1.toString());
        //System.out.println("Account ID: " + account1.getID());
        //System.out.println("Account Name: " + account1.getName());
        //System.out.println("Account Balance: " + account1.getBalance());

        account1.credit(2000);
        System.out.println("Account Credit: " + account1.getBalance());

        account1.debit(500);
        System.out.println("Account Debit: " + account1.getBalance());
        System.out.println("________________________________________________________");

        Account account2 = new Account("441855179","Nourah Majed",1000);
        //System.out.println("Account 2 ID: " + account2.getID());
        //System.out.println("Account 2 Name: " + account2.getName());
        //System.out.println("Account 2 Balance: " + account2.getBalance());
        //System.out.println(account2);
        System.out.println(account2.toString());
        account1.transferTo(account2,200);
        System.out.println("Account Balance of account after transfer: " + account1.getBalance());
        System.out.println("Account Balance of account2 after transfer: " + account2.getBalance());
    }
}
