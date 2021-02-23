package Manager;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String arg[]){

        Owner owner= new Owner("Miri");
        Owner owner1= new Owner("Miri");
        Owner owner2=new Owner("Lian");

        /**Create 2 testSuit **/
        List <TestSuit> suits= new ArrayList<>();
        suits.add(new TestSuit("Test Suit1 "));
        suits.add(new TestSuit("Test Suit2 "));

        /** Create 5 test case **/
        suits.get(0).addTestCase(SuitTestCases.test("Test1","Description of test case1","1",owner1));
        suits.get(0).addTestCase(SuitTestCases.test("Test2","Description of test case2","1",owner));
        suits.get(0).addTestCase(SuitTestCases.test("Test3","Description of test case3","2",owner2));
        suits.get(0).addTestCase(SuitTestCases.test("Test4","Description of test case4","2",owner1));
        suits.get(0).addTestCase(SuitTestCases.test("Test5","Description of test case5","1",owner2));

        suits.get(1).addTestCase(SuitTestCases.test("Test1","Description of test case1","1",owner1));
        suits.get(1).addTestCase(SuitTestCases.test("Test2","Description of test case2","2",owner2));
        suits.get(1).addTestCase(SuitTestCases.test("Test3","Description of test case3","1",owner1));
        suits.get(1).addTestCase(SuitTestCases.test("Test4","Description of test case4","1",owner2));
        suits.get(1).addTestCase(SuitTestCases.test("Test5","Description of test case5","2",owner1));


        SuitTestCases.print(suits.get(0));
        SuitTestCases.print(suits.get(1));

       /**Filter by  owner**/

        SuitTestCases.filterByOwner(suits.get(0),"Lian");

        /** Filter by priority**/

      //  SuitTestCases.filterByPriority(suits.get(0),"2");
    }


}


