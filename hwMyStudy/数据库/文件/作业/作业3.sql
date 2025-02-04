create table zuoye(
id varchar2(255),
name varchar2(255),
salary number(8,2),
dept_id number,
job varchar2(255)
)

--1.列出薪金比' 流六’'多的所有员工（子查询）
select * from zuoye where name='流六';
select * from zuoye where salary>(select  salary  from zuoye where name = '流六');


--2. 列出部门名称和这些部门的员工,同时列出那些没有员工的部门 ( 右连接 )
Select zuoye.job From zuoye,dept  
where zuoye.job(+)=dept.name;


--3.求部门销售部员工的工资总和、部门人数(   等价连接)
select  sum(salary),count(job)  from zuoye z,dept d
 where d.name  like '%销售%' 
 and d.name =z.job ;



select t.*,rowid from zuoye t;
select t.*,rowid from dept t;
