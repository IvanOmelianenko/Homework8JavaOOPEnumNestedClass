public class A {
    private String name;
    private int age;

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static class B {
        void methodForB() {
            System.out.println("This method from B");
        }

        public static void main(String[] args) {
            A.B classFromB = new A.B();
            classFromB.methodForB();
        }

    }
}
