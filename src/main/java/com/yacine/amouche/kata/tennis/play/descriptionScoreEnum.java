package com.yacine.amouche.kata.tennis.play;

public enum descriptionScoreEnum {
    LOVE("Love"),
            FIFTEEN("Fifteen"),
            THERTY("Therty"),
    FORTY("Forty"),
           ADVANTAGE("advantage");

    private String code;
    private descriptionScoreEnum(String coString) {
        this.code =code;
    }
    public String getCode() {
        return code;
    }

    public static descriptionScoreEnum valueOfCode(String code) {
        for (descriptionScoreEnum type : values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return null;
    }
    @Override
    public String toString () {
        return code;
    }
}
