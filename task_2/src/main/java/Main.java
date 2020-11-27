class Main {
    private final static String engAlp = "aeiouAEIOU"; // записываем гласные буквы

    public static String interviewRecursionTest(String line) {
        if (line.length() == 1) {
            return "" + line.charAt(0);
        }

        int center = line.length() / 2;
        String left = line.substring(0, center);
        String right = line.substring(center);
        boolean need = engAlp.indexOf(left.charAt(center - 1)) != -1
                || engAlp.indexOf(right.charAt(0)) != -1;

        return interviewRecursionTest(left) + (need ? "*" : "") + interviewRecursionTest(right);
    }

    public static void main(String[] args) {
        System.out.println(interviewRecursionTest("hello"));
        System.out.println(interviewRecursionTest("healo"));
        System.out.println(interviewRecursionTest("abc"));
        System.out.println(interviewRecursionTest("oab"));

    }
}