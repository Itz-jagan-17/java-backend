class tribonacci {
    public int tribonacci(int n) {
        if(n==0){
        return 0;
        }else if (n==1||n==2){
            return 1;
        }
        int first_term =0;
        int second_term =1;
        int third_term =1;
        for(int i=3;i<=n;i++){
            int fourth_term=first_term + second_term + third_term;
            first_term=second_term;
            second_term=third_term;
            third_term=fourth_term;
        }
        return third_term;
    }
}