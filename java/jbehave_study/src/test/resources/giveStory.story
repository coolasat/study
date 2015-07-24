Meta:
@author liuxianning
@theme  givenstories

Narrative: In order to maintian student's info,as a teacher, I want to update a student's name
Scenario: Add a student into the class
GivenStories: addLincolnToClass.story

Given Get student 'Lincoln'
When system Update student name to 'Lin'
Then we can get student 'Lin' from class