class exception_handling6{
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 5;
            int c = b/ a;
            System.out.println("Hello");
            //System.out.println("Hello"+" "+ 1 / 0);
        } catch(ArithmeticException e){
            // TODO: handle exception
            //System.out.println("incatchblock");
            System.out.println("World");
        }
        /*
        finally{
            System.out.println("inFinallyblock");
        }
         */
    }
}