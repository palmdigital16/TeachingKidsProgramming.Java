package src.main.java.org.teachingkidsprogramming.section01forloops;

import src.main.java.org.teachingkidsprogramming.recipes.quizzes.graders.SimpleSquareQuizGrader;
import src.main.java.org.teachingkidsprogramming.recipes.quizzes.graders.SquareQuiz;

public class SimpleSquareQuiz implements SquareQuiz
{
  public void question1()
  {
    //  Move the tortoise 110 pixels
  }
  public void question2()
  {
    //  Turn the tortoise 1/5 of 360 degrees to the right
  }
  public void question3()
  {
    //  Change the pen color the tortoise draws to yellow
  }
  public void question4()
  {
    //  Change the width of the line the tortoise draws to 5 pixels
  }
  public static void main(final String[] args)
  {
    new SimpleSquareQuizGrader().grade(new SimpleSquareQuiz());
  }
}
