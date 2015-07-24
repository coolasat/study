package konny.study.java.jbehave;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author: konnyjinx
 * Date:15/7/23.下午2:43
 */
public class ClassRoom {
    Map<String,Student> studentMap=new ConcurrentHashMap<String,Student>();
    public void addStudent(Student student) {
        studentMap.put(student.getName(),student);
    }

    public Student getStudent(String studentName) {
        return studentMap.get(studentName);
    }

    public void studentUpdateName(Student student, String studentNewName) {
        String oldName=student.getName();
        studentMap.remove(oldName);

        student.setName(studentNewName);
        studentMap.put(studentNewName,student);

    }
}
