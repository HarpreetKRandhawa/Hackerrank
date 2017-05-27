class Calculator{
    int power(int a, int b){
        if(a < 0 || b < 0){
            throw new ArithmeticException("n and p should be non-negative");
        }
        int res = (int)Math.pow((double)a,(double)b);
        return res;
    }
}
