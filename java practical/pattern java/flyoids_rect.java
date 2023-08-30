/**
 * flyoids triangle
 * 1
 * 23
 * 456
 * 789 10
 */
public class flyoids_rect {
int m=5;
void flyvoids(){
    for (int i = 1; i <= m; i++) {
        int k=1;
        for (int j = 1; j < i; j++) {
            System.out.print(k+" ");
            
            k++;
            
        }
        System.out.println("");
        
    }
}
    public static void main(String[] args) {
        flyoids_rect foo = new flyoids_rect();
        foo.flyvoids();
        
    }
}