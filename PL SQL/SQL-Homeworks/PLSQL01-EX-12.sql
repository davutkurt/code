CREATE OR REPLACE PROCEDURE convert_liras_to_dollar(  pii_amount_tl IN INT, 
                                                      pii_dollar_currency IN INT, 
                                                      pof_amount_dollar OUT FLOAT)
AS
BEGIN
    pof_amount_dollar := pii_amount_tl/pii_dollar_currency;
END;

CREATE OR REPLACE PROCEDURE who_is_richest(  pon_id OUT HR.EMPLOYEES.employee_id % TYPE,
                                             pos_employee_name OUT HR.EMPLOYEES.first_name % TYPE,
                                             pon_emp_salary OUT HR.EMPLOYEES.salary % TYPE)
AS
    pof_amount_dollar float;
BEGIN
    SELECT employee_id, first_name, salary
    INTO pon_id, pos_employee_name, pon_emp_salary
    FROM ( select e.*, ROW_NUMBER() OVER (ORDER BY SALARY desc) AS ROW_NUM FROM HR.EMPLOYEES e ) 
    WHERE ROW_NUM = 1;

    convert_liras_to_dollar(pon_emp_salary, 5, pof_amount_dollar);
    
    DBMS_OUTPUT.PUT_LINE('Name of Richest Employee in company -> ' || pos_employee_name);
    DBMS_OUTPUT.PUT_LINE('Salary of Richest Employee in company as TL -> ' || pon_emp_salary);
    DBMS_OUTPUT.PUT_LINE('Name of Richest Employee in company as Dollar -> ' || pof_amount_dollar);
END;
/
SET SERVEROUT ON;
DECLARE
    vn_id HR.EMPLOYEES.employee_id % TYPE;
    vs_first_name HR.EMPLOYEES.first_name % TYPE;
    vn_salary HR.EMPLOYEES.salary % TYPE;
BEGIN
     who_is_richest(vn_id, vs_first_name, vn_salary);
END;
