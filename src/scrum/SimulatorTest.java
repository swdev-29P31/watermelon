package scrum;

import static org.junit.Assert.*;

import org.junit.Test;

import scrum.Simulator;

public class SimulatorTest {

	//TODO �s�[�i�b�c�͌Œ�
	//TODO �s�[�i�b�c�ɑ΂����X�v�����g�K�v�����Z�o
	//TODO �x���V�e�B���w�肵���牽�X�v�����g�K�v�����Z�o
	//TODO �E�H�[�^�[�t�H�[�����悾��
	//TODO �E�H�[�^�[�t�H�[���ł�����ˁH
	//TODO ����n������(�x���V�e�B)�����Ԃ��Ă���̂�(�s�[�i�b�c���ׂĂ�����������̂ɉ��X�v�����g�K�v��)
	//TODO ����n������(���X�v�����g�K�v���ƁA1�X�v�����g�̊���)�����Ԃ��Ă���̂�(����(month)) �� Happy end
	
	@Test
	public void test() {
		double result = 0;
		Simulator sm = new Simulator();
		int velocity = 50;
		result = sm.calc(velocity);
		assertTrue(result == velocity/sm.getStoryPoint());
	}

	@Test
	public void test2() {
		double result = 0;
		Simulator sm = new Simulator();
		int velocity = 25;
		result = sm.calc(velocity);
		assertTrue(result == velocity/sm.getStoryPoint());
	}
	
}
