/*
student 테이블에서 insert 이벤트가 발생하면 추가된 student_num의 정보를 이용하여 
graduation 테이블에 insert를 한다.
*/
use university;
drop trigger if exists insert_student;
delimiter //
create trigger insert_student 
	after insert on student
for each row
begin
	declare r_num int;
    declare r_year int;
    /* 졸업 요건 정보는 입학년도와 전공을 통해 결정된다는 전제조건 */
    set r_year = new.student_num / 1000000; -- 졸업 연도 계산
    if new.student_major is not null then
		set r_num = (select requirement_num from requirement where
        new.student_major = requirement_major and requirement_entrance_year = r_year);
    end if;
    
	insert graduation(graduation_student_num,graduation_requirement_num)
    values(new.student_num, r_num);
    
end //
delimiter ;

