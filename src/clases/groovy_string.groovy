//strings

//Java ::
char c = 'c'
println c.class

String str = "this is a string"
println str.class

//Groovy
//todo es string, asume String por defecto.
//comillas simples o dobles dan igual salvo en interpolacion
def c2 = 'c'
println c2.class

def str2 = 'this is a string'
println str2.class

//String interpolation
//Java::
String name = "Manu"
String msg = "Hello " + name + "..."
println msg

//Groovy:
String msg2 = "Hello ${name}..." //comillas dobles obligatorias. con comillas simples es literal.
println msg2

//se evalua la expresion en runtime
String msg3 = "expressions are evaluated at runtime... ${1 + 2 +3}"
println msg3

//Multiline Strings
//3 comillas (simples o dobles) igual que Python

def aLargeMsg = """
a
large
message"""
println aLargeMsg

//Dollar Slashy
//evita tener que escapar caracteres dentro del String. Similar a declarar un string como r en Python
//se encierra el string en $//$ (sin comillas)
def folder = $/c:\carpeta\foo\bar/$
println folder