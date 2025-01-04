// Mitali Nikumbh

// Probelem Link :- https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true



class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    int highPoint = scores.get(0);
    int lowPoint = scores.get(0);
    
    int countHigh = 0;
    int countLow = 0;
    
    for(int i=1;i<scores.size();i++) {
        
        if(scores.get(i) > highPoint) {
            highPoint = scores.get(i);
            countHigh++;
        }
        else if (scores.get(i)<lowPoint) {
            lowPoint = scores.get(i);
            countLow++;
        }
    }
    
    List<Integer> list = new ArrayList<>();
    list.add(countHigh);
    list.add(countLow);
    
    return list;    

    }

}
