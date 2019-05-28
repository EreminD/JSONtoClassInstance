package explain;

import com.google.gson.Gson;

public class Tester {
    private final static String SCARLET = "{'id': 1, 'name':'Scarlet'}";
    private final static String ROBERT = "{'id': 2, 'name':'Robert'}";

    public static void main(String[] args) {
        POJO pojo1 = new Gson().fromJson(SCARLET, POJO.class);
        System.out.println(pojo1.id + " - " + pojo1.name);

        Converter converter = new Converter();
        converter.setMapping("Rob", POJO.class);

        POJO pojo2 = converter.convert("Rob", ROBERT);
        System.out.println(pojo2.id + " - " + pojo2.name);
    }

}

