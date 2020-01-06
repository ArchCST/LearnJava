package Week3.Yixuefei;

import java.io.File;
import java.util.Date;

/**
 * �ļ��Ĺ�����
 * 1����������ļ�  �������
 * �������ļ����������Ժ��׺��������ʱ��������
 * 2������ɾ����ɾ������ֵ true  false
 * ����ɾ���ض��ļ���ɾ��ָ���ļ��У�ֻɾ���ļ����µ�ָ����׺�ļ�
 * ���෽��ȫ�Ǿ�̬������ 
 * @author lixuefei
 *
 */
public class FileUtil {
		public static void main(String[] args) {
			String[] s={".jpg",".png",".bmp","gif"};
			searchFile(new File("C:\\Users\\lixuefei\\Desktop\\�ɻ�"),s,"  ");
		}
		/**
		 * 1:������һ���ļ��У�����һ���ļ��е�·����
		 * 2�������ļ��Ĺؼ��֣����ļ����������Ժ��׺��������ʱ��������
		 * 3���������ļ�����
		 *                        
		 * �˷���Ϊ��׺����   ����������
		 */
      public static void searchFile(File f,String[] strs,String flag){
    	  //�жϴ���ĳ����ļ�·����File f���Ƿ����ļ���
    	  if(f.isFile()){
    		  //�Ƚ���Ӧ�ĺ�׺
    		  for(String str:strs){
    			  if(f.getName().endsWith(str)){
    				  System.out.println("����һ���ļ�,�ļ����ǣ�"+f.getName());
    			  }
    		  }
    	  }else{
    		  //��ʱ�ļ����ǣ�����APi���ɵ�ǰĿ¼�µ������ļ���file��directoey��
    		  File[] lists = f.listFiles();
    		  //�ж����ɵ�lists�Ƿ��ǿ��ļ���
    		  if(lists==null){
    			  return;
    		  }
    		  //�����ļ���
    		  for(File f1:lists){
    			  if(f1.isDirectory()){
    				  System.out.println(flag+f1.getName());
    				  //�ݹ���ô˷���
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
       * ���ļ�����׼����
       * @param str
       * @param f
       */
      public static void searchFile(String[] str,File f){
    	  
      }
      /**
       * ���޸�ʱ������
       * @param f
       * @param str
       */
      public static void searchFile(File f,Date d){
    	  
      }
}
