# Static Members and Inner Classes - Example

Java에서 static 멤버와 내부 클래스의 사용을 보여주는 예제입니다.

---
### 개요
이 프로그램은 Java의 static 키워드와 내부 클래스의 사용을 시연합니다. 다음과 같은 개념을 다룹니다:

- static과 non-static 변수
- static과 non-static 메서드
- 일반 내부 클래스와 static 내부 클래스
- static 컨텍스트에서의 제약사항
- static 메서드의 올바른 호출 방법

### 주요 기능

1. static과 non-static 변수를 정의하고 접근합니다.
2. static과 non-static 메서드를 정의하고 호출합니다.
3. 일반 내부 클래스와 static 내부 클래스를 정의하고 인스턴스를 생성합니다.
4. static 컨텍스트(main 메서드)에서의 제약사항을 보여줍니다.
5. static 메서드의 올바른 호출 방법과 잘못된 호출 방법을 비교합니다.

### 클래스 구조

- `Main`: 주요 예제 클래스
  - 변수: NON_STATIC_MAX_NUM, STATIC_MAX_NUM
  - 메서드: main, instanceMethod, classMethod
  - 내부 클래스: Person (non-static), StaticPerson (static)

### static과 non-static의 주요 차이점

- static 멤버는 클래스에 속하며, 클래스의 인스턴스 없이 접근 가능합니다.
- non-static 멤버는 클래스의 인스턴스에 속하며, 인스턴스를 통해서만 접근 가능합니다.
- static 컨텍스트에서는 non-static 멤버에 직접 접근할 수 없습니다.

### 내부 클래스의 차이점

- 일반 내부 클래스(Person)는 외부 클래스의 인스턴스에 종속됩니다.
- static 내부 클래스(StaticPerson)는 외부 클래스의 인스턴스 없이 사용 가능합니다.

### static 메서드 호출의 올바른 방법

예제에서는 `CommonUtils.splitLine();`와 `CommonUtils commonUtils = new CommonUtils(); commonUtils.splitLine();` 두 가지 방식으로 static 메서드를 호출합니다.

- `CommonUtils.splitLine();`는 올바른 방법입니다. static 메서드는 클래스 이름을 통해 직접 호출하는 것이 권장됩니다.
- `commonUtils.splitLine();`는 인스턴스를 통해 static 메서드를 호출하는 방식입니다. 이는 가능하지만 권장되지 않습니다. 이 방식은 코드의 가독성을 떨어뜨리고, 해당 메서드가 static인지 인스턴스 메서드인지 혼동을 줄 수 있습니다.

static 메서드는 항상 클래스 이름을 통해 호출하는 것이 좋습니다. 이는 코드의 의도를 명확히 하고, 다른 개발자들이 코드를 이해하는 데 도움을 줍니다.

### 실행 방법

1. 프로젝트를 Java IDE에서 열거나 컴파일합니다.
2. `Main` 클래스의 `main` 메서드를 실행합니다.
3. 콘솔에서 출력 결과를 확인합니다.

## 참고사항

- 이 예제는 교육 목적으로 제작되었습니다.
- 주석 처리된 코드 라인들은 컴파일 에러를 발생시키는 예시입니다.
- `CommonUtils` 클래스는 별도로 정의되어 있어야 합니다.
- static 메서드를 인스턴스를 통해 호출하는 것은 가능하지만, 좋은 방법이 아닙니다. 항상 클래스 이름을 통해 호출하는 것이 좋습니다.