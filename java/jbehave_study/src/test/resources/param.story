Meta:
@author liuxianning
@theme  table

Narrative: In order to get a new student,as a teacher, I want to add a student into the Class

Scenario: Add a student into the class

Given There is a student  with details:
|name    |age |hobby      |father name |mother name |brother name|
|lincoln3|18  |basketball |Mike        |Mary        |Luis        |

When system add the student into class
Then we can get student 'lincoln3' from class