public interface InterfaceTest {
    void test( int a);

    static void netest() {
        int a;
    }

    static void netest2() {
        int a;
    }

    default int run(){
        return 0;
    }
}
