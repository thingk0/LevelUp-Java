
package com.levelup.java._07_branching_statements._06_loops_statements;

import com.levelup.java.CommonUtils;
import com.levelup.java.Item;

public class Main {

    public static void main(String[] args) {
        Item[] itemList = Item.getItemList();

        // break 문 예제: 방어력이 50 이상인 아이템을 찾을 때까지 반복
        System.out.println("break 문 예제:");
        for (Item item : itemList) {
            if (item.getDefensePower() >= 50) {
                System.out.println("방어력이 50 이상인 아이템 발견: " + item.getName());
                break; // 방어력이 50 이상인 아이템을 찾으면 루프 종료
            }
        }
        CommonUtils.splitLine();

        // continue 문 예제: 가격이 500 이상인 아이템만 출력, 나머지는 건너뛰기
        System.out.println("continue 문 예제:");
        for (Item item : itemList) {
            if (item.getPrice() < 500) {
                continue; // 가격이 500 미만인 아이템은 건너뛰기
            }
            System.out.println("가격이 500 이상인 아이템: " + item.getName() + " (가격: " + item.getPrice() + ")");
        }
        CommonUtils.splitLine();

        // return 문 예제: 공격력이 100 이상인 아이템을 찾으면 종료
        System.out.println("return 문 예제:");
        findHighAttackItem(itemList);
        CommonUtils.splitLine();
    }

    // return 문을 사용하는 메서드
    public static void findHighAttackItem(Item[] items) {
        for (Item item : items) {
            if (item.getAttackPower() >= 100) {
                System.out.println("공격력이 100 이상인 아이템 발견: " + item.getName());
                return; // 공격력이 100 이상인 아이템을 찾으면 메서드 종료
            }
        }
        System.out.println("공격력이 100 이상인 아이템을 찾지 못했습니다.");
    }
}
