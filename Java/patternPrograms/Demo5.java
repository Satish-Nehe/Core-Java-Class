package patternPrograms;

public class Demo5 {
    /*
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
    6 6 6 6 6 6
     */
    public static void main(String[] args) {
        for(int row=1;row<=6;row++){
            for(int column=1;column<=row;column++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
