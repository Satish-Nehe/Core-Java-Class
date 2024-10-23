package patternPrograms;

public class demo8 {
    /*

       *
      * *
     * * *
    * * * *
   * * * * *
    * * * *
     * * *
      * *
       *
     */

    public static void main(String[] args) {
        for(int row=1;row<=5;row++){
            //spaces
            for(int spaces=5-row;spaces>0;spaces--){
                System.out.print(" ");
            }

            //stars
            for(int star=1;star<=row;star++){
                System.out.print("* ");
            }
            System.out.println( );
        }
        for(int row=4;row>=1;row--){
            //spaces
            for(int spaces=0;spaces<=4-row;spaces++){
                System.out.print(" ");
            }

            //stars
            for(int star=row;star>=1;star--){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
