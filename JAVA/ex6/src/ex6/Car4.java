package ex6;

public class Car4 { // �̱��� Ŭ���� : ��, �ϳ��� ��ü�����鵵�� ����ϴ� Ŭ����
	//�����ʵ�
	private static Car4 singletone = new Car4();	// ���ο��� �ν��Ͻ��� ����
	//������
	private Car4() { }
	//���� �޼���
	static Car4 getInstance() {// �ν��Ͻ� ������ getInstance()�޼��� ��� 
		return singletone; 
	} 
	
}
