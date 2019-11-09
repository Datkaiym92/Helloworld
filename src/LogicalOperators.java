public class LogicalOperators {

    public static void main(String[] args){

        boolean isOld =true;
        boolean isOld2= false;

        boolean oldResult = isOld || isOld2; // || conditional or

        System.out.println(" is old resuls : " + oldResult);

        boolean isMillionaire =true;
        boolean isWifeMillionaire = false;
        boolean isChildMillionaire  = isMillionaire || isWifeMillionaire;
        System.out.println(" is child a millionaire " + isChildMillionaire);

        boolean isSunny = true;
        boolean isRainy = true ;
        boolean isRainbow = isSunny&& isRainy; // && conditional and
        System.out.println(" will there be a rainbow " + isRainbow);

        boolean isSunny1 = false;
        boolean isRainy1 = true ;
        boolean isRainbow1 = isSunny1 && isRainy1;
        System.out.println(" will there be a rainbow 1 : " + isRainbow1);

        boolean negating = !true;// ! mark will change the true to false and false to true
         System.out.println(" The value og negated noolean is "+ negating);

         boolean negating2 =!false;
         boolean trueBoolean = true;
         System.out.println(" the value of true Boolean " + true   );
         System.out.println(" the value of negated boolean 2 : " + negating2);
    }
}
