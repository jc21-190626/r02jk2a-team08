
public class Kadai01 {

	/**
	 * �ۑ�01
	 * ������̍��E�̕����𔽓]���ĕԂ����\�b�h
	 * @param s�@�Ώۂ̕���
	 * @return ���E�𔽓]��������
	 */
	String ReverseString(String s) {
		char[] array = s.toCharArray();
		char work;
		int i,j;
		for (i = 0,j = array.length -1; i<j;i++, j--) {
			work =array[i];
			array[i] = array[j];
			array[j] = work;
		}
		return new String(array);
	}
}
