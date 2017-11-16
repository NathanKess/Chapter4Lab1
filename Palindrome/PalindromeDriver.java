public class PalindromeDriver
{
    public static void main(String args[]){
        Palindrome p = new Palindrome("mom");
        boolean correct = p.testWord();
        System.out.println("the word is a word " + p.word + " is a palindrome " + correct);
    }
}