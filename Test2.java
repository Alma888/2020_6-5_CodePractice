public class Test2 {
    public void add(Byte b){
        b=b++;
    }
    public void test(){
        Byte a=127;
        Byte b=127;
        add(++a);
        System.out.print(a+" ");
        add(b);
        System.out.print(b+" ");
    }

    public static void main(String[] args) {
        Test2 te=new Test2();
        te.test();
    }
}

//输出-128 127
