package com.yikeo.dbadmin.common.enums;

public enum LanguageEnum {

    CS("cs", "\u010ce\u0161tina"),
    DE("de", "Deutsch"),
    EN("en", "English"),
    ES("es", "Espa\u00f1ol"),
    FR("fr", "Fran\u00e7ais"),
    HI("hi", "Hindi \u0939\u093f\u0902\u0926\u0940"),
    HU("hu", "Magyar"),
    KO("ko", "\ud55c\uad6d\uc5b4"),
    IN("in", "Indonesia"),
    IT("it", "Italiano"),
    JA("ja", "\u65e5\u672c\u8a9e"),
    NL("nl", "Nederlands"),
    PL("pl", "Polski"),
    PT_BR("pt_BR", "Portugu\u00eas (Brasil)"),
    PT_PT("pt_PT", "Portugu\u00eas (Europeu)"),
    RU("ru", "\u0440\u0443\u0441\u0441\u043a\u0438\u0439"),
    SK("sk", "Slovensky"),
    TR("tr", "T\u00fcrk\u00e7e"),
    UK("uk", "\u0423\u043A\u0440\u0430\u0457\u043D\u0441\u044C\u043A\u0430"),
    ZH_CN("zh_CN", "\u4e2d\u6587 (\u7b80\u4f53)"),
    ZH_TW("zh_TW", "\u4e2d\u6587 (\u7e41\u9ad4)");

    private String code;
    private String text;

    LanguageEnum(String code, String text) {
        this.code = code;
        this.text = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
