package Manager;

import java.util.ArrayList;
import java.util.List;

public class TestSuit {
    public String SuiteName;
    public String description;
    public List <TestCase> testCase;

    public TestSuit(String suiteName) {
        SuiteName = suiteName;
        testCase = new ArrayList<TestCase>();
    }

    public String getSuiteName() {
        return SuiteName;
    }

    public void setSuiteName(String suiteName) {
        SuiteName = suiteName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TestCase> getTestCase() {
        return testCase;
    }

    public void addTestCase(TestCase test) {
       testCase.add(test);
    }
}

