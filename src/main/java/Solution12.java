//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Solution12 {
    Solution12() {
    }

    public String multiply(String num1, String num2) {
        if (num1.equals("0") | num2.equals("0")) {
            return "0";
        } else {
            String ans = "0";
            int m = num1.length();
            int n = num2.length();

            for(int i = n - 1; i >= 0; --i) {
                StringBuffer curr = new StringBuffer();
                int add = 0;

                int y;
                for(y = n - 1; y > i; --y) {
                    curr.append(0);
                }

                y = num2.charAt(i) - 48;

                for(int j = m - 1; j >= 0; --j) {
                    int x = num1.charAt(j) - 48;
                    int product = x * y + add;
                    curr.append(product % 10);
                    add = product / 10;
                }

                if (add != 0) {
                    curr.append(add % 10);
                }

                ans = this.addStrings(ans, curr.reverse().toString());
            }

            return ans;
        }
    }

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0;

        StringBuffer ans;
        for(ans = new StringBuffer(); i >= 0 || j >= 0 || add != 0; --j) {
            int x = i >= 0 ? num1.charAt(i) - 48 : 0;
            int y = j >= 0 ? num2.charAt(j) - 48 : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            --i;
        }

        ans.reverse();
        return ans.toString();
    }
}
