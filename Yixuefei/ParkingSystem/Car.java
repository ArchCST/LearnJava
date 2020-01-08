package Yixuefei.ParkingSystem;
/**
 * ������Ϣ��ʵ����
 * @author lixuefei
 *
 */
public class Car {
        private String carCard;
        private long beginTime;
        private long endTime;
        private int price;
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return carCard+","+beginTime+","+endTime+","+price;    
		}
		//�볡���췽��
		public Car(String carCard, long beginTime) {
			this.carCard = carCard;
			this.beginTime = beginTime;
		}
		//��������
		public Car(String carCard) {
			this.carCard = carCard;
		}
		//��дeqluals�Ƚ϶���
		@Override
		public boolean equals(Object obj) {
		    if(obj==this){
		    	return true;
		    }
		    if(obj instanceof Car){
		    	Car c= (Car)obj;
		    	if(this.carCard.equals(c.carCard)){
		    		return true;
		    	}
		    }
		    
		return false;
		}
		/**
		 * @return the carCard
		 */
		public String getCarCard() {
			return carCard;
		}
		/**
		 * @param carCard the carCard to set
		 */
		public void setCarCard(String carCard) {
			this.carCard = carCard;
		}
		/**
		 * @return the beginTime
		 */
		public long getBeginTime() {
			return beginTime;
		}
		/**
		 * @param beginTime the beginTime to set
		 */
		public void setBeginTime(long beginTime) {
			this.beginTime = beginTime;
		}
		/**
		 * @return the endTime
		 */
		public long getEndTime() {
			return endTime;
		}
		/**
		 * @param endTime the endTime to set
		 */
		public void setEndTime(long endTime) {
			this.endTime = endTime;
		}
		/**
		 * @return the price
		 */
		public int getPrice() {
			return price;
		}
		/**
		 * @param price the price to set
		 */
		public void setPrice(int price) {
			this.price = price;
		}
		
        
}
