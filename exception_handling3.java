class exception_handling3{
    public static void main(String[] args) {
        try {
            int a = args.length;
            int  b = 10 /a;
            System.out.println(a);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("1");
        }
    }
}