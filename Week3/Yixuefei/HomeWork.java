package Week3.Yixuefei;

import java.io.File;
import java.io.IOException;

/**
* 1�����D�����Ƿ�����ļ�a.txt,����������򴴽����ļ���
	��D���´���һ����Ϊccc���ļ��У�Ҫ�����£�
	1.ccc�ļ�����Ҫ�����bbb���ļ���
	2.bbb���ļ���Ҫ�����aaa�ļ���
	��ȡD��aaa�ļ�����b.txt�ļ����ļ������ļ���С���ļ��ľ���·���͸�·������Ϣ��������Ϣ����ڿ���̨��
	��D����aaa�ļ���ɾ��,Ҫ���ļ���aaa��һ�����ļ��С�
 * @author lixuefei
 *
 */
public class HomeWork {
	//���D�����Ƿ�����ļ�a.txt,����������򴴽����ļ���
      public static void test1(){
    	  
    	  File f = new File("D:\\a.txt");
    	  if(!f.exists()){
    		   try {
				  f.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
    	  }
      }
      //�����ļ���+�ļ�
      public static void test2(){
    	  File f = new File("D:\\ccc\\bbb\\aaa");
    	  f.mkdirs();
    	  File f2 = new File(f,"a.txt");
    	  try {
			f2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	  System.out.println("·����"+f2.getAbsolutePath());
    	  System.out.println("��С��"+f2.length());
      }
}
