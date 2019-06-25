DECLARE
vi_number INTEGER;
vi_count INTEGER;
BEGIN
    vi_number :=7;
    vi_count := vi_number-1; 
    DBMS_OUTPUT.PUT_LINE('');
    FOR i IN  1..vi_number
    LOOP
       FOR loop_counter IN 1..vi_count
       LOOP
       DBMS_OUTPUT.PUT(' ');
       END LOOP;
       vi_count := vi_count-1;
       FOR loop_counter IN 1..((i*2)-1)
       LOOP
       DBMS_OUTPUT.PUT('*');
       END LOOP;
       DBMS_OUTPUT.PUT_LINE('');
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('');
END;
