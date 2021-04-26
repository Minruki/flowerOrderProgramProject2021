-- 꽃
DROP SCHEMA IF EXISTS flowerOrderProgram;

-- 꽃
CREATE SCHEMA flowerOrderProgram;

-- 등급별 할인율
CREATE TABLE flowerOrderProgram.membership_discount (
	membership_title VARCHAR(10) NOT NULL COMMENT '멤버십 등급', -- 멤버십 등급
	discount_rate    VARCHAR(10) NOT NULL COMMENT '할인율' -- 할인율
)
COMMENT '등급별 할인율';

-- 등급별 할인율
ALTER TABLE flowerOrderProgram.membership_discount
	ADD CONSTRAINT PK_membership_discount -- 등급별 할인율 기본키
		PRIMARY KEY (
			membership_title -- 멤버십 등급
		);

-- 주문관리
CREATE TABLE flowerOrderProgram.order_program (
	ono          INT(11)     NOT NULL COMMENT '번호', -- 번호
	order_number VARCHAR(20) NOT NULL unique COMMENT '주문번호', -- 주문번호
	order_date   DATE        NOT NULL COMMENT '주문날짜', -- 주문날짜
	id           VARCHAR(50) NOT NULL COMMENT '회원ID', -- 회원ID
	flower_code  VARCHAR(50) NOT NULL COMMENT '꽃 코드', -- 꽃 코드
	order_count  INT(11)     NOT NULL COMMENT '주문수량', -- 주문수량
	choice       VARCHAR(20) NOT NULL COMMENT '구분', -- 구분
	sale_price   INT(11)     NOT NULL COMMENT '판매가' -- 판매가
)
COMMENT '주문관리';

-- 주문관리
ALTER TABLE flowerOrderProgram.order_program
	ADD CONSTRAINT PK_order_program -- 주문관리 기본키
		PRIMARY KEY (
			ono -- 번호
		);
	
	ALTER TABLE flowerOrderProgram.order_program
	MODIFY COLUMN ono INT(11) NOT NULL AUTO_INCREMENT COMMENT '번호';


-- 고객 정보
CREATE TABLE flowerOrderProgram.customer_information (
	id                VARCHAR(50) NOT NULL unique COMMENT '회원ID', -- 회원ID
	member_name       CHAR(20)    NOT NULL unique COMMENT '회원명', -- 회원명
	phone_number      CHAR(20)    NOT NULL unique COMMENT '연락처', -- 연락처
	cumulative_amount INT(11)     NOT NULL COMMENT '누적 금액', -- 누적 금액
	membership_title  VARCHAR(10) NOT NULL COMMENT '멤버십 등급' -- 멤버십 등급
)
COMMENT '고객 정보';

-- 고객 정보
ALTER TABLE flowerOrderProgram.customer_information
	ADD CONSTRAINT PK_customer_information -- 고객 정보 기본키
		PRIMARY KEY (
			id -- 회원ID
		);

-- 꽃 정보
CREATE TABLE flowerOrderProgram.flower_information (
	flower_code  VARCHAR(50) NOT NULL COMMENT '꽃 코드', -- 꽃 코드
	flower_name  VARCHAR(50) NOT NULL COMMENT '꽃 이름', -- 꽃 이름
	flower_price INT(11)     NOT NULL COMMENT '단가' -- 단가
)
COMMENT '꽃 정보';

-- 꽃 정보
ALTER TABLE flowerOrderProgram.flower_information
	ADD CONSTRAINT PK_flower_information -- 꽃 정보 기본키
		PRIMARY KEY (
			flower_code -- 꽃 코드
		);

-- 주문관리
ALTER TABLE flowerOrderProgram.order_program
	ADD CONSTRAINT FK_customer_information_TO_order_program -- 고객 정보 -> 주문관리
		FOREIGN KEY (
			id -- 회원ID
		)
		REFERENCES flowerOrderProgram.customer_information ( -- 고객 정보
			id -- 회원ID
		);

-- 주문관리
ALTER TABLE flowerOrderProgram.order_program
	ADD CONSTRAINT FK_flower_information_TO_order_program -- 꽃 정보 -> 주문관리
		FOREIGN KEY (
			flower_code -- 꽃 코드
		)
		REFERENCES flowerOrderProgram.flower_information ( -- 꽃 정보
			flower_code -- 꽃 코드
		);

-- 고객 정보
ALTER TABLE flowerOrderProgram.customer_information
	ADD CONSTRAINT FK_membership_discount_TO_customer_information -- 등급별 할인율 -> 고객 정보
		FOREIGN KEY (
			membership_title -- 멤버십 등급
		)
		REFERENCES flowerOrderProgram.membership_discount ( -- 등급별 할인율
			membership_title -- 멤버십 등급
		);

-- 계정 권한 부여
grant all 
   on flowerOrderProgram.* 
   to 'user_flower_manager'@'localhost' identified by 'rootroot';

-- file 권한(backup, load) -- root만 권한 부여 가능
GRANT File 
   ON *.* 
   TO 'user_flower_manager'@'localhost';