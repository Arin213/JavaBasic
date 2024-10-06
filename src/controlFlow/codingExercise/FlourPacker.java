package controlFlow.codingExercise;

/**Flour Pack Problem

 Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.

 The parameter bigCount represents the count of big flour bags (5 kilos each).

 The parameter smallCount represents the count of small flour bags (1 kilo each).

 The parameter goal represents the goal amount of kilos of flour needed to assemble a package.

 Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
 The method should return true if it is possible to make a package with goal kilos of flour.

 If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
 For example, if goal = 9, bigCount = 2, and smallCount = 0,
 the method should return false since each big bag is 5 kilos and cannot be divided.
 However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true
 because of 1 full bigCount bag and 4 full smallCount bags equal goal, and
 it's okay if there are additional bags left over.

 If any of the parameters are negative, return false.


 EXAMPLE INPUT/OUTPUT:

 canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.

 canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.

 canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos,
 and we have 1 bag left which is ok as mentioned above.

 canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo),
 makes in total 12 kilos and goal is 11 kilos.

 canPack (-3, 2, 12); should return false since bigCount is negative.


 NOTE: The method canPack should be defined as public static like we have been doing so far in the course.
* */
public class FlourPacker {
    public static void main (String[] args){
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3, 3,12));
        System.out.println(canPack(3, 0,15));
        System.out.println(canPack(4, 18,19));
        System.out.println(canPack(2, 1,5));
        System.out.println(canPack(6, 2,17));

    }
    // bigCount represents the number of big flour bags (5 kilos each).
    // smallCount represents the count of small flour bags (1 kilo each).
    // goal represents the goal number of kilos of flour needed to assemble the package.

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        /** First, we need to count the bigCount where each count has 5 kilos and compare if the
         * kilos exceed the goal or not if it exceeds then check for the remainder (goal % 5(bigCount)) spaces by comparing
         * smallCount >= remainder spaces 0r not small count is >= then return true.
         *
         * Now if the bigCount is less than goal then we have to check how many spaces are necessary to fill up the bag
         * and then compare if the smallCount >= necessary spaces then return true otherwise return false.
         * */
        int getKilos = bigCount * 5; //get kilos from big flour bags
        if (getKilos > goal){
            int remainingKilos = goal %  5; //get the remaining kilos to fill up the bags
            return smallCount >= remainingKilos; // compare if the spaces are filled or not
        }else{
            return smallCount >= goal - getKilos; //if the bigCount is small then compare the smallCount with remaining spaces
        }

    }
}
