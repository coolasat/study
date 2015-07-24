Meta:
@author liuxianning
@theme  student

Narrative: In order to get a new student,as a teacher, I want to add a student into the Class

Scenario: Add a student into the class

Given There is a student with default details
When system add the student into class
Then we can get student 'Lincoln2' from class