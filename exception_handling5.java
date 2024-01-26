class exception_handling5{
    public static void main(String[] args) {
        try {
            int i;
            return;
            //System.out.println("Hello"+" "+ 1 / 0);
        } catch(ArithmeticException e){
            // TODO: handle exception
            System.out.println("incatchblock");
        }
        finally{
            System.out.println("inFinallyblock");
        }
        
    }
}