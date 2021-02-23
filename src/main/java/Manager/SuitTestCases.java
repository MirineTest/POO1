package Manager;




public class SuitTestCases {

    public static TestCase test(String title, String description, String priority, Owner owner) {

        TestCase test1 = new TestCase(title);
        test1.setPriority(priority);
        test1.setDescription(description);
        test1.setOwner(owner);
        return test1;

    }

    public static void print(TestSuit suit) {
        System.out.println(suit.getSuiteName());
        for (TestCase test : suit.getTestCase()
        ) {

            System.out.println(test.getTitle());
            System.out.println(test.getPriority());
            System.out.println(test.getOwner().getName());
            System.out.println(test.getDescription());

        }


    }

    public static void filterByOwner(TestSuit suit, String nameOwner) {
        System.out.println(suit.getSuiteName());

        for (TestCase test : suit.getTestCase()

        ) {
            if (test.getOwner().getName().equals(nameOwner)) {
                System.out.println(test.getTitle());
                System.out.println(test.getPriority());
                System.out.println(test.getOwner().getName());
                System.out.println(test.getDescription());

            }
        }


    }
}
    /**public  static void filterByPriority(TestSuit suit, String priority) {
        System.out.println(suit.getSuiteName());
        int i=0;

        while (i < suit.getTestCase().size())

         {
                if (suit.getTestCase().get(i).getPriority() == priority) {

                    Printer.print(suit.getSuiteName(),
                            suit.getTestCase().get(i).getTitle(),
                            suit.getTestCase().get(i).getOwner().getName(),
                            suit.getTestCase().get(i).getPriority());
                }
                i++;
            }
        }


    }**/


/**while (i < suite.getTestcases().size()) {
        if (suite.getTestcases().get(i).getPriority() == priority) {
        Printer.print(suite.getSuiteName(),
        suite.getTestcases().get(i).getTitle(),
        suite.getTestcases().get(i).getOwner().getFirstName(),
        suite.getTestcases().get(i).getPriority());
        }
        i++;
        }
**/



