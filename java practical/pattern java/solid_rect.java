// printing solid rectangle 

// *****
// *****
// *****
// *****







public class solid_rect{
    int n=4,m=5;
    
void solidrect(){
    for (int i = 1; i <= n; i++) {

        for (int j = 0; j <=m; j++) {

            System.out.print("*");
            
        }
        System.out.println("");
    }
}

    public static void main(String[] args) {

        solid_rect obj = new solid_rect();
        obj.solidrect();

        
    }
}

