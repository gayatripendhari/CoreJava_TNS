class exception_handling2{
    public static void main(String[] args) {
        try {
            throw new NullPointerException("Hello");
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("B");
        }
    }
}