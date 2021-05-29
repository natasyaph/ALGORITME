package Jtable;

public class sorting {
       public static int[] getascen(String angka, int jumlah) {
           return new int[0];
       }

       public static int[] getdescen(String angka, int jumlah) {
           return new int[0];
       }

       public static class Sorting {
           public static int[] getas(String text, int amount){
               int num, i, j, temp;
               num = amount;
               int arr[] = new int[num];
               String[] stmp = text.split(",");
               int a = 0;
               for (String s : stmp){
                   arr[a] = Integer.parseInt(s.trim());
                   a++;
               }
               for (i = 0; i < ( num - 1 ); i++) {
                   for (j = 0; j < num - i - 1; j++) {
                       if (arr[j] > arr[j+1])
                       {
                           temp = arr[j];
                           arr[j] = arr[j+1];
                           arr[j+1] = temp;
                       }
                   }
               }
               return arr;
           }

           public static int[] getdes(String teks, int amount){
               int num, i, j, temp;
               num = amount;
               int arr[] = new int[num];
               String[] stmp = teks.split(",");
               int a = 0;
               for (String s : stmp){
                   arr[a] = Integer.parseInt(s.trim());
                   a++;
               }
               for (i = 0; i < ( num - 1 ); i++) {
                   for (j = 0; j < num - i - 1; j++) {
                       if (arr[j] < arr[j+1])
                       {
                           temp = arr[j];
                           arr[j] = arr[j+1];
                           arr[j+1] = temp;
                       }
                   }
               }
               return arr;
           }
       }
   }

