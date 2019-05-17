use green; DROP TRIGGER IF EXISTS input_course; 
DELIMITER // 
CREATE TRIGGER input_course AFTER INSERT ON course 
FOR EACH ROW 
BEGIN 
	declare _total int default 0; 
    set _total = (select count(*) from course where new.class_no = class_no); 
    update 
		class 
	set 
		total = _total 
    where 
		no = new.class_no and giveup_state ='N'; 
END// 
DELIMITER ;

