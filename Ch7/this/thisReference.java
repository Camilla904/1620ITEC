//-------------------------------------------------------
// Sets up the account by defining its owner, account
// number and initial balance. 
//--------------------------------------------------------

public Account(String owner, long account, double initial) {
      name = owner;
      acctNumber = account;
      balance = initial;
}

public Account(String name, long acctNumber,double balance) 
{
    this.name = name; 
    this.acctNumber = acctNumber; 
    this.balance = balance;
}
