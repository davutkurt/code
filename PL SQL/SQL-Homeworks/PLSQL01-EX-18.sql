CREATE OR REPLACE PACKAGE GET_EMPLOYEES_NAME IS
    PROCEDURE get_employee_name_presodure(pin_employee_id IN NUMBER);
END GET_EMPLOYEES_NAME;

CREATE OR REPLACE PACKAGE BODY GET_EMPLOYEES_NAME IS
    PROCEDURE get_employee_name_presodure(pin_employee_id IN NUMBER) IS
        pos_employee_name VARCHAR(20);
    BEGIN
        SELECT FIRST_NAME INTO pos_employee_name FROM HR.EMPLOYEES WHERE EMPLOYEE_ID = pi_employee_id;
        DBMS_OUTPUT.PUT_LINE(pos_employee_name);
    END;

BEGIN
    DBMS_OUTPUT.PUT_LINE('GET_EMPLOYEES_NAME');
END GET_EMPLOYEES_NAME;


DECLARE
BEGIN
    get_employees_name.get_employee_name_presodure(100);
END;
