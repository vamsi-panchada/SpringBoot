-- CREATE DATABASE IF NOT EXISTS schooldb;
\c schooldb;

CREATE TABLE IF NOT EXISTS admin(
    admin_id int PRIMARY KEY,
    admin_name varchar NOT NULL unique,
    admin_email varchar NOT NULL unique,
    admin_contact varchar NOT NULL );

CREATE SEQUENCE IF NOT EXISTS admin_sequence start 111001 increment 1;
ALTER SEQUENCE admin_sequence OWNED BY admin.admin_id;

CREATE TABLE IF NOT EXISTS batch(
    batch_id int PRIMARY KEY ,
    batch_name varchar NOT NULL unique,
    class_id int NOT NULL ,
    session_id int NOT NULL ,
    CONSTRAINT FGN_KEY_Batch_1 FOREIGN KEY (class_id) REFERENCES class (class_id),
    CONSTRAINT FGN_KEY_Batch_2 FOREIGN KEY (session_id) REFERENCES session (session_id)
);

CREATE SEQUENCE IF NOT EXISTS batch_sequence start 112001 increment 1;
ALTER SEQUENCE batch_sequence OWNED BY batch.session_id;

CREATE SEQUENCE IF NOT EXISTS class_sequence start 113001 increment 1;
ALTER SEQUENCE class_sequence OWNED BY class.class_id;

CREATE SEQUENCE IF NOT EXISTS session_sequence start 114001 increment 1;
ALTER SEQUENCE session_sequence OWNED BY session.session_id;

CREATE SEQUENCE IF NOT EXISTS attednance_sequence start 115001 increment 1;
ALTER SEQUENCE attednance_sequence OWNED BY attednance.attednance_id;

CREATE SEQUENCE IF NOT EXISTS result_sequence start 116001 increment 1;
ALTER SEQUENCE result_sequence OWNED BY result.result_id;

CREATE SEQUENCE IF NOT EXISTS role_sequence start 117001 increment 1;
ALTER SEQUENCE role_sequence OWNED BY role.role_id;
ALTER TABLE role ADD CONSTRAINT unique_key_role_1 UNIQUE (role_name);

CREATE SEQUENCE IF NOT EXISTS semester_sequence start 118001 increment 1;
ALTER SEQUENCE semester_sequence OWNED BY semester.semester_id;

CREATE SEQUENCE IF NOT EXISTS result_sequence start 119001 increment 1;
ALTER SEQUENCE result_sequence OWNED BY result.result_id;

CREATE SEQUENCE IF NOT EXISTS student_sequence start 12001001 increment 1;
ALTER SEQUENCE student_sequence OWNED BY student.student_id;

CREATE SEQUENCE IF NOT EXISTS teacher_sequence start 121001 increment 1;
ALTER SEQUENCE teacher_sequence OWNED BY teacher.teacher_id;

CREATE SEQUENCE IF NOT EXISTS univ_user_sequence start 122001 increment 1;
ALTER SEQUENCE univ_user_sequence OWNED BY univ_user.user_id;

CREATE SEQUENCE IF NOT EXISTS subject_sequence start 123001 increment 1;
ALTER SEQUENCE subject_sequence OWNED BY subject.subject_id;

INSERT INTO role values(nextval('role_sequence'), 'ADMIN'),
                        (nextval('role_sequence'), 'TEACHER'),
                       (nextval('role_sequence'), 'STUDENT');

-- INSERT INTO session values(nextval('session_sequence'), '2017-2018'),
--                           (nextval('session_sequence'), '2018-2019'),
--                           (nextval('session_sequence'), '2019-2020'),
--                           (nextval('session_sequence'), '2020-2021'),
--                           (nextval('session_sequence'), '2021-2022');

ALTER TABLE attednance ADD CONSTRAINT FGN_KEY_addednance_1 FOREIGN KEY (student_id) REFERENCES student(student_id);

ALTER TABLE class ADD CONSTRAINT FGN_KEY_class_1 FOREIGN KEY (session_id) REFERENCES session(session_id);

ALTER TABLE result ADD CONSTRAINT FGN_KEY_result_1 FOREIGN KEY (student_id) REFERENCES student(student_id);
ALTER TABLE result ADD CONSTRAINT FGN_KEY_result_2 FOREIGN KEY (subject_id) REFERENCES subject(subject_id);
ALTER TABLE result ADD CONSTRAINT FGN_KEY_result_3 FOREIGN KEY (semester_id) REFERENCES semester(semester_id);

ALTER TABLE student ADD CONSTRAINT FGN_KEY_student_1 FOREIGN KEY (class_id) REFERENCES class(class_id);

ALTER TABLE univ_user ADD CONSTRAINT FGN_KEY_univ_role_1 FOREIGN KEY (user_role_id) REFERENCES role(role_id);

INSERT INTO admin values (nextval('admin_sequence'),
                          'vamsi panchada',
                          'vamsivs58@gmail.com',
                          '7997115484'),
                         (nextval('admin_sequence'),
                          'Deepti Gurgun',
                          'deepti.gurung@gladiris.com',
                          '944345323');

INSERT INTO univ_user(user_id,
                      user_name,
                      user_password,
                      user_role_id)
                       values(nextval('univ_user_sequence'),
                              '111001',
                              'vamsi_123',
                              117001);
INSERT INTO univ_user(user_id,
                      user_name,
                      user_password,
                      user_role_id)
values(nextval('univ_user_sequence'),
       '12001001',
       'student_123',
       117003);

INSERT INTO univ_user(user_id,
                      user_name,
                      user_password,
                      user_role_id)
values(nextval('univ_user_sequence'),
       '121001',
       'teacher_123',
       117002);