DECLARE
    vn_id            HR.EMPLOYEES.EMPLOYEE_ID%TYPE;
    vs_name          HR.EMPLOYEES.FIRST_NAME%TYPE;
    vs_surname       HR.EMPLOYEES.LAST_NAME%TYPE;
    vs_dep_name      HR.DEPARTMENTS.DEPARTMENT_NAME%TYPE;
    
    CURSOR c_employees IS 
   
    SELECT e.EMPLOYEE_ID, e.FIRST_NAME, e.LAST_NAME, d.DEPARTMENT_NAME 
    FROM HR.EMPLOYEES e 
    INNER JOIN HR.DEPARTMENTS d 
    ON (e.DEPARTMENT_ID= d.DEPARTMENT_ID); 

    vInFileTxt UTL_FILE.FILE_TYPE;
BEGIN
    vInFileTxt := UTL_FILE.FOPEN('DRI', 'employees_information.txt', 'W');
    OPEN c_employees;
    LOOP
    FETCH c_employees INTO  vn_id, vs_name, vs_surname, vs_dep_name; 
    EXIT WHEN c_employees%notfound; 
    UTL_FILE.PUTF(vInFileTxt, 'ID-> ' || vn_id || '\n' || ' Name-> ' || vs_name || '\n' || ' Surname-> ' || vs_surname || '\n' || ' department-> ' || vs_dep_name || '\n\n\n');
    END LOOP;
    CLOSE c_employees;
    UTL_FILE.FCLOSE(vInFileTxt);
EXCEPTION
   WHEN OTHERS THEN
     dbms_output.put_line('Error:' || sqlerrm);
END;
