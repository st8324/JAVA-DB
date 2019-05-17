DROP TRIGGER IF EXISTS delete_course; 
DELIMITER // 
CREATE TRIGGER delete_course AFTER delete ON course 
FOR EACH ROW 
BEGIN 
	if old.giveup_state = 'N' then
		update 
			class
        set
			total = total-1
		where old.class_no = no;
    end if;
END// 
DELIMITER ;

