class Test{

def l = [10,20,30,40,50]

void cl(Closure c){
    for(i in l){
        def a = c(i)
        println a
        }
    }

}

Test t = new Test()
def c = {it * 2}

t.cl(c)

//t.l.each{println "printing $it"}
//t.l.eachWithIndex{index, name -> println "printing $name at $index"}

/*
METODOS DE COLECCIONES
*/

List people = [
    [name: 'jane', city:"new york"],
    [name: 'john', city:"cleveland"],
    [name: 'mary', city:"new york"],
    [name: 'dan', city:"cleveland"],
    [name: 'tom', city:"new york"],
    [name: 'frank', city:"new york"],
    [name: 'jason', city:"cleveland"]
]

//devuelven los valores que cumplan la condicion del closure
println people.find{person -> person.city == "cleveland"}
println people.findAll{person -> person.city == "cleveland"}


//devuelve true si uno de items de la lista cumple con el closure
println people.any{person -> person.city == "cleveland"}
println people.every{person -> person.city == "cleveland"}
println people.every{person -> person.name.size() >= 3}
println people.every{person -> person.name != ""}

//groupby()

def peopleByCity = people.groupBy{person -> person.city}
def newYorkers = peopleByCity["new york"]
def clevelanders = peopleByCity.cleveland

println newYorkers
println clevelanders


