# 家庭作业

本作业有以下几个要求：

- 创建一个学生类(Student)，有姓名，学号和入学日期三个属性
- 学生类的构造方法中，接受的日期格式为 `2019.02.11`
- 由于学生的学号唯一，所以判断两个学生是否为同一个人，只需要学号相等即可
- 用 `System.out.println` 直接打印学生对象时显示如 `我叫张三，我的学号是001，2019年2月11日入学，学龄1年`
- 创建一个教师类(Teacher)，有姓名和学生名单两个属性
- 教师类有一个查重方法，返回重复学生的名单
- 在 App 类中创建教师张龙，管理三个学生：(张三，001，2019.02.11)，(李四，002，2019.02.10)，(王五，001，2019.02.09), 然后张龙对学生进行查重后打印重复学生的信息