import java.util.*;
public class QuestionService {

    Question[] questions=new Question[5];
    String selection[]=new String[5];

    public QuestionService() {
        questions[0]=new Question(1,"Which among this is markup language","HTML","CSS","JS","JAVA","HTML");
        questions[1]=new Question(2,"2+2","2","6","4","8","4");
        questions[2]=new Question(3,"10+5","10","15","9","8","15");
        questions[3]=new Question(4,"0+0","10","2","1","0","0");
        questions[4]=new Question(5,"Hello","World","P","a","v","World");
    }

    public void playQuiz(){
        int i=0;
        
        for(Question q:questions){
        System.out.println("Question No: "+q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());
        Scanner sc=new Scanner(System.in);
        selection[i]=sc.nextLine();
        i++;
        }
        
    }
    public void printscore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Question que= questions[i];
            String actualAnswer=que.getAnswer();
            String userAnswer=selection[i];
            if(actualAnswer.equals(userAnswer)){
                score++;
            }
            
        }
        System.out.println("Your Score is"+score);
    }
   
}