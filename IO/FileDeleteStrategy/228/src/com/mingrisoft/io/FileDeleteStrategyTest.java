package com.mingrisoft.io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileDeleteStrategy;

/**
 * 王者歸來-java完全開發範例集
 *  http://www.deepstone.com.tw/xmdoc/cont?xsmsid=0J191295271158913049&sid=0J353063566013658199&sq=java%E5%AE%8C%E5%85%A8%E9%96%8B%E7%99%BC%E7%AF%84%E4%BE%8B%E9%9B%86
 */

public class FileDeleteStrategyTest {
    public static void main(String[] args) {
        File rootFile = new File("D:\\TEMP\\TEST");// 建立要刪除的檔案夾對像
        System.out.println("獲得所有檔案的絕對路徑：");
        File[] list = rootFile.listFiles();
        for (File file : list) {
            System.out.println(file.getAbsolutePath());// 輸出檔案夾中的所有檔案的絕對路徑
        }
        
        FileDeleteStrategy strategy = FileDeleteStrategy.NORMAL;// 使用普通刪除策略
        System.out.println("以普通策略刪除非空檔案夾 D:\\TEMP\\TEST");
        try {
            strategy.delete(new File("D:\\TEMP\\TEST")); //實際執行刪除
            System.out.println("檔案夾刪除成功！");// 如果刪除成功則提示刪除成功
        } catch (IOException e) {
            System.out.println("檔案夾刪除失敗！");// 如果刪除失敗則提示刪除失敗
        }
        
        strategy = FileDeleteStrategy.FORCE;// 使用強制刪除策略(資料夾有檔案仍會刪除)
        System.out.println("以強制策略刪除非空檔案夾  D:\\TEMP\\TEST2");
        try {
            strategy.delete(new File("D:\\TEMP\\TEST2")); //實際執行刪除
            System.out.println("檔案夾刪除成功！");// 如果刪除成功則提示刪除成功
        } catch (IOException e) {
            System.out.println("檔案夾刪除失敗！");// 如果刪除失敗則提示刪除失敗
        }
    }
}
