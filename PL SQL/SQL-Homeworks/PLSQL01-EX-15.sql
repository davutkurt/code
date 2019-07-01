CREATE PROCEDURE print_day(ps_date IN VARCHAR2) IS
    pod_date VARCHAR2(25);
BEGIN
    select TO_CHAR(TO_DATE(ps_date, 'DDMMYYYY'),'day')INTO pod_date from dual;
    DBMS_OUTPUT.PUT_LINE(pod_date);
END print_day;

DECLARE
BEGIN
    print_day('07012019');
END;
