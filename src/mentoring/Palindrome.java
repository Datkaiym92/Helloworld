package mentoring;

public class Palindrome {
    public static void main( String [] args) {
        //str.charAt(0);
        //str.charAt(str.length()-1)

        String str = "kayak";
        int sizeSt = str.length();// 5
        int index = 0;// we will use it for each character
        while (index < sizeSt/2) { // 0<5
            char ch1 = str.charAt(index);//k
            char ch2 = str.charAt(sizeSt - 1-index);//k

            if (ch1 == ch2) { // k == k
                System.out.println(""+ch1 + "==" +ch2);
            } else {
                System.out.println(""+ch1 + "==" +ch2);
                System.out.println("not palindrome");
                return;
            }
            index++;
        }System.out.println("palindrome ");
    }
}
