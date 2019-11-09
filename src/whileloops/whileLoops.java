package whileloops;

public class whileLoops {

    public static void main(String [] args) throws InterruptedException {

        String str = " You are awesome";

        boolean isAwesome =true;

        int count = 0;

        while (isAwesome) {
            System.out.println(str);
            count++;

            if(count >=3){
            isAwesome=false;
            }
        }
        System.out.println("While loop is exited ");



        int count2=0;
        while (count2<4){
            System.out.println(str + " while loop 2");
            count2++;
        }

        int count3 = 5;
        while (count3>0){
            System.out.println(count3--);
           //Thread.sleep(1000l);

            if( count3==0){
                System.out.println("Kaaaabbboom");
            }

        }

        String str1 ="";
        int countG =3;

        while (!str1.equals("GGG")){
          str1= str1.concat("G");
            System.out.println(str1);

        }
        System.out.println(str1);

        String str2 ="";

        while (str2.length() <3){
            str2= str2.concat("F");
            System.out.println(str2);

        }
        System.out.println(str2);


        String str3 ="Hello my friend";
        //System.out.println(str3.charAt(4));

        int i=0;

        while (i<str3.length()) {
            System.out.print(str3.charAt(i));
            i++;
        }









    }
}
