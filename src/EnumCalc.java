public class EnumCalc {
    public static void main(String[] args) {
        System.out.println(calc.EXPONENTATION.action(2, 3));
        System.out.println(calc.SUM.action(10, 6));
    }
    enum calc {
        SUM{
            @Override
            public int action(int a, int b) {
                return a + b;
            }
        },
        SUBTRACT{
            @Override
            public int action(int a, int b) {
                return a - b;
            }
        },
        DIVISION{
            @Override
            public int action(int a, int b) {
                return a / b;
            }
        },
        MULTIPLY{
            @Override
            public int action(int a, int b) {
                return a * b;
            }
        },
        EXPONENTATION{
            @Override
            public int action(int a, int b) {
                return (int) Math.pow((double) a, (double) b);
            }
        };

        public abstract int action(int a, int b);

    }
}
