--Insert some values into topic
insert into topic(id,description, name) values('Java', 'Learn Java', 'The Complete Java Course');
insert into topic(id,description, name) values('C', 'Learn C', 'The Complete C Course');
insert into topic(id,description, name) values('C++', 'Learn C++', 'The Complete C++ Course');

--Insert some values into course
insert into course(id, description, name, topic_id) values ('pointers', 'Learn Pointers in C', 'Learn Pointers', 'C');
insert into course(id, description, name, topic_id) values ('vectors', 'Learn Vectors in C++', 'Learn Vectors', 'C++');
insert into course(id, description, name, topic_id) values ('arrays', 'Learn Arrays in Java', 'Learn Arrays', 'Java');
