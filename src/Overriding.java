public class Overriding {
    public void show(String a){
        System.out.println("wellcome " +a);
    }
}
class test1 extends Overriding{
    @Override
    public void show( String b) {
        System.out.println("hii " +b );
    }
    public static void main(String[] arg){

        Overriding x= new Overriding();
        x.show("Miss Harshali");

        test1 y= new test1();
        y.show("elon");

        Overriding z=new test1();
        z.show("ron");
    }

}
