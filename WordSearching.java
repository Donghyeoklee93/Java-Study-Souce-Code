public class WordSearching {
    public static void main(String[] args) {
        String src = "aabbccAABBCCaa";
        String key = "aa";
        System.out.println(src);
        System.out.println("We find " + key + " " + stringCount(src, key) + " times.");
    }

    static int stringCount(String src, String key) {
        return stringCount(src, key, 0);
    }

    static int stringCount(String src, String key, int pos) {
        int count = 0;
        int index = 0;

        if (key == null || key.length() == 0) {
            return 0;
        }

        while ((index = src.indexOf(key, pos)) != -1) {
            count++;
            pos = index + key.length();
        }
        return count;
    }

}
