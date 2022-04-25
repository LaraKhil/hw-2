class NameEncoderDecoder{
    public String encode(String name){
        String test = name.replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5");
        return "NOTFORYOU"+test+"YESNOTFORYOU";
    };
    public String decode(String name){
        String test1 = name.replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a");
        int end = test1.length() - 12;
        return test1.substring(9, end);
    };


};