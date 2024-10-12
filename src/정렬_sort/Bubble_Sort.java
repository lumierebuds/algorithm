package 정렬_sort;

public class Bubble_Sort {
    // -- 버블 정렬 --
    public static void main(String[] args) {

        int i, j, temp;
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for (i=0; i < 10; i++){
            for(j=0; j< 9 - i; j++){
                // "9-i" 까지 반복을 해주는 이유는?
                // 천천히 뒤에서부터 집합의 크기를 하나씩 감소시키면서 비교하기 때문
                if(array[j] >  array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }

        for(i=0; i < 10; i++){
            System.out.print(array[i] + " ");
        }
    }
}
