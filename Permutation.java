package HARSH40;

public class Permutation {
public static void main(String[] args) { String s = "RST";
int n = s.length();
permute(s, 0, n - 1);
}
static void permute(String s, int a, int b) {
if (a == b)
System.out.print(s+" ");
else {
for (int i = a; i <= b; i++) { s = swap(s, a, i); permute(s, a + 1, b);
s = swap(s, a, i);
}
}
}
static String swap(String s, int a, int b) {
char temp;
char[] charArray = s.toCharArray(); temp = charArray[a];
charArray[a] = charArray[b]; charArray[b] = temp;
return String.valueOf(charArray);
}
}
