# Access Modifiers - Example

Java에서 접근 제어자의 사용을 보여주는 간단한 예제입니다.

---
### 개요
이 프로그램은 Java의 네 가지 접근 제어자(public, private, protected, default)의 사용과 그 효과를 시연합니다. 다음과 같은 개념을 다룹니다:

- public, private, protected, default(package-private) 접근 제어자
- 클래스 내부, 동일 패키지, 다른 패키지에서의 접근성

### 주요 기능

1. 다양한 접근 제어자를 사용하여 변수와 메서드를 정의합니다.
2. 같은 클래스, 같은 패키지의 다른 클래스, 다른 패키지의 클래스에서 접근을 시도합니다.
3. 각 접근 제어자의 범위와 제한을 보여줍니다.

### 클래스 구조

- `Main`: 주요 예제 클래스
  - 변수: publicVar, privateVar, protectedVar, defaultVar
  - 메서드: publicMethod, privateMethod, protectedMethod, defaultMethod, accessTest
- `SamePackageClass`: 같은 패키지의 다른 클래스를 시뮬레이션
- `OtherPackageClass`: 다른 패키지의 클래스를 시뮬레이션 (실제로는 다른 패키지에 있어야 함)

### 접근 제어자 요약

- `public`: 어디서나 접근 가능
- `private`: 같은 클래스 내에서만 접근 가능
- `protected`: 같은 패키지 및 하위 클래스에서 접근 가능
- `default` (package-private): 같은 패키지 내에서만 접근 가능

### 실행 방법

1. 프로젝트를 Java IDE에서 열거나 컴파일합니다.
2. `Main` 클래스의 `accessTest()` 메서드를 실행하여 같은 클래스 내에서의 접근을 확인합니다.
3. `SamePackageClass`와 `OtherPackageClass`의 `testAccess()` 메서드를 통해 다른 클래스에서의 접근을 시뮬레이션합니다.

## 참고사항

- 이 예제는 교육 목적으로 제작되었습니다.
- 실제 환경에서는 `OtherPackageClass`를 다른 패키지에 위치시켜야 합니다.
- 컴파일 에러가 발생하는 라인들은 주석 처리되어 있습니다.