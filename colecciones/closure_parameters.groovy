/*
closure parameters
*/

//parametro implicito. si no se le pasa un nombre de paramentro, siempre va a ser 'it'
def foo = {
    println it
}

foo('hola')

//para evitar que se le pasen parametros
def noparams = {->
    println "no parameters..."
}

//noparams(1) //da error

//varios parametros
def sayHello = {String first, String last ->
    println "Hello, $first $last"
}

sayHello('dan', 'vega')

//valores default para parametros
def greet = {String name, String greeting = "howdy"->
    println "$greeting $name"
    }
    
greet("dan", "hello")
greet("joe")

//var-arg (sirve para metodos tambien)
//para pasar una cantidad de parametros no espcificada. se usan "..." despues del tipo

def concat = { String... args ->
    args.join(' ')
    }

println concat('abc', 'def')

//propiedades de un closure

def someMethod(Closure c){
    println "---"
    println c.maximumNumberOfParameters
    println c.parameterTypes
    }
    
def someClosure = {int x, int y -> x + y}

someMethod(someClosure)