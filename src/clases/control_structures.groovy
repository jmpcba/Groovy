//estructuras de control

//if
def x = 5

if (x == 10){
    println "x is 10"
}else{
    println "x is not 10"
}

//clasic while
def i = 0
while (i <= 10){
    println i
    i++
}

//for each
def list = [1,2,3,4,5]
for (num in list){
    println num
}

// closure
def list2 = [6,7,8,9]
    list2.each{println it}

//switch
def myNumber = 10
switch(myNumber){
    case 1:
        println "number is 1"
        break
    default: 
        println "default case"
}