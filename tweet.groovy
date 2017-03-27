class Tweet{
    Date date
    String owner
    String message
    
    Tweet(String owner, String message){
        this.date = new Date()
        this.owner = owner
        this.message = message
    }
    
    void info(){
        println "this tweet was sent on $date, by $owner, who said: $message"
    }
}