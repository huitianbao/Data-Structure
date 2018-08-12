/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2018.pkg8.pkg6.字谜问题;

/**
 *
 * @author 16221
 */
public class 字谜问题 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] puzzle = {
            {'t', 'h', 'i', 's'},
            {'w', 'a', 't', 's'},
            {'o', 'a', 'h', 'g'},
            {'f', 'g', 'g', 't'}
        };

        String word=null;
        int position[][]=null;
        int x, y, dir, strlen;
        
         for(x=0;x<4;x++){
        for(y=0;y<4;y++){
            for(dir=0;dir<8;dir++){
                for(strlen=2;strlen<5;strlen++){
                    // 坐标 x y
                    // 方向 dir
                    // 单词长度从2开始
                    if(wordExist(x, y, dir, strlen, word, position) == 1){
                        System.out.println("word:"+word);
                        break;
                    }
                }
            }
        }
    }


    }

    String[] dict = {"this", "two", "fat", "that"};

    static int  wordExist(int x, int y, int dir, int strlen, String word, int position[][]) {
String sword=null;
    int i = 0, j;
    while(i < strlen){
        position[i][0] = x;
        position[i][1] = y;
        sword[i++] = puzzle[x][y];
        sword[i] = '\0';
        for(j=0;j<4;j++){
            if(strcmp(sword,dict[j]) == 0){
                strcpy(word,dict[j]);
                return 1;
            }
        }
 
        switch (dir){
            case 0:        //从左到右
                y++;
                break;
            case 1:        //从右到左
                y--;
                break;
            case 2:        //从上到下
                x++;
                break;
            case 3:        //从下到上
                x--;
                break;
            case 4:        //从左上到右下
                x++;
                y++;
                break;
            case 5:        //从右下到左上
                x--;
                y--;
                break;
            case 6:        //从左下到右上
                x--;
                y++;
                break;
            case 7:        //从右上到左下
                x++;
                y--;
                break;
            default:
                puts("Direction error.");
                return 0;
         }
         if(x < 0 || y < 0)
            return 0;

        return 0;
    }

}
