package Java_OOPS.Bank;
class Account{
    public String name;
    protected String email;
    private String password;
    private String randomPass = "PreRan@2607";
    //getters & setters
    public String getPassword(){  //getter : returns the value [accessor]
        setPassword(randomPass);
        return this.password;
    }
    public void setPassword(String pass){    //setter : set/updates the value [mutators]
        this.password = pass;
    }
}

public class Bank {
    public static void main(String[] args){
        Account acc1 = new Account();
        acc1.name = "Prerana";
        acc1.email = "preranashetty85@mgial.com";
        acc1.setPassword("prerana@321");
        System.out.println(acc1.getPassword());

    }
}
