class Account(var balance: Double) {
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }
  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positive")
    if (amount <= balance) balance -= amount
    else println("Insufficient balance")
  }
  override def toString: String = s"Account balance: $$${balance}"
}
class Bank(val accounts: List[Account]) {
  def accountsWithNegativeBalances: List[Account] = {
    accounts.filter(_.balance < 0)
  }
  def sumOfAllBalances: Double = {
    accounts.map(_.balance).sum
  }
  def applyInterest(): Unit = {
    accounts.foreach { account =>
      if (account.balance > 0) {
        val interest = account.balance * 0.05
        account.deposit(interest)
      } else if (account.balance < 0) {
        val overdraftInterest = account.balance * 0.1
        account.withdraw(overdraftInterest.abs)
      }
    }
  }
}
object BankApp extends App {
  val account1 = new Account(1000.0)
  val account2 = new Account(-200.0)
  val account3 = new Account(500.0)
  val account4 = new Account(-50.0)
  val bank = new Bank(List(account1, account2, account3, account4))
  val negativeAccounts = bank.accountsWithNegativeBalances
  println("Accounts with negative balances:")
  negativeAccounts.foreach(println)
  val totalBalance = bank.sumOfAllBalances
  println(s"Sum of all account balances: $$${totalBalance}")
  bank.applyInterest()
  println("\nAfter applying interest:")
  bank.accounts.foreach(println)
}
