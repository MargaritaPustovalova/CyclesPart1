package ru.netology.sqr;

public class SQRService {

    public int sqrCount(int min, int max) {
   for (int i = 10; i <= 99; i++) {
       if (i * i > min && i * i < max){
           return i;
       }
   }
    }
}