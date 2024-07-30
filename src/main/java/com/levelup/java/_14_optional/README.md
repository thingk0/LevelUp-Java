## 개요
이 프로그램은 Java의 `Optional` 클래스를 다룹니다. `Optional`을 사용하여 null 처리를 보다 안전하게 하고, 다양한 메서드를 활용하여 값을 다루는 방법을 학습합니다.

---

## 주요 기능
1. `Optional` 클래스의 주요 메서드 사용법을 학습합니다.
2. `Optional`을 사용하여 null 안전성을 확보하고, 다양한 상황에서 `Optional`을 활용하는 방법을 이해합니다.

---

## 클래스 구조
- `OptionalSample`: `Optional`을 다루는 클래스

---

## 주요 개념 설명

### Optional
- `Optional`은 null 값을 직접 사용하는 대신, 값이 존재할 수도, 존재하지 않을 수도 있음을 명시적으로 표현하는 컨테이너입니다.
- `Optional`을 사용하여 null 포인터 예외를 방지하고, 더 안전한 코드를 작성할 수 있습니다.

---

## OptionalSample 클래스

### 주요 기능
- `Optional.of`를 사용하여 non-null 값으로 `Optional` 생성
- `Optional.empty`를 사용하여 빈 `Optional` 생성
- `Optional.ofNullable`를 사용하여 null 가능 값으로 `Optional` 생성
- `isPresent`를 사용하여 값이 존재하는지 확인
- `ifPresent`를 사용하여 값이 존재할 때 동작 수행
- `orElse`를 사용하여 기본값 반환
- `orElseGet`을 사용하여 기본값을 제공하는 Supplier 사용
- `orElseThrow`를 사용하여 값이 없을 때 예외 발생
- `map`을 사용하여 값이 존재할 때 변환
- `flatMap`을 사용하여 중첩된 `Optional` 변환
- `filter`를 사용하여 조건에 따라 값 필터링
- `orElse`와 `orElseGet`의 차이점 설명
- `Optional.of`와 `Optional.ofNullable`의 차이점 설명

### 주요 메서드 및 사용법

- `Optional.of`
  ```java
  Optional<String> nonNullValue = Optional.of("Hello, World!");
  System.out.println("Optional.of(nonNullValue) : " + nonNullValue);
  System.out.println("nonNullValue.get() : " + nonNullValue.get());
  ```

- `Optional.empty`
  ```java
  Optional<String> emptyValue = Optional.empty();
  System.out.println("Optional.empty: " + emptyValue);
  ```

- `Optional.ofNullable`
  ```java
  Optional<String> nullableValue = Optional.ofNullable(null);
  System.out.println("Optional.ofNullable (null): " + nullableValue);

  nullableValue = Optional.ofNullable("Nullable value");
  System.out.println("Optional.ofNullable (not null): " + nullableValue);
  ```

- `isPresent`
  ```java
  System.out.println("nonNullValue is present: " + nonNullValue.isPresent());
  System.out.println("emptyValue is present: " + emptyValue.isPresent());
  ```

- `ifPresent`
  ```java
  nonNullValue.ifPresent(value -> System.out.println("ifPresent: " + value));
  ```

- `orElse`
  ```java
  System.out.println("emptyValue orElse: " + emptyValue.orElse("Default Value"));
  ```

- `orElseGet`
  ```java
  System.out.println("emptyValue orElseGet: " + emptyValue.orElseGet(() -> "Default from Supplier"));
  ```

- `orElseThrow`
  ```java
  try {
      emptyValue.orElseThrow(() -> new RuntimeException("Value is not present"));
  } catch (RuntimeException e) {
      System.out.println("orElseThrow: " + e.getMessage());
  }
  ```

- `map`
  ```java
  Optional<Integer> mappedValue = nonNullValue.map(String::length);
  System.out.println("map: " + mappedValue);
  ```

- `flatMap`
  ```java
  Optional<Optional<String>> nestedOptional = Optional.of(Optional.of("Nested value"));
  Optional<String> flatMappedValue = nestedOptional.flatMap(opt -> opt);
  System.out.println("flatMap: " + flatMappedValue);
  ```

- `filter`
  ```java
  Optional<String> filteredValue = nonNullValue.filter(value -> value.startsWith("Hello"));
  System.out.println("filter (starts with 'Hello'): " + filteredValue);

  filteredValue = nonNullValue.filter(value -> value.startsWith("Goodbye"));
  System.out.println("filter (starts with 'Goodbye'): " + filteredValue);
  ```
---

### `orElse`와 `orElseGet`의 차이점

- `orElse`: `Optional`이 비어있을 때 제공할 기본 값을 직접 전달받습니다. 이 메서드는 `Optional`에 값이 있는지와 관계없이 항상 기본 값 생성이 수행됩니다.
  ```java
  String defaultValue = "Default Value";
  String value = optional.orElse(defaultValue);
  ```

- `orElseGet`: `Optional`이 비어있을 때 기본 값을 반환하는 `Supplier`를 전달받습니다. 이 메서드는 `Optional`에 값이 있을 때는 `Supplier`가 호출되지 않습니다.
  ```java
  String value = optional.orElseGet(() -> "Default from Supplier");
  ```

### `Optional.of`와 `Optional.ofNullable`의 차이점

- `Optional.of`: null이 아닌 값을 `Optional`로 래핑합니다. 값이 null일 경우 `NullPointerException`을 던집니다.
  ```java
  Optional<String> nonNullValue = Optional.of("Hello, World!");
  // Optional<String> nullValue = Optional.of(null); // NullPointerException 발생
  ```

- `Optional.ofNullable`: null일 수도 있는 값을 `Optional`로 래핑합니다. 값이 null이면 빈 `Optional`을 반환합니다.
  ```java
  Optional<String> nullableValue = Optional.ofNullable(null); // 빈 Optional 반환
  Optional<String> nonNullValue = Optional.ofNullable("Hello, World!"); // "Hello, World!"를 래핑하는 Optional 반환
  ```

---

### 실행 방법

1. 프로젝트를 Java IDE에서 열거나 컴파일합니다.
2. `OptionalSample` 클래스의 `main` 메서드를 실행합니다.
3. 콘솔에서 출력 결과를 확인합니다.

---

### 참고사항
- `Optional`을 적절히 활용하여 null 포인터 예외를 방지하고, 코드의 안정성을 높이는 방법을 학습합니다.