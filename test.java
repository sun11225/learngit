
/**
 * ����Ƕ��ѭ��
 * @author ���
 *
 */
public class TestWhileQiantao {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){
			for(int  j=1;j<=5;j++){
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		
		System.out.println("###########################");
		
		//��ӡ99�˷���1*+=2  2*2=4
		for(int n=1;n<=9;n++){
			for(int m=1;m<=n;m++){
				System.out.print(m+"*"+n+"="+(m*n)+"\t");
			}
			System.out.println();
		}
		
		System.out.println("#################################");
		//��whileѭ���ֱ����100���ڵ�������ż���ĺͣ������
		int  sum01 = 0;
		int  sum02 = 0;
		for(int  i=1;i<=100;i++){
			if(i%2==0){	//ż��
				sum01 += i;		//sum01 = sum01 +i;
			}else{  //����
				sum02  += i;
			}
		}
		System.out.println("�����ͣ�"+sum01);
		System.out.println("ż���ͣ�"+sum02);
		
		
		//��whileѭ��������ѭ�����1-1000֮���ܱ�5������������ÿ�����5��
		int  h =0;
		for(int i=1;i<=1000;i++){
			if(i%5==0){
				System.out.print(i+"\t");
				h++;
			}
			if(h==5){
				System.out.println();
				h=0;
			}
			/*
			if(i%25==0){
				System.out.println();
			}*/
		}
		
	}
}
