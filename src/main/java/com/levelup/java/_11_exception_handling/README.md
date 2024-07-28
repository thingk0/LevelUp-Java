## 개요
이 프로그램은 Java의 예외 처리 기법을 다룹니다. 다음과 같은 개념을 포함합니다:

- 예외의 종류 (Checked Exception, Unchecked Exception)
- try-catch-finally 구문
- throw와 throws 키워드
- 사용자 정의 예외

## 주요 기능
1. Checked Exception과 Unchecked Exception의 차이점을 학습합니다.
2. try-catch-finally 구문을 사용하여 예외를 처리합니다.
3. throw와 throws 키워드를 사용하여 예외를 던지고 선언합니다.
4. 사용자 정의 예외를 생성하고 처리합니다.

## 클래스 구조
- `Main`: 주요 예제 클래스
- `CheckedExceptionExample`: Checked Exception을 다루는 클래스
- `UncheckedExceptionExample`: Unchecked Exception을 다루는 클래스
- `CustomException`: 사용자 정의 예외 클래스
- `CustomExceptionExample`: 사용자 정의 예외를 다루는 클래스

---

### 주요 개념 설명

#### 예외의 종류
1. **Checked Exception**: 컴파일 시에 예외 처리를 강제하는 예외입니다.
2. **Unchecked Exception**: 런타임 시에 발생하는 예외로, 예외 처리를 강제하지 않습니다.

#### try-catch-finally 구문
- try 블록에서 예외가 발생할 수 있는 코드를 작성하고, catch 블록에서 예외를 처리합니다. finally 블록은 예외 발생 여부와 상관없이 항상 실행됩니다.

#### throw와 throws 키워드
- **throw**: 예외를 명시적으로 발생시킬 때 사용합니다.
- **throws**: 메서드 선언부에 사용하여 메서드가 던질 수 있는 예외를 명시합니다.

#### 사용자 정의 예외
- 기존의 예외 클래스들을 상속받아 사용자 정의 예외를 생성하고, 특정 상황에서 이를 사용할 수 있습니다.

### 클래스 구조

#### Main 클래스
- **설명**: 주요 예제 코드가 포함된 클래스입니다. Checked Exception, Unchecked Exception, try-catch-finally 구문, throw와 throws 키워드, 사용자 정의 예외 예제가 포함됩니다.
- **메서드**: main

#### CheckedExceptionExample 클래스
- **설명**: Checked Exception을 다루는 클래스입니다.
- **메서드**: readFile

#### UncheckedExceptionExample 클래스
- **설명**: Unchecked Exception을 다루는 클래스입니다.
- **메서드**: divide

#### CustomException 클래스
- **설명**: 사용자 정의 예외 클래스입니다.
- **상속**: Exception

#### CustomExceptionExample 클래스
- **설명**: 사용자 정의 예외를 다루는 클래스입니다.
- **메서드**: checkValue

---

### 실행 방법

1. 프로젝트를 Java IDE에서 열거나 컴파일합니다.
2. `Main` 클래스의 `main` 메서드를 실행합니다.
3. 콘솔에서 출력 결과를 확인합니다.

## 참고사항
- 안정적인 예외 처리를 통해 프로그램의 신뢰성을 향상합니다.