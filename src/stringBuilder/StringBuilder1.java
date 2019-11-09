package stringBuilder;

public class StringBuilder1 {

    public static void main( String[] args){

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        StringBuilder sb1 = new StringBuilder("DevX School");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        StringBuilder sb2 = new StringBuilder(10);
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        //append
        StringBuilder sb3 = new StringBuilder();
        sb3.append(" Name: ");
        sb3.append("John\tDoe ");
        sb3.append("\nGrade ").append("\"A\" ").append(" \nGPA: ");
        sb3.append(4.0);
        System.out.println(sb3);

        // insert

        StringBuilder sb4 = new StringBuilder("DevX School");
        sb4.insert(4 ,"<>");
        System.out.println(sb4);
        sb4.insert(13, " !!!");
        System.out.println(sb4);

        // delete
        StringBuilder sb5 = new StringBuilder("Senior SDET");
        sb5.delete(1,5);
        System.out.println(sb5);

        StringBuilder sb6 = new StringBuilder("Senior SDET");
        sb6.delete(sb6.indexOf("e"),sb6.indexOf("r"));
        System.out.println(sb6); // dynamic

        StringBuilder sb7 = new StringBuilder("1000000");
        sb7.deleteCharAt(5);
        System.out.println(sb7);

        StringBuilder sb8 = new StringBuilder("1000000");
        sb8.deleteCharAt(sb8.indexOf("0"));
        System.out.println(sb8);// dynamic

        StringBuilder sb9 = new StringBuilder("Googggle Chrome");
        sb9.deleteCharAt(4).deleteCharAt(4).deleteCharAt(3).insert(3,"g");
        System.out.println(sb9);

        //reverse

        String str = " Chicago 2019";
        StringBuilder sb10 = new StringBuilder(str);
        System.out.println(sb10.append(" DevX School "));
        System.out.println(str);
        sb10.reverse();
        System.out.println(sb10);

        // String toString
        str = sb10.toString();
        System.out.println(str);


    }
}
