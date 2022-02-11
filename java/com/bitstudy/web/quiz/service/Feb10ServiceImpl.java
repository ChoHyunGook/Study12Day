package com.bitstudy.web.quiz.service;

/**
 * packageName: com.bitstudy.web.quiz.service
 * fileName        : Feb09ServiceImpl
 * author           : chohyungook
 * date               : 2022-02-08
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         chohyungook        최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service{

    @Override
    public void bubbleSort() {

    }

    @Override
    public void insertionSort() {

    }

    @Override
    public void selectionSort() {

    }

    @Override
    public void quickSort() {

    }

    @Override
    public void mergeSort() {

    }

    @Override
    public void magicSquare() {
        double m =Math.random();
        int[][] magicSquare = new int[(int) m][(int) m];
        if(m%2==1){
            int x = 0, y = (int) (m/2);
            magicSquare[x][y] = 1;

            for(int i = 1; i < m*m; i++)
            {
                if((i+1)%m == 1){
                    x++;
                    if(x == m)
                        x = 0;
                    magicSquare[x][y] = i+1;
                }else{
                    x--;
                    if(x == -1)
                        x = (int) (m-1);

                    y--;
                    if(y == -1)
                        y = (int) (m-1);

                    magicSquare[x][y] = i+1;
                }

            }

            for(int i = 0 ; i < m; i++)
            {
                for(int j = 0 ; j < m; j++)
                    System.out.print(magicSquare[i][j] + " " );
                System.out.println();
            }


        }else if(m%2==0){

        }



    }



    @Override
    public void zigzag() {

    }

    @Override
    public void rectangleStarPrint() {

    }

    @Override
    public void triangleStarPrint() {

    }
}
