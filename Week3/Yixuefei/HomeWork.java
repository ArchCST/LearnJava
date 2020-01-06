package Week3.Yixuefei;

import java.io.File;
import java.io.IOException;

/**
* 1：检查D盘下是否存在文件a.txt,如果不存在则创建该文件。
	在D盘下创建一个名为ccc的文件夹，要求如下：
	1.ccc文件夹中要求包含bbb子文件夹
	2.bbb子文件夹要求包含aaa文件夹
	获取D盘aaa文件夹中b.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台。
	将D盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。
 * @author lixuefei
 *
 */
public class HomeWork {
	//检查D盘下是否存在文件a.txt,如果不存在则创建该文件。
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
      //创建文件夹+文件
      public static void test2(){
    	  File f = new File("D:\\ccc\\bbb\\aaa");
    	  f.mkdirs();
    	  File f2 = new File(f,"a.txt");
    	  try {
			f2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	  System.out.println("路径："+f2.getAbsolutePath());
    	  System.out.println("大小："+f2.length());
      }
}
