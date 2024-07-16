class N{
    public Integer i(){
        return 33;
    }
}
public class Numbers {
    public static void main(String[] args) {
        N[][] nrs = new N[2][2];
        System.out.println(nrs[1][0].i());
    }
}
