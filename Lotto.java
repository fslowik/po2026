import java.util.Random;
public class Lotto {
    public static void main(String[] args){
        Random random = new Random();
        int i=0;
        while (i<=6) {
            System.out.print(random.nextInt(49));
            System.out.print(' ');
            i++;
        }
    }
}
