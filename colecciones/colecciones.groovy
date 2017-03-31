//colecciones
//Range se usa el inicio..fin

Range r = 1..10
println r

r.class
println r.from
println r.to


r = 1..<10
println r

//contains
assert r.contains(4)
//assert r.contains(-1)

Date today = new Date()
Date oneweekAway = today + 7


println today
println oneweekAway

r = today..oneweekAway

println r

Range letters = 'a'..'z'
print letters