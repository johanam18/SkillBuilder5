/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class SkillBuilder5
{
    /**
     * Calculates the prefix average of array data and returns the prefix average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */
    public static double[] prefixAverage(double[] data)
    {
        double[]  ans = new double[data.length];
        double sum = 0;
        for(int i = 0; i < data.length; i++){
            sum += data[i];
            ans[i] = sum / (i+1);
        }
        return ans;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int  indexOf(int searchValue, int[] anArray)
    {
        for(int i = 0; i < anArray.length; i++){
            if(searchValue == anArray[i]) return i;
        }
        return -1;
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param s a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int indexOf(String s, String[] anArray)
    {
        for(int i = 0; i < anArray.length; i++){
            if(s.equals(anArray[i])) return i;
        }
        return -1;
    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param s string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray)
    {
        int count = 0;
        for(int i = 0; i < anArray.length; i++){
            if(s.equals(anArray[i])) count++;
        }

        String[] ans = new String[anArray.length - count];
        int index = 0;
        for (int i = 0; i < anArray.length; i++){
            if(!s.equals(anArray[i])){
                ans[index] = anArray[i];
                index++;
            }

    }
        return ans;
    }

    /**
     * Reverses an array of integers.
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray)
    {
        int[] reverseanArray = new int[anArray.length];
        for(int i = 0; i < anArray.length; i++){
            reverseanArray[i] = anArray[i];
        }
        int index = 0;
        for(int i = reverseanArray.length - 1; i >= 0; i--){
            anArray[index] = reverseanArray[i];
            index++;
        }

    }
}
