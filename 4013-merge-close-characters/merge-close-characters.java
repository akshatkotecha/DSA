class Solution {
    public String mergeCharacters(String s, int k) {
        char a[] = s.toCharArray();
        int n = a.length;
        StringBuilder sb = new StringBuilder();
        boolean visited[] = new boolean[n];

        while (true) {
            boolean ok = false;

            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    char ch = a[i];
                    int cnt = 0;

                    for (int j = i + 1; j < n; j++) {
                        if (visited[j]) continue;
                        cnt++;

                        if (cnt > k) break;

                        if (a[j] == ch) {
                            visited[j] = true;
                            ok = true;
                            break;
                        }
                    }

                    if (ok) break;
                }
            }

            if (!ok) break;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) sb.append(a[i]);
        }

        return sb.toString();
    }
}