package com.levelup.java;

public class Item {

    private Integer id;
    private String name;
    private String description;
    private String rarity;
    private int attackPower;
    private int defensePower;
    private int price;

    public Item(Integer id, String name, String description, String rarity, int attackPower, int defensePower, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rarity = rarity;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", description='" + description + '\'' +
            ", rarity='" + rarity + '\'' +
            ", attackPower=" + attackPower +
            ", defensePower=" + defensePower +
            ", price=" + price +
            '}';
    }

    public static Item[] getItemList() {
        return new Item[]{
            new Item(1, "불꽃검", "화염 속성을 지닌 강력한 검", "전설", 90, 20, 1000),
            new Item(2, "얼음방패", "냉기 속성을 지닌 튼튼한 방패", "희귀", 20, 100, 800),
            new Item(3, "바람단검", "바람처럼 빠르게 공격할 수 있는 단검", "일반", 50, 10, 300),
            new Item(4, "천둥망치", "천둥의 힘을 담은 강력한 망치", "전설", 90, 30, 1500),
            new Item(5, "대지갑옷", "대지의 힘을 담아 만든 방어력 높은 갑옷", "희귀", 10, 80, 900),
            new Item(6, "물의지팡이", "물의 힘을 이용한 마법 지팡이", "일반", 70, 10, 500),
            new Item(7, "빛의활", "빛의 힘을 담은 신비로운 활", "전설", 90, 20, 1200),
            new Item(8, "어둠의검", "어둠의 힘을 지닌 위험한 검", "희귀", 80, 15, 1100),
            new Item(9, "폭풍의검", "폭풍의 힘을 지닌 전설적인 검", "전설", 110, 25, 1400),
            new Item(10, "불사의투구", "불사의 힘을 담은 특별한 투구", "희귀", 90, 90, 1300)
        };
    }
}
