package com.mingrisoft.io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileDeleteStrategy;

/**
 * �����k��-java�����}�o�d�Ҷ�
 *  http://www.deepstone.com.tw/xmdoc/cont?xsmsid=0J191295271158913049&sid=0J353063566013658199&sq=java%E5%AE%8C%E5%85%A8%E9%96%8B%E7%99%BC%E7%AF%84%E4%BE%8B%E9%9B%86
 */

public class FileDeleteStrategyTest {
    public static void main(String[] args) {
        File rootFile = new File("D:\\TEMP\\TEST");// �إ߭n�R�����ɮק��ﹳ
        System.out.println("��o�Ҧ��ɮת�������|�G");
        File[] list = rootFile.listFiles();
        for (File file : list) {
            System.out.println(file.getAbsolutePath());// ��X�ɮק������Ҧ��ɮת�������|
        }
        
        FileDeleteStrategy strategy = FileDeleteStrategy.NORMAL;// �ϥδ��q�R������
        System.out.println("�H���q�����R���D���ɮק� D:\\TEMP\\TEST");
        try {
            strategy.delete(new File("D:\\TEMP\\TEST")); //��ڰ���R��
            System.out.println("�ɮק��R�����\�I");// �p�G�R�����\�h���ܧR�����\
        } catch (IOException e) {
            System.out.println("�ɮק��R�����ѡI");// �p�G�R�����ѫh���ܧR������
        }
        
        strategy = FileDeleteStrategy.FORCE;// �ϥαj��R������(��Ƨ����ɮפ��|�R��)
        System.out.println("�H�j����R���D���ɮק�  D:\\TEMP\\TEST2");
        try {
            strategy.delete(new File("D:\\TEMP\\TEST2")); //��ڰ���R��
            System.out.println("�ɮק��R�����\�I");// �p�G�R�����\�h���ܧR�����\
        } catch (IOException e) {
            System.out.println("�ɮק��R�����ѡI");// �p�G�R�����ѫh���ܧR������
        }
    }
}
