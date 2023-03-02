package ciklusok;

/**
 *
 * @author Pizza Hut
 */
public class Sarkanyok {
    public static void main(String[] args) {
        
    int x = 7;
    int y = 11;
    while (x + y != 145){
        for(int i = 0; i < 145; i++){
            x++;
            y++;
            if(x + y == 145){
                System.out.printf("%d+%d",x,y);
                break;
            }
        }
    }
}
}
