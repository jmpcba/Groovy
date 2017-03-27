//Java simple Pattern
import java.util.regex.*;

Pattern pattern = Pattern.compile("a\\\\b");
println pattern;
println pattern.class;

//Groovy
//se inicia el pattern con ~ y se usa dollar slashy strings

def pat = ~$/a\b/$
println pat
println pat.class

// find =~| match ==~
def txt = "Being a Cleveland sport fan is no way of going though life"
pat1 = ~/Cleveland sport fan/
def finder = txt =~ pat1 //devuelve un objeto matcher. que incluye todos los matches que encontro.
def matcher = txt ==~pat1 //devuelve true or false si encuentre el patron exacto

println finder
println finder.size()
println matcher