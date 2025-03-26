
public class Main {
    /*
     * *****************************************************************************
     * DO NOT EDIT THIS CODE.
     * *****************************************************************************
     * 
     * This code is used to boostrap your solution to be checked for correctness by
     * our system.
     */
    public static void main(String[] args) {
        String[] input = args[0].split("\\|");
        String str = input[0].trim();
        int k = Integer.parseInt(input[1].trim());
        int output = new Solution().compressString(str, k);
        System.out.println(output);
    }
}
