@groovy.transform.ToString //en vez de sobre escribir un metodo toString

class Tweet{
    Date date
    String owner
    String message
    int favorites
    int retweets
    
    Tweet(String owner, String message){
        this.date = new Date()
        this.owner = owner
        this.message = message
        this.favorites = 0
        this.retweets = 0
    }

    void addReTweet(){
        retweets += 1
    }

    void addfav(){
        favorites += 1
    }

    void info(){
        println "this tweet was sent on $date, by $owner, who said: $message"
    }
}