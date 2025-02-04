select sysdate from dual;
select user from dual;



create table t_user(
id number(11) primary key,                                                                                 --用户编号
username varchar2(40)  not null   unique,                                                        --用户名
password  varchar2(20)  not null,                                                                       --密码
sex number(1)    default 0  check(sex=0 or sex=1) ,                                       --性别
id_number varchar2(18) unique,                                                                         --身份证号
tel varchar2(11),                                                                                                      --电话
addr varchar2(100),                                                                                                --地址
type number(1)  default 0  check(type=0 or type=1)                                                                                                                --账户类型
)

