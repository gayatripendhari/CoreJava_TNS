class exception_handling4{
    public static void main(String[] args) {
        try {
            System.out.println("Hello"+" "+ 1 / 0);
        } catch(ArithmeticException e){
            // TODO: handle exception
            System.out.println("world");
        }
        /*
        finally{
            System.out.println("inFinallyblock");
        }
         */
    }
}