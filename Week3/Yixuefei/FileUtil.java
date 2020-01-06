package Week3.Yixuefei;

import java.io.File;
import java.util.Date;

/**
 * 文件的工具类
 * 1：搜索相关文件  批量输出
 * 需求（以文件名搜索，以后后缀搜索，以时间搜索）
 * 2：批量删除：删除返回值 true  false
 * 需求：删除特定文件，删除指定文件夹，只删除文件夹下的指定后缀文件
 * 此类方法全是静态方法， 
 * @author lixuefei
 *
 */
public class FileUtil {
		public static void main(String[] args) {
			String[] s={".jpg",".png",".bmp","gif"};
			searchFile(new File("C:\\Users\\lixuefei\\Desktop\\飞机"),s,"  ");
		}
		/**
		 * 1:搜索哪一个文件夹（传入一个文件夹的路径）
		 * 2：搜索文件的关键字（以文件名搜索，以后后缀搜索，以时间搜索）
		 * 3：输出相关文件名称
		 *                        
		 * 此方法为后缀搜索   以树形排列
		 */
      public static void searchFile(File f,String[] strs,String flag){
    	  //判断传入的抽象文件路径（File f）是否是文件夹
    	  if(f.isFile()){
    		  //比较相应的后缀
    		  for(String str:strs){
    			  if(f.getName().endsWith(str)){
    				  System.out.println("这是一个文件,文件名是："+f.getName());
    			  }
    		  }
    	  }else{
    		  //当时文件夹是，调用APi生成当前目录下的所有文件（file与directoey）
    		  File[] lists = f.listFiles();
    		  //判断生成的lists是否是空文件夹
    		  if(lists==null){
    			  return;
    		  }
    		  //遍历文件夹
    		  for(File f1:lists){
    			  if(f1.isDirectory()){
    				  System.out.println(flag+f1.getName());
    				  //递归调用此方法
    				  searchFile(f1,strs,flag+"  ");
    				  
    			  }else{
    			
    				  for(String str:strs){
    	    			  if(f1.getName().endsWith(str)){
    	    				  System.out.println(flag+f1.getName());
    	    			  }
    	    		  }
    			  }
    		  }
    	  }
    	  
      }
      /**
       * 以文件名精准搜索
       * @param str
       * @param f
       */
      public static void searchFile(String[] str,File f){
    	  
      }
      /**
       * 以修改时间搜索
       * @param f
       * @param str
       */
      public static void searchFile(File f,Date d){
    	  
      }
}
