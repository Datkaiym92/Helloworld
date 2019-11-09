package strings;

public class String1 {

    public static void main(String [] args){

        String literal = " Hello World";
        String newKeyword = new String(" Hello World");

        System.out.println(literal);
        System.out.println(newKeyword);


        System.out.println("1"+2);
        String s= 2+"2";
        System.out.println(s);

        System.out.println(199.00 +"2"+"1"+ 1+1+9);

        String s1 ="4";
        s1 += "12";
        System.out.println(s1);//"23"+4

        String s2="23";
        s2+= 4;
        System.out.println(s2);


        String str1 = "oxoxoxox";
        System.out.println(str1);
        String str2 =str1.replace('x','X');
        System.out.println(str2);
    }
}
