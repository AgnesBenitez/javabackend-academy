interface GenereicInterface<T>{
    void set (T t);
    T get();
}
public class IntegerImplementer implements GenereicInterface<Integer>{
    Integer value;
    @Override
    public void set(Integer value) {
        this.value = value;
    }

    @Override
    public Integer get() {
        return this.value;
    }

    public static void main(String[] args) {
        IntegerImplementer i = new IntegerImplementer();
        i.set(10);
        System.out.println("Value = "+ i.get());
    }
}
