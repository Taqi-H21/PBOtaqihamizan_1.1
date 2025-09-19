package tiga;
import java.util.Arrays;
public class Song {
    String lirik;
    public Song(String lirikLagu) {
        this.lirik = lirikLagu;
    }
    public void bingo() {
        String[] kata = {"B ", "I ", "N ", "G ", "O"};
        System.out.println(Arrays.toString(kata));
        System.out.println(Arrays.toString(kata));
        System.out.println(Arrays.toString(kata));
        for (int j = 0; j < kata.length; j++) {
            kata[j] = "(clap) ";
            System.out.println(Arrays.toString(kata));
            System.out.println(Arrays.toString(kata));
            System.out.println(Arrays.toString(kata));
        }    	
    }
    public void lyrics() {
    	for (int i = 0; i < 5; i++) {
        System.out.println(this.lirik);
    }
}
}