package ejpolimorfismo;

public class C extends B{
    @Override
    public int m1() {
        return 3;
    }
    
    @Override
    public int m2() {
        return super.m2();
    }
    
    @Override
    public int m3() {
        return m3();
    }
}
