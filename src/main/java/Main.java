

public class Main{

    /*
     * **************************************************************************************
     *                          DO NOT EDIT THIS CODE.
     * ***************************************************************************************
     * This code is used to boostrap your solution to be checked for correctness by our system.
     */
    public static void main(String[] args){
        String input = args[0];
        StringCompression sc = new StringCompression();
        String compressed = sc.compressString(input);
        System.out.println(compressed);
    }
}
