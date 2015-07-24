package konny.study.java.jbehave;

import junit.framework.Assert;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;


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
    public void setName(@Named("name")String name) {
        student.setName(name);
    }

    @Given("his age is '$age'")
    public void setAge(@Named("age")Integer age) {
        student.setAge(age);
    }

    @Given("his hobby is '$hobby'")
    public void setHobby(@Named("hobbu")String hobby) {
        student.setHobby(hobby);
    }

    @Given("his father's name is '$fatherName'")
    public void setFatherName(@Named("fatherName")String fatherName) {
        student.setFatherName(fatherName);
    }

    @Given("his mother's name is '$motherName'")
    public void setMotherName(@Named("motherName")String motherName) {
        student.setMotherName(motherName);
    }

    @Given("his brother's name is '$brotherName'")
    public void setBrotherName(@Named("brotherName")String brotherName) {
        student.setBrotherName(brotherName);
    }

    @When("system add the student into class")
    public void addStudentIntoClass(){
        classRoom = new ClassRoom();
        classRoom.addStudent(student);
    }

    @Then("we can get student '$studentName' from class")
    public void checkGetStudent(@Named("studentName")String studentName){
        assertThat(student, CoreMatchers.equalTo(classRoom.getStudent(studentName)));
    }
}
