package basics.basics;

class CodeBlocks {
    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }

    void method() {
        System.out.println("Method block");

        if (true) {
            int x = 5;
            System.out.println("If block: " + x);
        }

        {
            int y = 10;
            System.out.println("Local block: " + y);
        }
    }

    public static void main(String[] args) {
        CodeBlocks demo = new CodeBlocks();
        demo.method();
    }
}