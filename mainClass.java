import java.util.Scanner
import java.util.Random

public class mainClass {
public static main(String[], arg) {
  Scanner dec = new Scanner(System.out);
  Scanner wait = new Scanner(System.out);
  Random encounter = new Random();
  game gameOBject = new game();
  
  System.out.print("Menu\n1. new game\n2. continue\n3. quit");
  decision = dec.netInt();
  switch(decision) {
  case 1: gameObject.newg();break;
  case 2: gameObject.cont();break;
  case 3: gameObject.quit();break;
  default: main();
}
}
}
