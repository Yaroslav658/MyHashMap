public class Main {

    public static void main(String[] args) {
        // Map<String, String> map = new HashMap<>(); - аналог
        MyMap myMap = new MyHashMap();
        System.out.println(myMap.put("2", "asdf"));
        myMap.put("2", "qwert");
        myMap.put("2", "qwer");
        myMap.put("3", "zxcv");
        myMap.put("2", "zzz");
        System.out.println(myMap.put("5", "213"));
        myMap.remove("2");
        myMap.remove("3");
        myMap.remove("11");

        System.out.println(myMap); // [1=zzz, 2=qwert, 3=zxcv]
        System.out.println(myMap.get("00000"));

//        MySet set = new MyHashSet();
//        set.add("asdf");
//        set.add("qwer");
//        set.add("zxcv");
//        set.add("asdf");
//        System.out.println(set); // [zxcv, qwer, asdf]
    }

}