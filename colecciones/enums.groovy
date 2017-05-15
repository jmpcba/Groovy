enum WeekDay{
 MON, TUE, WED, THU, FRI, SAT, SUN
}

println WeekDay.values()
def dayRange = WeekDay.MON..WeekDay.THU

for(day in dayRange){
    println day
}

println dayRange.size()

//EJERCICIO
//LIST
def days = ['MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN']

println days
println 'size: ' + days.size()
days.remove('SAT')
days.pop() //remueve el ultimo valor
println days
days << 'SAT'

println days[2]

def daysMap = [1:'MON', 2:'TUE', 3:'WED', 4:'THU', 5:'FRI', 6:'SAT', 7:'SUN']
println daysMap
println daysMap.size()
println daysMap.values()
//println daysMap.class.name