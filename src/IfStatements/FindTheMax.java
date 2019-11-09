package IfStatements;

public class FindTheMax {
    public static void main(String [] args){

        int a = 2;
        int b =4;
        int c = 6;

        // Find the maximum number

        if(a<b){ System.out.println(" B is bigger number ");
            if ( b<c){System.out.println(" C number is max ");
            }if(a<c && b>a){
                System.out.println( " most bigger num " +c);
            }
        }
    }
}
