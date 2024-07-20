package com.levelup.java._01_variables_constants.extra_example;

import com.levelup.java.CommonUtils;

public class VariableTest {

    public static void main(String[] args) {

        /* 변수 선언 및 즉시 초기화 */
        int a = 100;
        double b = 3.14;
        boolean c = true;
        String d = "Hello, Everyone!";

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        CommonUtils.splitLine();

        /* 변수 값 수정 */
        a = 1232972384;
        b = 3.141592;
        c = false;
        d = "Hello, Java!";

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        CommonUtils.splitLine();

        // 변수 선언
        int variable;
        /*
         *   변수를 선언만 할 수 있습니다.
         *   현재 'variable' 변수는 메모리 할당이 되지 않았습니다.
         *   따라서, 아래의 출력문은 컴파일 에러를 발생시킵니다.
         */
        // System.out.println("variable = " + variable);

        // 복수 변수 선언
        int A, B, C, D;
        /*
         *   같은 타입의 변수를 여러 개 선언할 수 있습니다.
         *   변수의 목적이 같을 때만 사용해야 하며, 그렇지 않을 경우에는 각각의 변수를 별도로 선언하는 것이 좋습니다.
         */

    }

}
