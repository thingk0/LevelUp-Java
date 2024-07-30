# LevelUp-Java

![레벨업_로고](etc/레벨업_자바_로고.png)

_2024.07.28_

`LevelUp-Java` 프로젝트에 오신 것을 환영합니다! 이 프로젝트는 자바의 기초부터 스프링 프레임워크에 필요한 다양한 심화적인 자바 개념들을 학습하고 직접 프로그래밍 해보는 튜토리얼입니다.

## 소개

이 프로젝트는 자바를 처음 배우는 초보자부터 스프링 프레임워크를 사용하려는 개발자들까지 모두를 위한 자바 학습 자료를 제공합니다. 각 레슨은 자바의 기본 개념을 이해하고, 실습을 통해 자바 언어를 익힐 수 있도록 기획되었습니다.

## 목차

1. [변수 및 상수](src/main/java/com/levelup/java/_01_variables_constants/README.md)
2. [클래스와 메서드](src/main/java/com/levelup/java/_02_class_method/README.md)
3. [접근 제어자](src/main/java/com/levelup/java/_03_access_modifiers/README.md)
4. [static 과 non-static](src/main/java/com/levelup/java/_04_static/README.md)
5. [조건문](src/main/java/com/levelup/java/_05_conditional_statements/README.md)
6. [반복문](src/main/java/com/levelup/java/_06_loops_statements/README.md)
7. [분기문](src/main/java/com/levelup/java/_07_branching_statements/_06_loops_statements/README.md)
8. [클래스와 인스턴스 EXTRA](src/main/java/com/levelup/java/_08_class_and_instance/README.md)
9. [메서드 EXTRA](src/main/java/com/levelup/java/_09_methods/README.md)
10. [상속, 인터페이스, 추상 클래스](src/main/java/com/levelup/java/_10_inheritance/README.md)
11. [예외처리](src/main/java/com/levelup/java/_11_exception_handling/README.md)
12. [자료구조](src/main/java/com/levelup/java/_12_data_structures/README.md)
13. [Collections(List, Set, Map)](src/main/java/com/levelup/java/_13_collections/README.md)

## 설치

이 프로젝트를 시작하려면 다음 도구들이 필요합니다:

- Java Development Kit (JDK) 8
- Gradle (설치 필요 없음, Gradle wrapper 8.5 사용)
- 최신 버전의 IntelliJ IDEA

1. **JDK 8 설치**:

    - **Apple Silicon 또는 ARM 프로세서 사용 시**: Amazon Corretto JDK 8 aarch64 버전을 사용하세요.
        - [Amazon Corretto 8 다운로드](https://docs.aws.amazon.com/corretto/latest/corretto-8-ug/downloads-list.html)

    - **Intel 프로세서 사용 시**: Amazon Corretto JDK 8을 권장합니다.
        - [Amazon Corretto 8 다운로드](https://docs.aws.amazon.com/corretto/latest/corretto-8-ug/downloads-list.html)

2. **Gradle 설치**: Gradle 설치는 필요하지 않습니다. 프로젝트에 포함된 Gradle wrapper를 사용하세요.

3. **리포지토리 클론**:
   ```bash
   git clone https://github.com/yourusername/LevelUp-Java.git
   cd LevelUp-Java

## 개발 환경
본 리포지토리는 MacOS 환경에서 개발되었으며, 최신 버전의 IntelliJ IDEA를 사용합니다. 다른 운영체제나 기타 다른 환경과의 사소한 차이가 있을 수 있지만, 가능한 무리가 없도록 구성하였습니다.

### 기본 프로젝트 구조
```
.
├── README.md
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   └── resources
    └── test
        ├── java
        └── resources
```

