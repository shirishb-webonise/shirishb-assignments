/*
 * This Spock specification was auto generated by running the Gradle 'init' task
 * by 'webonise' at '22/8/16 12:44 PM' with Gradle 3.0
 *
 * @author webonise, @date 22/8/16 12:44 PM
 */

package test.groovy;
import main.java.QuickSort;
import spock.lang.Specification

class QuickSortSpec extends Specification{
    def "QuickSort method Sorts input Array"() {
        setup:
			def inputArrayList=[23,43,55,123,1,67,88,100]
			int[] inputArray=[23,43,55,123,1,67,88,100]
	        QuickSort quicksort = new QuickSort(inputArray,inputArray.size()-1);
        when:"calling the QuickSort method which sorts input"
	        quicksort.sort(0,inputArray.size()-1)
			def result=new ArrayList(Arrays.asList(quicksort.getSortedArray()))
			def expectedResult=inputArrayList.sort()
        then:"Sorted array is comapred with function returned array"
        result == expectedResult
    }
	def "QuickSort do not sorts for empty array"(){
		
		setup:
				int[] inputarray=null; 
				QuickSort quicksort = new QuickSort(inputarray,0);
			
		when:"calling the QuickSort method which sorts input"
				quicksort.sort(0,0);
				def result=quicksort.getSortedArray()
		then:"Sorted array is comapred with function returned array"
				result == null
	}
}
