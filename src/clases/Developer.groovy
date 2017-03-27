/*clases 
metodos y clases son public por defecto
properties son private. pero los setters y getters se generan solos. 
puedo acceder a darle valor a las propiedades de una clase con varios metodos predefinidos que no hace falta declarar.
*/
class Developer {
    
	String first
    String last
    def languajes = [] //def se usa para definir una variable sin definir el tipo
    
    void work(){
        println "$first $last is working"
    }
}