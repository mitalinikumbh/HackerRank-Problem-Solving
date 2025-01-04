
// Mitali Nikumbh 

// HackerLand University has the following grading policy:

// Every student receives a  in the inclusive range from  to .
// Any  less than  is a failing grade.
// Sam is a professor at the university and likes to round each student's  according to these rules:

// If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
// If the value of  is less than , no rounding occurs as the result will still be a failing grade.
// Examples

//  round to  (85 - 84 is less than 3)
//  do not round (result is less than 38)
//  do not round (60 - 57 is 3 or higher)
// Given the initial value of  for each of Sam's  students, write code to automate the rounding process.

// Function Description

// Complete the function gradingStudents in the editor below.

// gradingStudents has the following parameter(s):

// int grades[n]: the grades before rounding
// Returns

// int[n]: the grades after rounding as appropriate

// below code is written for the method (gradingStudents) 


class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List<Integer> list = new ArrayList<>();
    for(int grade: grades) {
        if(grade < 38) {
            list.add(grade);
        }
        else {
            int nextMulti = ((grade/5)+1) * 5;   // finding the next multiple of 5 
            if(nextMulti - grade < 3) {
                list.add(nextMulti);
            }
            else {
                list.add(grade);
            }
        }
    }
    
    return list;

    }

}
