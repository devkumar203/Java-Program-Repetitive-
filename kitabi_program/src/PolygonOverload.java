public class PolygonOverload {
    public void polygon(int n, char ch){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=n; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public void polygon(int x, int y){
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= y; j++){
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
    public void polygon(){
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        PolygonOverload ob = new PolygonOverload();
        ob.polygon(3,'F');
        ob.polygon(2,4);
        ob.polygon();
    }
}
