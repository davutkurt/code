DECLARE
    CURSOR cursor_full_name 
    IS SELECT first_name, last_name
    FROM HR.EMPLOYEES;
    vs_first_name HR.EMPLOYEES.first_name % TYPE;
    vs_last_name HR.EMPLOYEES.last_name % TYPE;
BEGIN
    OPEN cursor_full_name;
    LOOP
        FETCH cursor_full_name 
        INTO vs_first_name,vs_last_name;
        IF cursor_full_name%NOTFOUND THEN
        EXIT;
        END IF;
        Dbms_output.put_line('First Name - Last Name = '||vs_first_name||' '||vs_last_name);
    END LOOP;
    CLOSE cursor_full_name;
END;
