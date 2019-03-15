# **基础异常组件**
> 使用方式（并未在中央仓库中存放，需要存放在私服）
```java
<dependency>
    <groupId>com.dodo.project.base.exception</groupId>
    <artifactId>dodo-project-base-exception</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
---
## **主要实现功能**
1. 主要基于**ResponseEntityExceptionHandler**进行全局的异常捕获。
2. 可以基于**ApplicationException**来拓展自己的异常类。
3. 响应枚举类：  
    
status | message 
------ | ---  
200    | 操作成功
500    | 操作失败
401    | 未授权

