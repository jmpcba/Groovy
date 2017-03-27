import clases.*

Tweet t = new Tweet("manu", "mi puto tamarindo")
println t.toString()
t.info()

sleep(3000)

t.message = "me disculpo por el exabrupto"
t.date = new Date()
t.info()
t.addfav()
t.addReTweet()
println t.toString()