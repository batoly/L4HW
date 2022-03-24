/**
 * Created by Lenovo on 2/20/2022.
 */
public class josephus {
    static int josephus(int g,int j){
        if (g==1)
            return 1;
        else
            return (josephus(g-1,j)+j-1)%g+1;
    }

    public static void main(String[] args) {
        int g=12;
        int j=4;
        System.out.println(" Chosen place is"+josephus(g,j));
    }
}
