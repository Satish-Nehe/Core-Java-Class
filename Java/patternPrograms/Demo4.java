package patternPrograms;

public class Demo4 {
    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    1 2 3 4 5 6
    1 2 3 4 5 6 7
     */
    public static void main(String[] args) {
        for(int row=1;row<=7;row++){
            for(int column=1;column<=row;column++){
                System.out.print(column+" " );
            }
            System.out.println();
        }
    }
}
