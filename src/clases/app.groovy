import clases.*
//script que usa la clase developer
Developer d = new Developer()

d.first = "manuel" //llama al setter que crea automaticamente
d.setLast("palacios") //setter creado automaticamente.

//averiguar el tipo de una variable
println(d.languajes.class) //responde java.util.ArrayList

//<< agrega items a un array desde la izquierda
d.languajes << "Groovy"
d.languajes << "Java"

println d
println(d.languajes)

d.work()