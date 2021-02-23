package Manager;

import java.util.ArrayList;
import java.util.List;

public class TestCase {
    private String title;
    private String  priority ;
    private String description;
    private Owner owner;
    private List<String> steps;
    private String expectedResults;
    private String status;

    public TestCase(String title) {
        this.title = title;
        setPriority("Priority 1");
        steps = new ArrayList<>();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;

    }

    public List<String> getSteps() {
        return steps;
    }

    public void addSteps(String step) {
        steps.add(step);
    }

    public String getExpectedResults() {
        return expectedResults;
    }

    public void setExpectedResults(String expectedResults) {
        this.expectedResults = expectedResults;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
