Meta:
@author liuxianning
@theme  examples

Narrative: In order to get a new student,as a teacher, I want to add a student into the Class

Scenario: Add a student into the class

Given There is a student
And his name is '$name'
And his age is '$age'
When system add the student into class
Then we can get student '$studentName' from class

Examples:
|name|age|studentName|
|lxn1|18 |lxn1       |
|lxn2|19 |lxn2       |
|lxn3|20 |lxn3       |
