import exceptions.{IllegalAmountException, NoSufficientFundsException}

class Account(initialBalance: Double, val uid: Int = Bank getUniqueId) {
  private var balance = initialBalance

  def withdraw(amount: Double): Unit =
    if (amount < 0)
      throw new IllegalAmountException("negative amount")
    else if (initialBalance-amount < 0)
      throw new NoSufficientFundsException("not enough moneyz")
    else
      balance = balance-amount

  def deposit(amount: Double): Unit =
    if (amount < 0)
      throw new IllegalAmountException("negative amount")
    else
      balance = balance+amount

  def getBalanceAmount: Double = return balance

}
