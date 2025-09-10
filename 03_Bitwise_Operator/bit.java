public class bit {
    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 3; // 0011

        System.out.println("a & b: " + (a & b)); // AND operation: 0001 -> 1
        System.out.println("a | b: " + (a | b)); // OR operation: 0111 -> 7
        System.out.println("a ^ b: " + (a ^ b)); // XOR operation: 0110 -> 6
        System.out.println("~a: " + (~a));       // NOT operation: 1010 -> -6 (in two's complement)
        System.out.println("a << 1: " + (a << 1)); // Left shift: 1010 -> 10
        System.out.println("a >> 1: " + (a >> 1)); // Right shift: 0010 -> 2
    }
}
