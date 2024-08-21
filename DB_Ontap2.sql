create database DB_Ontap2
Go
use DB_Ontap2
Go

create table Customer(
	Id int primary key identity,
	Name nvarchar(50),
	Gender bit,
	Birthday date,
	Address nvarchar(200),
	Phone nvarchar(20) unique,
	Email nvarchar(100) unique
)

insert into Customer values(N'Trần Văn D', 0, '2000-05-25', N'Hà Nội', '0258741369', 'd@gmail.com')
insert into Customer values(N'Trần Văn A', 0, '2002-11-01', N'Long An', '0369852147', 'a@gmail.com')
insert into Customer values(N'Nguyễn Thái H', 1, '1999-07-02', N'Huế', '0321587964', 'h@gmail.com')

select * from Customer