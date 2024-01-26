class exception_handling8{
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
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