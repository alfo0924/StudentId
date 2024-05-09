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
            if( type.length()==8 &&type.startsWith("d")||type.startsWith("D"))
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



        //第二題
        System.out.println("\n檢查輸入 身分證字號 格式 ");

        boolean ck=false;
        while(!ck)
        {

            System.out.println("請輸入身分證字號: ");
            String idStd = "ABCDEFGHJKLMNPQRSTUVXYWZ";

            String type2=scanner.nextLine();


            // 判斷式 置入 身分證格式條件 設定範圍 A~Z範圍 + 數字範圍 ,限定範圍共10碼
            if(type2.matches("[A-Z\\d]{10}"))
//            if(type2.matches("[" + idStd + "][0-9]{9}")  )
//                if(type2.matches("[A-Z][\\d]{9}")  )

                {
                System.out.println("身分證格式正確 " );
                ck=true;
            }
            else
            {
                System.out.println("身分證格式錯誤 " );
                ck=false;
            }

        }



        //第三題
        System.out.println("\n檢查輸入 電子郵件 格式");


        boolean ck2=false;
        while(!ck2)
        {

            System.out.println("請輸入 電子郵件: ");


            String type2=scanner.nextLine();
//            if(type2.matches("a~z*[@a~z.com]{8,10}"  ))

//            if(type2.matches("\\w+@(\\w+\\.)\\w+"))


            // 判斷式 置入電子郵件條件 設定範圍 aA~zZ範圍 + 數字範圍 + 標點符號 (..+*/_=)+ *表示出現0次以上 + @ +aA~zZ範圍 + 數字範圍
            // + .com +.fcu+.edu+.tw+.us+,限定4碼以上
            if(type2.matches("[aA-zZ\\d.+*/=_]*[@aA-zZ.com.fcu.edu.tw.us.o365]{4,}"  ))
            {
                System.out.println("電子郵件 格式正確 " );
                ck2=true;
            }
            else
            {
                System.out.println("電子郵件 格式錯誤 " );
                ck2=false;
            }

        }




        //第四題
        System.out.println("\n檢查輸入 使用者密碼");


        boolean ck3=false;
        while(!ck3)
        {

            System.out.println("請輸入 使用者密碼: ");


            String type2=scanner.nextLine();

            // 判斷式 置入 密碼條件 設定範圍 aA~zZ範圍 + 數字範圍 + 標點符號 (..+*/_=)
            if(type2.matches("[aA-zZ\\d.+*/_=]{6,}"  ))
            {
                System.out.println("密碼格式 正確 " );
                ck3=true;
            }
            else
            {
                System.out.println("密碼格式錯誤 請重試 " );
                ck3=false;
            }

        }






    }





}
