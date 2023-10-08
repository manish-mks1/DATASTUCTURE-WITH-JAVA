public class TowerOfHanoi {
    public static void towerOfHanoi(int n,String src,String des,String help){
        if(n==0)
        return;
        towerOfHanoi(n-1,src,help,des);
        System.out.println(src+" -> "+des);
        towerOfHanoi(n-1,help,des,src);
    }
    public static void main(String[] args) {
        towerOfHanoi(3,"A","C","B");
    }
}
