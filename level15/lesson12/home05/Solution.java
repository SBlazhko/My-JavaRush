package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    private int a, b;
    private double a1, b1;
    private String a2, b2;
    short a3, b3;

    public Solution() {}
    public Solution(int a) {this.a = a;}
    public Solution(int a, int b) {this.a = a; this.b = b;}

    private Solution(double a1) {this.a1 = a1;}
    private Solution(double a1, double b1) {this.a1 = a1; this.b1 = b1;}
    private Solution(double b1, int a) {this.b1 = b1; this.a = a;}

    protected Solution(String a2){this.a2 = a2;}
    protected Solution(String a2, String b2){this.a2 = a2;this.b2 = b2;}
    protected Solution(String a2, double a1){this.a2 = a2; this.a1 = a1;}

    Solution(short a3){this.a3 = a3;}
    Solution(short a3, short b3){this.a3 = a3; this.b3 = b3;}
    Solution(short a3, int b){this.a3 = a3; this.b = b;}
}

