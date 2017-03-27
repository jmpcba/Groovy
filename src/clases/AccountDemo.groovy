
class Account{
    BigDecimal balance = 0
    String type
    
    BigDecimal deposit (BigDecimal ammount){
        this.balance += ammount
    }
    
    BigDecimal withdrawn(BigDecimal ammount){
        this.balance -= ammount
    }
    
    String plus(Account other){
        BigDecimal balance = this.balance + other.balance
        "Your account balance is $balance" //return es opcional
    }
}

Account checking = new Account(type:"deposit")
checking.deposit(100.00)
Account savings = new Account(type:"savings")
savings.deposit(50.00)

println savings + checking