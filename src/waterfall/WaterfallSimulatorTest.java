package waterfall;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimulatorTest {

	//TODO �܂��̓V�~�����[�g���邽�߂̂��̂����낤�I
	//TODO �H���ŕ�����i�e�H���̐l���Ɛl�����p�����[�^���j
	//TODO �Ō�ɑ������킹��
	//TODO �݌v�A�����A�e�X�g��3�t�F�[�Y�����ꂼ����
	//TODO �E�H�[�^�[�t�H�[�����X�N�����̏��ŁA2017.10.12�ɐ݌v������
	//TODO�@�݌v�ɉ���n������(1�l�������艽�s�[�i�b�c�݌v�ł���{�l��)�����Ԃ��Ă���̂�(���ԁimonth�j)
	//TODO�@�����ɉ���n������(1�l�������艽�s�[�i�b�c�����ł���{�l��)�����Ԃ��Ă���̂�(���ԁimonth�j)
	//TODO�@�e�X�g�ɉ���n������(1�l�������艽�s�[�i�b�c�e�X�g�ł���{�l��)�����Ԃ��Ă���̂�(���ԁimonth�j)
	//TODO ���ׂđ������킹�� �� Happy end
	//TODO ���X�N����
	
	@Test
	public void testMain() {
		int result = 0;
		Simulator sm = new Simulator();
		result = sm.calc(50);
		assertTrue(result == 1);
	}
	
	@Test
	public void testMain2() {
		int result = 0;
		Simulator sm = new Simulator();
		result = sm.calc(25);
		assertTrue(result == 2);
	}

}
