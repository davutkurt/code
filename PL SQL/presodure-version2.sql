SET SERVEROUTPUT ON;

DECLARE
    vs_first_name INTERN.first_name%TYPE;
    vs_university_name INTERN.university_name%TYPE;
BEGIN
    vs_first_name :='Davut';
    SELECT university_name INTO vs_university_name 
    FROM INTERN WHERE first_name = vs_first_name;
    DBMS_OUTPUT.PUT_LINE('university name is :'||vs_university_name);
END;
/



CREATE OR REPLACE PROCEDURE 
    find_university( 
    pis_first_name IN INTERN.first_name%TYPE,
    pos_university_name IN OUT INTERN.first_name%TYPE ) IS
BEGIN
    SELECT university_name INTO pos_university_name
    FROM INTERN WHERE first_name = pis_first_name;
END; 

DECLARE
    pis_first_name INTERN.first_name%TYPE;
    pos_university_name INTERN.university_name%TYPE;
BEGIN
    pis_first_name :='Davut';
    find_university(pis_first_name, pos_university_name);
    DBMS_OUTPUT.PUT_LINE('university name is :'||pos_university_name);
END;
/
