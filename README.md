# Презентация
Web приложение каталог книг. 
- Главная страница
- Авторы
- Книги
- Страница добавления книги в бд.

На главной странице отображаются последние 10 добавленных книг.
На странице авторы - список авторов по алфавиту, при нажатии на автора выдается список книг данного автора.
На странице книг - список книг по алфавиту, предусмотрен поиск по книге. При нажатии на книгу открывается страница с информацией о книге (название, автор. При нажатии на автора реализован переход на страницу данного автора).

Технологии: java, Spring, flyway, hibernate, maven, postgres. Фронтенд Thymeleaf.

## Главная страница (вывод 10 последних добавленных)
![img](Screenshots/Главная%20страница.bmp)
## Страница Авторы
![img](Screenshots/авторы.bmp)
## Переход по автору
![img](Screenshots/Переход%20по%20автору.bmp)
## Страница с книгами (по алафвиту)
![img](Screenshots/Список%20книг.bmp)
## Переход на страницу книги
![img](Screenshots/Переход%20по%20книге.bmp)
## Страница добавления книги
![img](Screenshots/Страница%20добавления%20книги.bmp)



# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.3.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.3.2/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#web)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#web.servlet.spring-mvc.template-engines)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#using.devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

