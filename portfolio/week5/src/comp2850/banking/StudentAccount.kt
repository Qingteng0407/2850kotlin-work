// Name:Qingteng Zhang Id:201821913
package comp2850.banking
val MAX_OVERDRAFT = 100
class StudentAccount (holder: String): BankAccount(holder){

    // set an overdraft透支 in the range 0 to 100.

    var overdraft = 0
        set(value) {
            require(value in 0..MAX_OVERDRAFT)
            field = value
        }

    // 取款
    // `withdraw()` should allow withdrawals only if the specified amount would
    //  not lower `balance` below the limit specified by `overdraft`
    override fun withdraw(amount: Int) {
        require(amount > 0){
            "Withdrawal amount must be greater than 0"
        }
        require(amount.toLong() <= balance.toLong() + overdraft) {
            "Insufficient funds for withdrawal"
        }
        balance -= amount
    }

    // should return `true` if further withdrawals are `false` otherwise.
    fun withdrawalsAllowed(): Boolean {
        if (balance > -overdraft){
            return true
        }else{
            return false
        }
    }

    // return a string
    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }

}