CREATE DATABASE sql_task4;

CREATE TABLE course(
        id SMALLINT NOT NULL AUTO_INCREMENT,
        course_title VARCHAR(30),
        PRIMARY KEY(id)
);

CREATE TABLE student(
    id SMALLINT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(20),
        last_name VARCHAR(20),
        id_groups int,
    PRIMARY KEY(id)
);

CREATE TABLE teacher(
    id SMALLINT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(20),
        last_name VARCHAR(20),
        email VARCHAR(40),
    PRIMARY KEY(id)
);

CREATE TABLE marks(
id INT AUTO_INCREMENT,
    student_id SMALLINT NOT NULL ,
    course_id SMALLINT NOT NULL,
    mark TINYINT,
    PRIMARY KEY(id)
);

CREATE TABLE groups(
    id SMALLINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(20),
    id_course SMALLINT,
    PRIMARY KEY(id)
);

CREATE TABLE help_table(
course_id SMALLINT NOT NULL AUTO_INCREMENT,
groups_id SMALLINT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id)
);

CREATE TABLE help_table_2(
teacher_id SMALLINT NOT NULL AUTO_INCREMENT,
course_id SMALLINT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id)
);
-- 1 задание

select first_name, last_name, email
from teacher 
INNER JOIN help_table_2 on teacher.id = help_table_2.teacher_id 
JOIN course ON course.id = help_table_2.course_id 
JOIN help_table ON  help_table.course_id = course.id 
JOIN group ON groups.id = help_table.groups_id 
JOIN student ON student.id_groups = groups.id
group by student_id
having count(student_id) > 2000;

-- 2 задание

select student_id
from student
INNER JOIN help_table_2 on teacher.id = help_table_2.teacher_id 
JOIN course ON course.id = help_table_2.course_id 
JOIN help_table ON  help_table.course_id = course.id 
JOIN group ON groups.id = help_table.groups_id 
JOIN student ON student.id_group = groups.id
JOIN marks ON student.id = marks.student_id
JOIN marks ON course.cource_id = marks.cource_id
where marks.course_title - 'Programming'
group by student_id
having avg(mark) > 4;

-- 3 задание

select count student_id
from student
INNER JOIN help_table_2 on teacher.id = help_table_2.teacher_id 
JOIN course ON course.id = help_table_2.course_id 
JOIN help_table ON  help_table.course_id = course.id 
JOIN group ON groups.id = help_table.groups_id 
JOIN student ON student.id_group = groups.id
JOIN marks ON student.id = marks.student_id
JOIN marks ON course.cource_id = marks.cource_id
where marks.mark = 5;
--union 
select group_id, count student_id
from student
INNER JOIN help_table_2 on teacher.id = help_table_2.teacher_id 
JOIN course ON course.id = help_table_2.course_id 
JOIN help_table ON  help_table.course_id = course.id 
JOIN group ON groups.id = help_table.groups_id 
JOIN student ON student.id_group = groups.id
JOIN marks ON student.id = marks.student_id
JOIN marks ON course.cource_id = marks.cource_id;