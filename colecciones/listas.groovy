//valores separados por comas entre corchetes
def nums = [1,2,4,10]

println nums
println nums.class.name

// add | remove | get | clear


nums.push(99)
nums.putAt(1, 77)
nums[1]=78
nums +[7, 8]

//operador left shift agrega un item a la izquierda
nums << 12

//devuelve el valor del ultimo elemento de la lista
nums.pop()
//minus crea una nueva lista eliminando todas las ocurrencias del sustraendo
 
 a = [1, 0, 'a', 5, 5, 'b']
 b = ['a', 5]
 
 a -b
 
 //list slicing, getAt(range) toma un rango y devuelve los items compuestos en el rango (igual a slicing en Py
 nums.getAt(1..3)
 
 //vacia el array
 //nums.clear()
// nums = []

//loops
for (x in nums){
    println x
}

//set... una lista que no contiene duplicados
n = [1,2,3,4,7,1,8,7,9,10,10,5,6,5] as Set
println n

n = [1,2,3,4,7,1,8,7,9,10,10,5,6,5] as SortedSet
println n
