interface numbers{
    int process(int x, int y);
}

class sum implements numbers{
    public int process(int x, int y){
        return x+y;
    }
}

class avg implements numbers{
    public int process(int x, int y){
        return (x+y) / 2;
    }
}

public class mix {
    public static void main(String[] args) {
        sum s = new sum();
        System.out.println(s.process(10, 10));
        avg a = new avg();
        System.out.println(a.process(10, 10));
    }
}
