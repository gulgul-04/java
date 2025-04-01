public class pattern {
    public static void main(){
        // solid rectangle 
        /*for (int i = 1; i <=4; i++){
            for(int j = 1; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }*/

        //empty rectangle
        /*int n = 4;
        int m = 5;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(i==1 || i == n || j == 1 || j == m){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }*/

        //half pyramid
        /*for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }*/

        //inverted half pyramid
        for(int i = 1; i <= 4; i++){
            for(int j = 4; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}