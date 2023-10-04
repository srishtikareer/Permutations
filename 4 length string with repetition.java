public class PermWithRep {
    public static void main(String[] args) {
        String input = "ab";
        int length = input.length();
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length; k++) {
                    for (int l = 0; l < length; l++) {
                        System.out.println("" + input.charAt(i) + input.charAt(j) + input.charAt(k) + input.charAt(l));
                    }
                }
            }
        }
    }
}
