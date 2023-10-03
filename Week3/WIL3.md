# Spring Bean


## Spring이란?

1. Spring의 정의
   
    - 자바 엔터프라이즈 개발을 편하게 해주는 오픈소스 경량급 애플리케이션 프레임워크
    - 스프링의 정수는 엔터프라이즈 서비스 기능을 POJO에 제공하는 것

2. Spring의 특징

    - Spring은 경량 컨테이너로 자바 객체를 직접 Spring 내에서 관리함
    - 제어의 역전 (IOC, Inversion Of Control)
    - 의존성 주입 (DL, Dependencyy Injection)


## Spring bean이란?

1. Spring Bean

    - 스프링 IOC 컨테이너에 의해 관리되는 자바 객체
    - Spring Bean을 통해 의존성 문제를 더 쉽게 해결할 수 있도록 해줌

2. 스프링 IOC 컨테이너
   
   - Bean을 관리하는 객체
   - ApplicationContext라는 IOC 컨테이너를 대표하는 인터페이스가 존재함
   - ApplicationContext를 통해 Bean에 대한 조회 등 다양한 작업을 할 수 있음

3. 빈 스코프

    - 빈이 생성되고 존재하고 적용되는 범위
    - 싱글톤 스코프
      - 기본 스코프
      - 스프링 컨테이너의 시작부터 종료까지 유지되는 가장 넓은 범위의 스코프
    - 프로토타입 스코프
      - 프로토타입 빈의 생성과 의존관계 주입까지만 관리하는 매우 짧은 범위의 스코프
    - 웹 관련 스코프
      - request : 웹 요청이 들어오고 나갈 때 까지 유지되는 스코프
      - session : 웹 세션이 생성되고 종료될 때까지 유지되는 스코프
      - application : 웹의 서블릭 컨텍스트와 같은 범위로 유지되는 스코프
    - 빈의 스코프는 @Scope 어노테이션을 통해 지정할 수 있음
      - @Scope("prototype")
        @Component
        public class Prototype {
	        ...
        }

4. 스프링 IOC 컨테이너가 빈을 관리하는 과정

    1. 객체 생성 + property 설정
    2. 의존 설정
    3. 객체 초기화 -> 사용 -> 소멸


## Spring Bean 등록 방법

- @Bean 어노테이션 방법

    - ApplicationContext의 구현체인 AnnotationConfigApplicationContext 에 파라미터로 넘긴 값은 스프링 빈으로 등록됨
    - 빈을 싱글톤으로 생성하기 위해서는 @Configuration 어노테이션을 사용한 객체를 ApplicationContext의 파라미터로 넘기면 됨

- 빈 설정 시 주의점

    1. 싱글톤 스코프의 빈이 상태를 가지면 안됨
    2. 의존성을 자동 주입해야할 인터페이스의 구현체가 두 개 이상일 경우 -> 어노테이션을 사용하여 의존성 주입 시 우선순위를 정해야 함

- Component Scan 방법

    - Component Scan
      - 스프링이 애플리케이션의 클래스를 검색하고 자동으로 스프링 빈을 등록하는 방법
      - @CompocnentScan, @Component 어노테이션을 이용

    - @Component
      - 스프링 빈으로 등록하려는 클래스에 붙일 수 있는 어노테이션
      - 스프링은 @Component가 붙은 클래스를 자동으로 검색하고 빈으로 등록함

    - @ComponentScan
      - 스프링이 어느 패키지에서 클래스 검색을 시작할지 및 검색할 패키지의 범위를 설정할 수 있게 해 주는 어노테이션
      - 기본적으로 @ComponentScan이 붙은 설정 정보 클래스가 검색 시작 위치가 됨
      - ComponentScan을 통해 등록된 빈은 기본적으로 싱글톤으로 관리됨