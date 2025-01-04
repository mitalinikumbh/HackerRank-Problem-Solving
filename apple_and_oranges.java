// Mitali Nikumbh 

// Problem Link: https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true

class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    
    int newValue = 0;
    int newValue1 = 0;
    for(int i=0;i<apples.size();i++) {
        newValue = apples.get(i) + a;
        list1.add(newValue);
    }
    
    for(int i=0;i<oranges.size();i++) {
        newValue1 = oranges.get(i) + b;
        list2.add(newValue1);
    }
    
    int countApples = 0;
    int countOranges = 0;
    
    for(int num1: list1) {
        if(num1>=s && num1<=t) {
            countApples++;
        }
    }
    
    for(int num2: list2) {
        if(num2>=s && num2<=t) {
            countOranges++;
        }
    }
    
    System.out.println(countApples);
    System.out.println(countOranges);

    }

}
