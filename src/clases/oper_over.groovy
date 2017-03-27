/*todo es un objeto. todos los data types son objetos y 
tienen un metodo plus que se llamar al usar +. a+b es lo mismo que a.plus(b)
*/
class Account{
    BigDecimal balance
    
    Account plus(Account other){
        //no es necesario un constructor siempre y cuando el objeto sea creado con la notacion new objeto(propiedad:valor)
        new Account(balance:this.balance + other.balance) //return es opcional. no hace falta escribirlo
    }
    
    String toString(){
        "Account Balance: $balance"
    }
}

Account savings = new Account(balance:100)
Account checking = new Account(balance:500)

println savings + checking