DECLARE
    is_name1 VARCHAR(25):='ERMAN İbriŞiM';
    vs_name1 VARCHAR(25);
    is_name2 VARCHAR(25):='MUstAFA Demir';
    vs_name2 VARCHAR(25);
BEGIN
    SELECT INITCAP(is_name1) INTO vs_name1 FROM DUAL;
    DBMS_OUTPUT.PUT_LINE('Name - Surname = '|| vs_name1);
    SELECT LOWER(is_name2) INTO vs_name2 FROM DUAL;
    DBMS_OUTPUT.PUT_LINE('Name - Surname = '|| vs_name2);

END;
