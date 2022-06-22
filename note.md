Bean配置框架
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://www.springframework.org/schema/beans
https://www.springframework.org/schema/beans/spring-beans.xsd">
</beans>
```
注解说明
- @AutoWired：通过ByType的方式自动装配，
- @Resource：默认通过ByName的方式自动转配。
- @Nullable:字段标记了这个注解，说明这个字段可以为null
- @Component：组件，放在类上，说明这个类被Spring管理了，就是bean。

