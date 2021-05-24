package bankAccount;


public class RetailCustomerAccount {

    private double balance;
    private String id;
    private String name;
    private String surname;
    private String address;


    public RetailCustomerAccount() {
    }

    public RetailCustomerAccount(String id, String name, String surname, String address,double balance) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


        void  depositMoney(float amount){
            balance+=amount;
        }
        void  withdrawMoney(float amount)
        {
            if (amount>balance)
            {
                System.out.println("Bakiyeniz yetersizdir");
            }
            else{
                balance-=amount;
                System.out.println("Hesabınızdan "+amount+" çekilmiştir.");
            }

        }
        void  control(){
            System.out.println("Hesabınızın güncel bakiyesi "+balance);
        }
        void  show()
        {
            System.out.println(id+" "+name+" "+surname+" "+" "+address+" "+balance+" ");
        }
    }

