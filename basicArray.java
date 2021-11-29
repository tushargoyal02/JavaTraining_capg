class basicArray{

    static void arrays(){
        int[] scores = new int[4];    // as array is object so we use new keyword
        System.out.println(scores[0]);  // prints first element here
        scores[0]=11;
        System.out.println(scores[0]);

        //method2
        int scores1[] = new int[4];
        
        //method 3
        int[] newscore = new int[] {10,20,30};

        //method 4 : easy one
        int[] score2 = {1,2,3,4,5};
        // to get the size of array
        System.out.println("Size is "+ scores.length);
    }
    public static void main(String[] args){
        arrays();
    }
}