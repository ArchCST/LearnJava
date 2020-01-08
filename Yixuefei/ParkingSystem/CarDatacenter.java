package Yixuefei.ParkingSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Date;

/**
 * ���ݹ�������
 * @author lixuefei
 *
 */
public class CarDatacenter {
         public static Car[] cs=new Car[10];//ֻ��10��ͣ��λ��
         
         //�ڵ�������ʱ����ʼ������
         static{
        	 //��ʼ�����Ʋ���
        	 init();
         }
         /**
          * ��ʼ������
          */
         public static void init(){
        	 File f = new File("car.txt");
        	 //�����ַ���  BufferedReader
        	 Reader r=null;
        	 BufferedReader br=null;
        	 try {
				 r=new FileReader(f);
				 br=new BufferedReader(r);
				 //ѭ����ȡ
				 //һ��һ�ж�ȡ���Ҵ�������
				 String str=null;
				 while((str=br.readLine())!=null){
				     String[] sp = str.split(",");
				     Car c = new Car(sp[0], Long.valueOf(sp[1]));
				     //����Ϣ���и�ֵ
				     for(int i=0;i<10;i++){
				    	 if(cs[i]==null){
				    		 cs[i]=c;
				    		 break;
				    	 }
				     }
				 }
			} catch ( IOException e) {
				
				e.printStackTrace();
			}finally {
				if(br!=null){
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(r!=null){
					try {
						r.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
         }
         /**
          * �Ƚϳ��ƺ��Ƿ���������У�������ڣ���Ⱦ�ش��ڵĶ�����������ڷ���Null
          * �βΣ���֮�Ƚϵĳ��ƺ�
          */
         public static Car judgeCarUtil(String str){
        	 //����һ���Ƚ϶���
        	 Car cnow = new Car(str);
        	 //ƥ���ڴ�
        	 for(Car c:cs){
        		 if(c!=null){
        			 //����Ƚϳɹ���˵�����ƺŴ���
        			 if(c.equals(cnow)){
        				 return c;
        			 }
        		 }
        	 } 
			return null;

         }
         /**
          * ���복�Ƶ��ڴ�Ͱѳ��ƺ��볡ʱ��¼�뵽�ļ�
          * �βΣ����ƺ�
         * @throws IOException 
          */
		public static void save(String ncar) {
        	 //�洢һ�����ƶ�����Ϣ  ������һ���³�
        	 Car car = new Car(ncar, new Date().getTime());
        	 
        	 //���浽�ڴ���
        	 for(int i=0;i<cs.length;i++){
        		 if(cs[i]==null){
        			 cs[i]=car;
        			 break;
        		 }
        	 }
        	 //���浽�ļ���---�����浽car.txt
        	 //�����  ---��׷�Ӳ���
        	 File f = new File("car.txt");
        	 //�����ַ���
        		FileWriter fw=null;
        		BufferedWriter bw=null;
        	 try {
				 fw = new FileWriter(f,true);
				 bw=new BufferedWriter(fw);
				 //¼��
				 bw.write(car.toString());
				 bw.newLine();
				 bw.flush();
			} catch (IOException e) {
				
				e.printStackTrace();
			}finally {
				if(bw!=null){
					try {
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(fw!=null){
					try {
						fw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
        	 
         }
         
         
}
