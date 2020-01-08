package Yixuefei.ParkingSystem;

import java.util.Scanner;

/**
 * �߼��㴦��
 * @author lixuefei
 *
 */
public class CarService {
        /**
         * �볡
         */
	  public void inAcar(){
		//�û����복�ƺ�
		  Scanner sc=new Scanner(System.in);
		  System.out.println("�����복�ƺ�");
		  String ncard = sc.next();
		  //���򣨲��䣩
		  //�ȶԳ��ƺ�   �������������غŵ��жϷ���
		  Car c = CarDatacenter.judgeCarUtil(ncard);
		  //��û���س�ʱ
		  if(c==null){
			  //�ѵ�ǰ��������Ϣ��¼�뵽�ڴ棬��¼�뵽�ļ���  
			  CarDatacenter.save(ncard);
		  }else{
			  System.out.println("�����س����������Ա��ϵ");
		  }
	}
}
