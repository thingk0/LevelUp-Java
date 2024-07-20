package com.levelup.java._01_variables_constants;

import static com.levelup.java.CommonUtils.splitLine;

public class Main {

    private static final int MAX_LEVEL = 100;
    private static final double DEFAULT_BOSS_DROP_RATE = 0.05;
    private static final char DEFAULT_RANK = 'A';
    private static final boolean DEFAULT_QUEST_STATUS = false;

    public static void main(String[] args) {

        splitLine();

        int level;
        level = 30;
        System.out.println("level = " + level);

        int otherLevel = 70;
        System.out.println("otherLevel = " + otherLevel);
        splitLine();

        int myHp = 1000;
        double bossDropRate = 0.12;
        char rank = 'S';
        boolean isQuestCompleted = true;

        String result
            = "myHp = " + myHp
            + "\nbossDropRate = " + bossDropRate
            + "\nrank = " + rank
            + "\nisQuestCompleted = " + isQuestCompleted;
        System.out.println(result);
        splitLine();

        final int INITIAL_HP = 500;
        final double SPECIAL_BOSS_DROP_RATE = 0.25;
        final char SPECIAL_RANK = 'S';
        final boolean IS_SPECIAL_QUEST_COMPLETED = true;

        String localResult
            = "INITIAL_HP = " + INITIAL_HP
            + "\nSPECIAL_BOSS_DROP_RATE = " + SPECIAL_BOSS_DROP_RATE
            + "\nSPECIAL_RANK = " + SPECIAL_RANK
            + "\nIS_SPECIAL_QUEST_COMPLETED = " + IS_SPECIAL_QUEST_COMPLETED;
        System.out.println(localResult);
        splitLine();

        System.out.println("MAX_LEVEL = " + MAX_LEVEL);
        System.out.println("DEFAULT_BOSS_DROP_RATE = " + DEFAULT_BOSS_DROP_RATE);
        System.out.println("DEFAULT_RANK = " + DEFAULT_RANK);
        System.out.println("DEFAULT_QUEST_STATUS = " + DEFAULT_QUEST_STATUS);
        splitLine();

    }
}
