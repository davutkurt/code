DECLARE
    vs_name VARCHAR(50);
    os_name VARCHAR(50);
BEGIN
    vs_name :='Davut#1997';
    SELECT SUBSTR(vs_name, 0, INSTR(vs_name, '#')-1) INTO os_name FROM DUAL;
    DBMS_OUTPUT.PUT_LINE('Name is :'||os_name);
END;
