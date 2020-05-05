public class overloding {
    public  void show(int a){
        System.out.println("hii"+a);
    }
    public  void show(String b){
        System.out.println("hellow "+b);
    }

    public static void main(String[] arg){
        overloding obj= new overloding();
        obj.show(2);
        obj.show("welcome");
    }
}
