package tiga;
public class SongPlay {
	    
	    public static void main(String[] args) {
	    	String lirik1 = "There was a farmer who had a dog\nAnd Binggo was his name-o\n";
	    	String lirik2 = "And Bingo was his name-o\n\n";
	        Song lagu1 = new Song(lirik1 + lirik2);
	    	//System.out.println("There was a farmer who had a dog\nAnd Bingo was his name-o\n[B , I , N , G , O]\n[B , I , N , G , O]\n[B , I , N , G , O]\nAnd Bingo was his name-o\n\n");
	        System.out.println(lirik1);
	        lagu1.bingo();
	        System.out.println(lirik2);
	        lagu1.lyrics();
	    }
	}
