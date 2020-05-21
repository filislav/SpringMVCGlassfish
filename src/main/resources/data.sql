INSERT INTO sr_univercity (university_name) values ('University One');
INSERT INTO sr_faculty(university_id,faculty_name) values (1,'Faculty One');
INSERT INTO sr_student(last_name,first_name,middle_name,date_of_birth,paasport_seria
,passport_number,passport_date) values('fil','slava','vic','2000-4-12','1111','222222','2016-5-09');
INSERT INTO sr_student_document (document_number,document_date,expired_date,student_id,faculty_id,student_form) 
values('123','2018-12-12','2018-12-12',1,1,0);
