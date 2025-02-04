create table section(
id number,
name varchar2(255),
salary number(10,2),
dept_id number,
department varchar2(255),
years number(4,2),
job varchar2(255)
)

update section  set job='经理' where dept_id=1;
update section  set job='员工' where dept_id=2 or dept_id=3;

--列出在每个部门工作的员工数量、平均工资和平均工作年限
select  dept_id,COUNT(job),job  from section group by dept_id,job having job!='经理';     -- 员工数量

select dept_id,AVG(salary)，job from section group by dept_id，job having job!='经理';       --平均工资

select dept_id,AVG(years)，job from section group by dept_id,job having job!='经理';    --平均工作年限

select dept_id,count(*),avg(salary),trunc(avg(month_between(sysdate,starttime))/12,1) from section group by dept_id;


--列出各个部门的经理的最低薪金（一个部门多个经理的情况）
select dept_id,MIN(salary) , job from section group by dept_id ,  job having job='经理';   


select  t.*, rowid from section t; 
