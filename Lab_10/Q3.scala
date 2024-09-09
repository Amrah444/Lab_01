class Account(var balance: Double) {  
    def deposit(amount: Double): Unit = {
        require(amount > 0, "Deposit amount must be positive")
        balance += amount
        println(s"Deposited $$${amount}. New balance: $$${balance}")
    }
    def withdraw(amount: Double): Unit = {
        require(amount > 0, "Withdrawal amount must be positive")
        if (amount <= balance) {
            balance -= amount
            println(s"Withdrew $$${amount}. New balance: $$${balance}")
        } else {
            println(s"Insufficient balance. Current balance: $$${balance}")
        }
    }
    def transfer(amount: Double, to: Account): Unit = {
        require(amount > 0, "Transfer amount must be positive")
        if (amount <= balance) {
            this.withdraw(amount)
            to.deposit(amount)
            println(s"Transferred $$${amount} to the other account.")
        } else {
            println(s"Insufficient balance to transfer $$${amount}.")
        }
    }
    override def toString: String = s"Account balance: $$${balance}"
}
object BankApp extends App {
    val account1 = new Account(1000.0)
    val account2 = new Account(500.0)
    account1.deposit(200.0)  
    account1.withdraw(100.0) 
    account1.transfer(300.0, account2)
    println(account1)
    println(account2)
}
