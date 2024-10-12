package 정렬_sort;

public class Selection_Sort {
    // -- 선택 정렬 --
    public static void main(String[] args) {

        int i, j,min, index=0, temp=0;

        // 길이 10의 정수형 배열
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        // 배열의 길이만큼 반복시킨다.
        for (i=0; i < 10; i++){
            // 초기 최소값, 배열을 반복하면서 바뀌게될것
            min = 9999;
            for(j=i; j < 10; j++){
                if(min > array[j]){
                    min = array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        for (i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }

    }

}
