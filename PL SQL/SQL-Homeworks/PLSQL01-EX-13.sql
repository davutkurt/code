DECLARE
  vs_name HR.EMPLOYEES.FIRST_NAME%TYPE;
  vn_salary HR.EMPLOYEES.SALARY%TYPE;
  vn_dollar number := 5.79;
  vInFileTxt utl_file.file_type;
BEGIN
    SELECT FIRST_NAME, SALARY 
    INTO vs_name,vn_salary FROM HR.EMPLOYEES 
    WHERE SALARY = (SELECT MAX(SALARY) FROM HR.EMPLOYEES);
        
  vInFileTxt:= UTL_FILE.FOPEN('DRI', 'employee_information.txt', 'W');
  UTL_FILE.PUTF(vInFileTxt, 'Name of the richest employee-> ' || vs_name || '\n');
  UTL_FILE.PUTF(vInFileTxt, 'Salary in TL-> ' || vn_salary || '\n');
  UTL_FILE.PUTF(vInFileTxt, 'Salary in dollars-> ' || vn_salary/vn_dollar || '\n');
  UTL_FILE.FCLOSE(vInFileTxt);
EXCEPTION
  WHEN OTHERS THEN
     dbms_output.put_line('Error:' || sqlerrm);
END;
