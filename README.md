## SpringBootApplication

SpringBootApplication - аннотация, содержащая в себе три компонента:

@EnableAutoConfiguration - аннотация, включающая автоматическую конфигурацию Spring Boot
@ComponentScan - аннотация, сканирующая проект на наличие Spring компонентов @Component (@Controller, @Repository, @Service и т.д) в главном пакете и его классах
@Configuration - аннотация, которая позволяет регистрировать дополнительные бины в контексте или импортировать дополнительные конфигурационные классы


SpringBootApplication объединяет все вышеперечисленные компоненты, не является обязательной аннотацией для их работы. Поддерживается использование этих 3 аннотаций по отдельности

Однако в аннотацию SpringBootApplication можно передавать параметры:

@AliasFor(annotation=EnableAutoConfiguration.class,
          attribute="exclude")
public abstract Class<?>[] exclude - параметр, позволяющий исключить какой-либо класс или классы автоматической конфигурации Spring Boot

@AliasFor(annotation=EnableAutoConfiguration.class,
          attribute="excludeName")
public abstract String[] excludeName - параметр, похожий на exclude, однако вместо передачи туда сами сущности классов мы передаем их имена.

@AliasFor(annotation=org.springframework.context.annotation.ComponentScan.class,
          attribute="basePackages")
public abstract String[] scanBasePackages - позволяет передать пакеты для сканирования наличия аннотаций компонентов в классах пакета.

Когда впервые запускается проект Spring Boot то по умолчанию сканируется пакет, содержащий главный класс запуска проекта(application-class), тажке при конфигурации в нем ищутся классы, содержащие компоненты,
если нужно просканировать другой пакет на наличие компонентов, то параметр scanBasePackages позволяет нам это сделать.

@AliasFor(annotation=org.springframework.context.annotation.ComponentScan.class,
          attribute="basePackageClasses")
public abstract Class<?>[] scanBasePackageClasses - выполняет ту же функцию как и scanBasePackages, только вместо пакетов передаются классы, которые нужно просканировать.


