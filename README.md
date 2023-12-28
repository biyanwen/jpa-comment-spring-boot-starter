## This tool can add comments when creating a database table by the JPA auto-create function.

English | [中文](README_ZH.md)

### Why do this?

If you want to create a comment at creating a table, you can use the 'Column#columnDefinition' method when not using
this tool. For example:

~~~java
@Column(columnDefinition = "INT COMMENT '...'")
private int unitId;
~~~

But it will have some questions:

1. It is troublesome because you need to write a SQL fragment in the annotation.
2. It has high maintenance cost because the SQL is incompatible with different databases.

These questions will be solved by this tool.

### Merits of this tool:

1. Simple configuration.
2. Compatible different databases. Fully utilize the feature of the JPA, it can work on different databases by once
   write.

### Quickly start

#### Add maven address

~~~xml
<dependency>
    <groupId>com.github.biyanwen</groupId>
    <artifactId>jpa-comment-spring-boot-starter</artifactId>
    <version>1.0.2</version>
</dependency>
~~~

#### Add annotation

This tool uses the `@ApiModel` annotation of swagger. You should invoke the `ApiModel#description` method and let the
annotation on fields or get methods.

~~~java
@Entity
@Table(name = "USER")
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	@ApiModelProperty(value = "主键")
	private Integer id;
	@Column(name = "NAME", length = 255)
	@ApiModelProperty(value = "名字")
	private String name;
}
~~~

### Enable the config of the auto-create table that the JPA provides.

~~~properties
spring.jpa.hibernate.ddl-auto=update
~~~

### Result of the tool:

![img_2.png](img.png)

ps: It only has the effect when creating tables or fields.
