SET SERVEROUTPUT ON;
DECLARE
  intern_name VARCHAR(50):='Davut';
  BEGIN
      SELECT university_name INTO intern_name FROM intern WHERE first_name = intern_name;
      DBMS_OUTPUT.PUT_LINE(intern_name);
END;



SET SERVEROUTPUT ON;
DECLARE
  temp VARCHAR(50);
  intern_name VARCHAR(50):='Davut';
    PROCEDURE find_university(intern_name IN OUT VARCHAR) IS
    BEGIN
      SELECT university_name INTO temp FROM intern WHERE first_name = intern_name;
      DBMS_OUTPUT.PUT_LINE(temp);
    END; 
BEGIN
  find_university(intern_name);
END;
