class exception_handling7{
    public static void main(String[] args) {
        try {
            int a , b;
            b = 0;
            a = 5 / b;
            System.out.println("A");
            //System.out.println("Hello"+" "+ 1 / 0);
        } catch(ArithmeticException e){
            // TODO: handle exception
            //System.out.println("incatchblock");
            
            System.out.println("B");
        }
        /*
        finally{
            System.out.println("inFinallyblock");
        }
         */
    }
}