CREATE OR REPLACE PACKAGE GET_ALL_EMPLOYEES_NAME IS
    PROCEDURE print_all_employees_name;
END GET_ALL_EMPLOYEES_NAME;


CREATE OR REPLACE PACKAGE BODY GET_ALL_EMPLOYEES_NAME IS
    PROCEDURE print_all_employees_name IS
        CURSOR cursor_employees_name 
        IS SELECT first_name from hr.employees;
        pos_employee_name VARCHAR(50);
    BEGIN
       OPEN cursor_employees_name;
    LOOP
        FETCH cursor_employees_name 
        INTO pos_employee_name;
        DBMS_OUTPUT.PUT_LINE(pos_employee_name);
            IF cursor_employees_name%NOTFOUND THEN
            EXIT;
        END IF;    
    END LOOP;
    CLOSE cursor_employees_name;
    END;
BEGIN
    DBMS_OUTPUT.PUT_LINE('GET_EMPLOYEES_ALL_NAME');
END GET_ALL_EMPLOYEES_NAME;



SET SERVEROUTPU ON;
DECLARE
BEGIN
    GET_ALL_EMPLOYEES_NAME.print_all_employees_name;
END;
