/*closures.  key feature
es un metodo que es un objeto.
se usa para 
iteradores
callbacks
funciones de orden superior (reciben funciones como parametros y retornan funciones como salida)
threads
builders
ubicacion de recursos

es un bloque de codigo anonimo entre {}
es un instancia de la clase Closure
es una funcion anonima (lambda), o sea una funcion que no esta asociada a un nombre
*/


def c = {}

println c.class.name
println c instanceof Closure

/*como es una funcion puede tomar parametros. estos se separan del cuerpo 
de la funcion con "->" */

def sayHello = { name ->
    println " Hello, $name"
}

sayHello('manu')

List nums = [1,4,7,4,30,2]

//el metodo each de una Lista acepta un closure como argumento.
nums.each({num ->
    println num //puedo usar it y no pasar parametros al closure
    })
    
/*closures are objetcs & last param
cuando un metodo recibe un closure como su ultimo parametro, se puede sacar del parentesis al 
hacer la llamada*/  
def timesTen(num, closure){
    closure(num*10)
}

timesTen(10, { println it })
//sacando los parentesis.
timesTen(2) { 
    println it 
    }
    
 10.times{
    println it
 }
 
 import java.util.Random
 
 Random rand = new Random()
 
3.times{
    println rand.nextInt()    
 }