package io;

/*
1) System.out & System.err difference
อธิบายความแตกต่างระหว่าง System.out กับ System.err
 */

public class _1_SystemOutErrDifference {
    public static void main(String[] args) {
        System.out.println("System.out");
        System.err.println("System.err");
        // โปรแกรมทำตามลำดับ แต่ปริ้นไม่เรียงกันเพราะอยู่คนละท่อกัน
        // ถ้าเสร็จก่อนปริ้นก่อน
    }
}
