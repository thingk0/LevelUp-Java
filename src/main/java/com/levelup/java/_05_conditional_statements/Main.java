package com.levelup.java._05_conditional_statements;

import com.levelup.java.CommonUtils;
import com.levelup.java.Item;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Item[] itemList = Item.getItemList();

        CommonUtils.splitLine();

        // if, else if, else 문 예제
        Item myItem = itemList[6];
        for (Item item : itemList) {
            if (Objects.equals(myItem.getId(), item.getId())) {
                System.out.println("찾았다 내 아이템!!!!!!!!!!! = " + myItem.getName());
            } else if (myItem.getAttackPower() == item.getAttackPower()) {
                System.out.println("공격력은 같네.. " + item.getName());
            } else if (item.getPrice() > 1000) {
                System.out.println("가격이 비싸네.. " + item.getName());
            } else if (item.getDefensePower() > 50) {
                System.out.println("방어력이 높네.. " + item.getName());
            } else {
                System.out.println("어딨냐 내 아이템.. " + item.getName());
            }
        }

        CommonUtils.splitLine();

        // switch 문 예제
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
                default:
                    System.out.println(item.getName() + "은 알려지지 않은 등급의 템");
                    break;
            }
        }

        CommonUtils.splitLine();

        // 복잡한 조건문 예제
        for (Item item : itemList) {
            if (item.getAttackPower() > 80) {
                if (item.getRarity().equals("전설")) {
                    System.out.println(item.getName() + "은 전설급 고공격력 아이템!");
                } else if (item.getRarity().equals("희귀")) {
                    System.out.println(item.getName() + "은 희귀급 고공격력 아이템!");
                } else {
                    System.out.println(item.getName() + "은 일반급 고공격력 아이템!");
                }
            } else if (item.getDefensePower() > 50) {
                if (item.getPrice() > 1000) {
                    System.out.println(item.getName() + "은 비싸고 방어력이 높은 아이템!");
                } else {
                    System.out.println(item.getName() + "은 방어력이 높은 아이템!");
                }
            } else {
                System.out.println(item.getName() + "은 평균적인 아이템.");
            }
        }

        CommonUtils.splitLine();

        // 다중 조건문 예제
        for (Item item : itemList) {
            if (item.getAttackPower() > 80 && item.getDefensePower() > 50) {
                System.out.println(item.getName() + "은 공격력과 방어력이 모두 높은 아이템!");
            } else if (item.getAttackPower() > 80 || item.getDefensePower() > 50) {
                System.out.println(item.getName() + "은 공격력이나 방어력 중 하나가 높은 아이템!");
            } else {
                System.out.println(item.getName() + "은 일반적인 아이템.");
            }
        }

        CommonUtils.splitLine();

        // switch 문을 활용한 가격대 분류 예제
        for (Item item : itemList) {
            int priceRange = item.getPrice() / 500;
            switch (priceRange) {
                case 0:
                    System.out.println(item.getName() + "은 저렴한 가격의 아이템.");
                    break;
                case 1:
                    System.out.println(item.getName() + "은 중간 가격대의 아이템.");
                    break;
                case 2:
                case 3:
                    System.out.println(item.getName() + "은 약간 비싼 가격대의 아이템.");
                    break;
                default:
                    System.out.println(item.getName() + "은 매우 비싼 아이템.");
                    break;
            }
        }

        CommonUtils.splitLine();

    }
}