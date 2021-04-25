 insert 
   into membership_discount
 values ('소나무', '30%'),
 		('꽃', '20%'),
 		('꽃봉오리', '10%'),
 		('새싹', '5%');
 	
insert
  into customer_information
values ('lys6009', '이용수', '010-1234-5678', 1000000, '소나무'),
       ('yjw6101', '염정원', '010-4321-5678', 750000 ,'꽃' ),
       ('Minruki', '이민정', '010-4321-8765', 115000, '꽃봉오리'),
   	   ('lee.daeung', '이대응', '010-5678-1234',10000, '새싹');
 
 	
insert 
  into flower_information 
values ('A001','장미', 9000),
	   ('A002','라넌큘러스',10000),
	   ('A003','백합',7000),
	   ('A004','튤립',5000),
	   ('A005','해바라기', 6000),
	   ('A006','피오니',10000),
	   ('A007','프리지아', 13000),
	   ('A008','카네이션',8000),
	   ('A009','안개꽃', 15000);
	  

insert
  into order_program 
values (default, '0001', now(), 'min', 'A002', 1, '꽃바구니', 0);
	
insert
  into order_program 
values (default, '0002', now(),'lys6009', 'A001', 1, '꽃다발', 0);

insert
  into order_program 
values (default, '0002', now() ,'lys6009', 'A001', 1, '꽃다발', null);

insert
  into order_program 
values (default, '0001', now() ,'Minruki', 'A001', 1, '꽃다발', 0);

insert
  into order_program 
values (default, '0001', now() ,'yjw6101', 'A001', 1, '꽃다발', 0);

update order_program set order_number = '0003', order_date = now(), flower_code = 'A001', order_count = 5, choice = '꽃다발', sale_price = 0 where id = 'yjw6101';




select * from membership_discount;  	  
select * from customer_information;
select * from flower_information;
select * from order_program;

select * from order_program where ono = 28;

-- view 생성
create view vm_flower as
select ono, order_number, order_date, op.id as id, order_count, choice,
 sale_price, member_name, phone_number, cumulative_amount, ci.membership_title as membership, discount_rate, fi.flower_code as flower_code, flower_name, flower_price
  from order_program op 
  	join customer_information ci on op.id= ci.id
  	join membership_discount md on ci.membership_title = md.membership_title 
  	join flower_information fi on op.flower_code = fi.flower_code;

select * from vm_flower vf ;
--
select id, member_name, phone_number from customer_information cus where id = 'lee.daeung';


-- update test


-- insert test
select * from flower_information;
select id,member_name,phone_number,cumulative_amount,membership_title from customer_information ci ;
DELETE FROM flower_information
where flower_code ='A011';
-- 
delete from order_program where ono = 28;

select ono, order_number, order_date, op.id as id, order_count, choice,
 sale_price, member_name, phone_number, cumulative_amount, ci.membership_title as membership, discount_rate, fi.flower_code as flower_code, flower_name, flower_price
  from order_program op 
  	join customer_information ci on op.id= ci.id
  	join membership_discount md on ci.membership_title = md.membership_title 
  	join flower_information fi on op.flower_code = fi.flower_code;
  
  
 select flower_code,flower_price, flower_name from flower_information where flower_code = 'A001';

update flower_information set flower_name = '히아신스', flower_price = 10000 where flower_code = 'A011';

update customer_information set cumulative_amount = cumulative_amount + 3000 where id = 'lys6009'; 

select id,member_name,phone_number,cumulative_amount,membership_title from customer_information;

-- 회원 정보 수정
update customer_information set member_name = ?,phone_number =?,membership_title =? where id = ?; 