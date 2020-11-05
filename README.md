# 스프링 입문

## 인프런 강의

스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술

https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%EC%9E%85%EB%AC%B8-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8

## 환경 구성

+ JDK 11 설치
+ Maven 3.6 설치
+ VS Code 설치
+ VS Code Extension 설치
  + Java Extension Pack (by Microsoft)
  + Spring Boot Extension Pack (by Pivotal)
+ vscode 에서 ctrl+shift+p 눌러서 `Spring Initializr: Create a Gradle Project...` 선택
+ 안정화 최신 버전 선택(2.3.5), Java 선택, Group Id 입력, 아티팩트 Id 입력, JAR 선택, 11버전 선택, 의존성에 `Spring Boot DevTools`, `Spring Web`, `Thymeleaf` 선택하고 저장할 경로 선택

## 첫 페이지 작성

+ src/main/resources/static/index.html 생성
+ 내용 작성하면 스프링이 이걸 루트 접속 시 응답할 때 사용한다고 함 (이름이 index.html 이여야 함)

## 첫 템플릿 페이지 작성

+ Thymeleaf는 템플릿 엔진 (ASP.NET의 Razor 같은 거)
+ HelloController.java 를 만들어서 내용을 넣고, 리턴하는 이름 "hello" 와 똑같은 이름의 파일을 templates 폴더 아래에 생성 `src/main/resources/templates/hello.html`

## 기본 구조 생성

+ Domain: 데이터만 담고있는 클래스
+ Controller: 웹 컨트롤러
+ Repository: 데이터 저장소 구현
+ Service: 컨트롤러에서 호출하면 리포지토리 호출하거나 해서 로직 넣어서 서비스 수행

## 테스트 코드 작성

+ 테스트 코드는 꼭꼭 있어야 한다. 그래야 나중에 후회하지 않음
+ 직접 데이터 입력하고 테스트 진행
+ java는 람다 함수 화살표가 `->` 이거구나.. js c# 다 `=>` 쓰는데..

## 의존성 주입

+ Spring 자동 의존성 주입은 클래스에 @Cont듬oller, @Service, @Repository, @Component 와 같은 어노테이션을 주고, 생성자 함수에 @Autowired 어노테이션을 주면 자동으로 의존성 주입을 해 줌.
+ 자동으로 하지 않으려면 @SpringConfiguration 어노테이션으로 클래스를 만들면, 이 클래스는 설정을 할 수 있는 것으로 보인다. (이름을 SpringConfig.java 로 만듬)
+ @Bean 어노테이션 써서 의존성 주입을 할 수 있다.
+ spring에서는 대부분의 객체를 싱글톤으로 만든다고 한다.
