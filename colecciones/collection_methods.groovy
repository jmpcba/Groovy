//clase List
//Each y eachWithIndex

List favNums = [2, 21, 44, 35, 8, 4]

//sin closures
for (num in favNums){
    println num
    }
//con Closures

favNums.each {println it} //each toma como argumento el closure y elimino () 

favNums.eachWithIndex {num, idx ->
    println "$idx:$num"
    }

//findAll
//encuentra todos los elementos que cumplen la condicion que se pasa en el closure

List days = [ "mon", "tue", "wed", "thu", "fri", "sat", "sun" ]
List weekend = days.findAll { it.startsWith("s") }

println days
println weekend

//collect
//crear una nueva lista modificando cada valor de la original segun un closure
List nums = [1,2,2,7,2,8,2,4,6]
List numsTimesTen = []

nums.each {num ->
    numsTimesTen << num*10    
}

List newTimesTen = nums.collect {num -> num *10}

println numsTimesTen
println newTimesTen