package 연습_배열과반복문;

public class MergeTwoArray {
    public static void main(String[] args) {
        //배열 생성
        int[] evens = {0, 2, 4, 6, 8};
        int[] odds = {1, 3, 5, 7, 9};

        //배열 병합
        int[] result = merge(evens, odds);

        //결과 출력
        System.out.printf("결과: ");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d\n", result[i]);
        }
    }

    //두 배열을 입력받아, 하나로 된 새 배열을 반환
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];//배열의 크기
        int j=0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                mergedArr[j] = arr1[i];
                j++;
                mergedArr[j] = arr2[i];
                j++;
            } else {
                mergedArr[j] = arr2[i];
                j++;
                mergedArr[j] = arr1[i];
                j++;
            }
        }
        return mergedArr;
    }
}
