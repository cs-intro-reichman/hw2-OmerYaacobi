// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code

            String chosenWord= args[0];
            chosenWord= chosenWord.toUpperCase();
            int i= chosenWord.length();
            int number= Integer.parseInt(args[1]);
            String char_an= "AEFHILMNORSX";

            while (i>0) {
                    char Letter= chosenWord.charAt(chosenWord.length()-i);
                    if (char_an.indexOf(Letter) != -1){System.out.println("Give me an "+ Letter+ "!");}
                    else{System.out.println("Give me a  "+ Letter+ "!");}
                    i=i-1;
                    
            }
            System.out.println("What does it spell?");
            while (number>0) {
                    System.out.println(chosenWord+ "!!!");
                    number= number-1;
            }
        }
}
