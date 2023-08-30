//printing taable from 1 to 5

public class table {

    void tablet(){
        int n=2,m=5;

      for (int j = 2; j <=m; j++) {
        
      

        for (int i = 1; i <=10;i++){
        
        System.out.println(n+" * "+i+" = "+i*n );
        }
        n++;

        System.out.print(" "+String.format(null, null));
    }

    }
public static void main(String[] args) {
    table tt = new table();
    tt.tablet();
}
}
