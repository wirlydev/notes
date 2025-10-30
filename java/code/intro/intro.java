class Test {
    
    //public > means this can be called from anywhere
    //static > this can be called without creating an instance of the class
    //void > doesn't return a value
    //main > is a special name that the jvm will look for to run the initial code, rename it and see things break

    public static void main(String[] args) {
        //compilation error when below line is commented
        //String message = "Hi There";
        //System.out.println(message);

        //truntime error if run like 
        //java test.java because the args array is empty
        //System.out.println(args[1]);
    }
}
