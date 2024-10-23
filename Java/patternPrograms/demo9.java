package patternPrograms;

public class demo9 {
    /*
    1
    0 1
    0 0 1
    0 0 0 1
    0 0 0 0 1
    0 0 0 0 0 1
     */
    public static void main(String[] args) {
        for(int row=1;row<=6;row++){
            for(int column=1;column<=row;column++){
                System.out.print(column==row?"1 ":"0 ");
            }
            System.out.println();
        }
    }
}
