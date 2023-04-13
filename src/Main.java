import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int max = 1000;
    int min = 1;
    int temp;

    int guess = (max + min) / 2;

    do {
      System.out.println("Ist der Gesuchte zahl:" + guess + "?");

      System.out.println("Ja => Press 1");
      System.out.println("Nein der zahl ist kleiner => Press 2 ");
      System.out.println("Nein der zahl ist grösser => Press 3");
      System.out.println("ihrer Eingabe: ");
      temp = Integer.parseInt(br.readLine());

      if (temp == 1){
        System.out.println( "yess, ich hab gewonnen ");

      } else if (temp == 2) {
        max = guess;
        guess = nextGuess(guess, max, min);
      } else if (temp == 3 ) {

        min = guess;
        guess = nextGuess(guess,max,min);

      } else {
        System.out.println("Falsche Eingabe");
      }

    } while (temp != 1);
  }


  public static  int nextGuess(int guess,int max, int min) {
    guess = (max + min) / 2;

    return guess;
  }


}