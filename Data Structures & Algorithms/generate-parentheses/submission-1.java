public class Solution {
    private void backtrack(int openN, int closedN, int n, List<String> res, String stack) {
        if (openN == closedN && openN == n) {
            res.add(stack.toString());
            return;
        }

        if (openN < n) {
            backtrack(openN + 1, closedN, n, res, stack+"(");
        }
        if (closedN < openN) {
            backtrack(openN, closedN + 1, n, res, stack+")");
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(0, 0, n, res, "");
        return res;
    }
}