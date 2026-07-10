package com.devc.day2.homework;

public class Main {
    public static void main(String[] args) {

        int stock = 5;

        for(int i = 1; i <= 10; i++) {
            stock--;
            if(stock >= 0) {
                System.out.println(i + "번 주문 성공, 남은 재고: " + stock);
            }
            else {
                System.out.println(i + "번 주문 실패, 재고 없음" );
            }
        }
    }
}
