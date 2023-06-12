public class questions {

    private String answer;
    private String question;

    private String yes;


    public questions (String question, String answer, String yes){
        this.question = question;
        this.answer = answer;
        this.yes = yes;
    }

    public boolean ask(String given){
        if (given.equals(yes)){
            return true;
        }
        return false;
    }
    public String returnY(){
        return yes;
    }
    public String state(){
        return (question);
    }
    public String choices() {
        return (answer);
    }


}