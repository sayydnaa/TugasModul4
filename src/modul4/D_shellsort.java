
package modul4;
 
public class D_shellsort {
     public static void shellSort(int []arr){
        int n = arr.length;
        int x,y;
        int jarak, i, j, kondisi;
        boolean sudah = true;

        int temp;
        x =0;
        y=0;
        jarak =n;

        while(jarak >=1 ){
            jarak = jarak/2;
            sudah = true;
            while(sudah){
                sudah = false;
                for (j = 0; j<n - jarak; j++){
                    i = j+jarak;
                    x++;
                    if (arr[j]>arr[i]){
                        temp = arr[i];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        sudah = true;
                    }
                }
            }
        }

    }
    public static void tampil(int data[]){
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        }

    public static void main(String[] args) {
        int A[] = {25, 7, 9, 13, 3};
        D_shellsort.tampil(A);
        D_shellsort.shellSort(A);
        D_shellsort.tampil(A);

        System.out.println();
        System.out.println("Aqshal Sayyidina");
    }

}

   