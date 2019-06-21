SET SERVEROUTPUT ON;
BEGIN
    FOR loop_counter IN 1..20 LOOP
        IF (mod(loop_counter,2)=0) THEN
        DBMS_OUTPUT.PUT_LINE(loop_counter);
        END IF;
    END LOOP;
END;

