1、创建一个Spring项目，写好相关的dao、model、service（略）；

2、pom中添加JDBC、Spring-JDBC、MyBatis-Spring、MyBatis等依赖；

3、在XML中创建DataSource bean，并注入mybatis的sqlSessionFactory bean中；

4、编写model对应的mapper，写好对应的SQL方法

5、由于有MyBatis-Spring的支持，可以通过第三步中创建好的sqlSessionFactory，去创建sqlSession或者mapper；

6、在dao实现层引用sqlSession或者mapper进行对应的数据库操作

7、在服务层调用dao提供的方法实现对应业务逻辑

8、测试增删改查操作
