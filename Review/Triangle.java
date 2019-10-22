import java.util.Scanner;
class Triangle{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int h=scan.nextInt();
        triangle(h);
    }
    
    public static void triangle(int h1){
        int h=h1;
        int total=h*2-1;
        for(int i=1;i<=h;i++){
            for(int count=1;count<=total;count++){
                if(count<=h-i) {
                    System.out.print(" ");
                }
                if(count>h-i && count<h+i) {
                    System.out.print("*"); 
                }
                if(count>=h+i && count<total){
                    System.out.print(" "); 
                }
                if(count>=total){
                    System.out.print("\n");
                }
            }
        }
    }
}