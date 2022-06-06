package traning;
class Quiz {
        int count;
        Quiz(int count) {
        this.count=count;
        }
        }
class QuizMain {
    public static void main (String[] args) {
        Quiz score = new Quiz(100);
        System.out.println("You get " + score.count + " points!");
    }
}