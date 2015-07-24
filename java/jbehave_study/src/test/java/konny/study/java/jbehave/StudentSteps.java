package konny.study.java.jbehave;

import org.hamcrest.CoreMatchers;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;

import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Author: konnyjinx
 * Date:15/7/23.下午2:42
 */
public class StudentSteps {
    private ClassRoom classRoom;
    private Student student;

    @Given("There is a student")
    public void initStudent() {
        student = new Student();
    }

    @Given("his name is '$name'")
    public void setName(@Named("name") String name) {
        student.setName(name);
    }

    @Given("his age is '$age'")
    public void setAge(@Named("age") Integer age) {
        student.setAge(age);
    }

    @Given("his hobby is '$hobby'")
    public void setHobby(@Named("hobbu") String hobby) {
        student.setHobby(hobby);
    }

    @Given("his father's name is '$fatherName'")
    public void setFatherName(@Named("fatherName") String fatherName) {
        student.setFatherName(fatherName);
    }

    @Given("his mother's name is '$motherName'")
    public void setMotherName(@Named("motherName") String motherName) {
        student.setMotherName(motherName);
    }

    @Given("his brother's name is '$brotherName'")
    public void setBrotherName(@Named("brotherName") String brotherName) {
        student.setBrotherName(brotherName);
    }


    @Given("Get student '$studentName'")
    public void getStudent(@Named("studentName") String studentName) {
        student = classRoom.getStudent(studentName);
    }

    //    When system Update student name to "Lin"
    @When("system Update student name to '$studentName'")
    public void updateStudentName(@Named("studentName") String studentName) {
        classRoom.studentUpdateName(student,studentName);
    }


    @When("system add the student into class")
    public void addStudentIntoClass() {
        classRoom = new ClassRoom();
        classRoom.addStudent(student);
    }

    @Then("we can get student '$studentName' from class")
    public void checkGetStudent(@Named("studentName") String studentName) {
        assertThat(classRoom.getStudent(studentName), CoreMatchers.equalTo(student));
    }


    @Given("There is a student with default details")
    @Composite(steps = {
            "Given his name is 'Lincoln2'",
            "Given his age is '18'",
            "Given his hobby is 'basketball'",
            "Given his father's name is 'Mike'",
            "Given his mother's name is 'Mary'",
            "Given his brother's name is 'Luis'"
    })
    public void createStudentWithDefaultDetails() {
    }


    @Given("There is a student  with details:$details")
    public void setDetails(@Named("details") ExamplesTable details) {
        student = new Student();
        Parameters parameters = details.getRowAsParameters(0);
        student.setName(parameters.valueAs("name", String.class));
        student.setAge(parameters.valueAs("age", Integer.class));
        student.setHobby(parameters.valueAs("hobby", String.class));
        student.setFatherName(parameters.valueAs("father name", String.class));
        student.setMotherName(parameters.valueAs("mother name", String.class));
        student.setBrotherName(parameters.valueAs("brother name", String.class));
    }

}
