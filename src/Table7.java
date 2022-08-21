public class Table7 {
    public static void main(String[] args) {
        table(6);
    }
    public static void table(int n){
        for(int i=0;i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i, n*i);
        }
    }
}
