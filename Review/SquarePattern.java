import java.util.Scanner;
class SquarePattern{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int s;
        s=scan.nextInt();
        squarePattern(s);
    }
    private static void squarePattern(int s){
        for(int row=0;row<s;row++){
            for(int col=0;col<s;col++){
                if(col==row) System.out.print((row+1)*2+" ");
                if(col!=row) System.out.print("- ");
            }
            System.out.print("\n");
        }
    }
}