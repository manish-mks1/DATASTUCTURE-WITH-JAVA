public class ReplaceStr {
    public static void replaceStr(String str){
        if(str.length()==0)
        return;
        if(str.charAt(0)=='p'&& str.charAt(1)=='i'){
            System.out.print("3.14");
            replaceStr(str.substring(2,str.length()));
        }
        else{
            System.out.print(str.charAt(0));
            replaceStr(str.substring(1,str.length()));

        }
    }
    public static void main(String[] args) {
        String str="piapfsgpiisffpiiippi";
        replaceStr(str);
    }
}
