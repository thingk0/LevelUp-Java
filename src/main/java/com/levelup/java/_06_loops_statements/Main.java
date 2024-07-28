package com.levelup.java._06_loops_statements;

import com.levelup.java.CommonUtils;
import com.levelup.java.Item;

public class Main {

    public static void main(String[] args) {
        Item[] itemList = Item.getItemList();

        // for 문 예제: 모든 아이템의 이름과 공격력 출력
        System.out.println("for 문 예제:");
        for (Item item : itemList) {
            System.out.println(item.getName() + "의 공격력: " + item.getAttackPower());
        }
        CommonUtils.splitLine();

        // while 문 예제: 방어력이 50 이상인 아이템을 찾을 때까지 반복
        System.out.println("while 문 예제:");
        int index = 0;
        while (index < itemList.length) {
            Item item = itemList[index];
            if (item.getDefensePower() >= 50) {
                System.out.println("방어력이 50 이상인 아이템 발견: " + item.getName());
                break; // 방어력이 50 이상인 아이템을 찾으면 루프 종료
            }
            index++;
        }
        CommonUtils.splitLine();

        // do while 문 예제: 아이템 리스트를 순회하며 가격이 1000 이상인 아이템 출력
        System.out.println("do while 문 예제:");
        index = 0;
        do {
            Item item = itemList[index];
            if (item.getPrice() >= 1000) {
                System.out.println("가격이 1000 이상인 아이템: " + item.getName() + " (가격: " + item.getPrice() + ")");
            }
            index++;
        } while (index < itemList.length);
        CommonUtils.splitLine();

        // for-each 문 예제: 아이템의 등급별로 출력
        System.out.println("for-each 문 예제:");
        for (Item item : itemList) {
            switch (item.getRarity()) {
                case "전설":
                    System.out.println(item.getName() + "은 <<<전설템>>> 템");
                    break;
                case "희귀":
                    System.out.println(item.getName() + "은 <<희귀>> 템");
                    break;
                case "일반":
                    System.out.println(item.getName() + "은 <일반> 템");
                    break;
            }
        }
        CommonUtils.splitLine();

        // 중첩 for 문 예제: 모든 아이템의 조합 출력 (단, 같은 아이템 조합 제외)
        System.out.println("중첩 for 문 예제:");
        for (int i = 0; i < itemList.length; i++) {
            for (int j = i + 1; j < itemList.length; j++) {
                System.out.println(itemList[i].getName() + "과(와) " + itemList[j].getName() + "의 조합");
            }
        }
        CommonUtils.splitLine();
    }
}
