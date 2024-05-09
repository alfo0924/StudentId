package org.example;
import java.util.*;

public class c63
{
    public static void main(String[]args)
    {
        //建立Scanner
        Scanner scanner = new Scanner(System.in);

        //宣告布林值狀態
        boolean tf=false;


        //利用布林值 建立循環 若不符合條件就會繼續循環 條件判斷式 是否符合tf=true ,若不符合就會繼續循環
        // 若一開始設定布林值為tf=true ,while(!true) 判斷結果則反之
        //! 代表 反之 所以 若boolean tf1=false; !tf1=true;
        while(!tf) {
            //第一題 學號長度為8 第一個字式D 其餘為數字
            System.out.println("請輸入學生ID input Student Id :");
            String type = scanner.nextLine();

            //設定 條件 放進 判斷式
            if( type.length()==8 &&type.startsWith("d"))
            {

                System.out.println("學號格式正確!");

                tf=true;
                //當條件都正確布林值 對應到 循環條件改!tf= true; 就會跳出循環
            }
            else
            {
                System.out.println("格式錯誤請重新輸入");
                tf=false;
                //當條件都錯誤 布林值 對應到 循環條件改!tf= false; 就會繼續循環
            }

            //印出結果
            System.out.println("學號為 : "+type );


        }

    }





}
