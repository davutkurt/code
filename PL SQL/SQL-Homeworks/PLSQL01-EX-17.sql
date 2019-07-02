CREATE OR REPLACE PACKAGE STAJ_UTILITY IS 
    PROCEDURE print_day(pd_date IN VARCHAR2);
    FUNCTION FUNCTION_FIND_DAY(pd_date VARCHAR2 ) RETURN VARCHAR2;
END STAJ_UTILITY;

CREATE OR REPLACE PACKAGE BODY STAJ_UTILITY IS
    PROCEDURE print_day(pd_date IN VARCHAR2)
    IS
        ps_day_name VARCHAR(20);
    BEGIN
        ps_day_name := FUNCTION_FIND_DAY(pd_date);
        DBMS_OUTPUT.PUT_LINE(ps_day_name);
    END;

    FUNCTION FUNCTION_FIND_DAY(PD_DATE VARCHAR2 ) RETURN VARCHAR2 AS
        pd_out_date VARCHAR2(40);
    BEGIN
        SELECT TO_CHAR(TO_DATE(pd_date, 'DDMMYYYY'),'day')INTO pd_out_date from dual;
        RETURN pd_out_date;
    END FUNCTION_FIND_DAY;

BEGIN
    dbms_output.put_line('STAJ_UTILITY');
END STAJ_UTILITY;


DECLARE
    vd_day varchar2(40);
BEGIN
    vd_day:=staj_utılıty.functıon_fınd_day('01072019');
    dbms_output.put_line(vd_day);
END;
