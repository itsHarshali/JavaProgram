enum level2 {
    low,
    midium,
    high
}
public class Level{
    public static void main(String[] args) {
        level2 myVar = level2.high;
        System.out.println(myVar);
        for (level2 myVar2 : level2.values()) {
            System.out.println(myVar2);
        }
    }
}
//values() method, which returns an array of all enum constants