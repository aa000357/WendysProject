public class java02_19 {//��H���O�m���D
	public static void main(String[] args) {
		iA ado = new iA();
		iB bdo = new iB();
		iC cdo = new iC();

		System.out.println("�ڬOA");
		ado.eat();
		ado.drink();
		ado.play();
		
		System.out.println("�ڬOB");
		bdo.eat();
		bdo.drink();
		bdo.play();
		
		System.out.println("�ڬOC");
		cdo.eat();
		cdo.drink();
		cdo.play();
		

	}
}

abstract class weCanDoIt {// �����O-->������H���O

	public void eat()//�j�a�Y����k���@��
	{
		System.out.print("�Y�ѥ]�B");
	}

	public void drink()//�j�a�ܪ���k���@��
	{
		System.out.print("�ܶ}���B");

	}

	abstract void play();// ������k���@�ˡA�G�ϥΩ�H��k��ܡA�ѭӤH�ۤv�w�q

}

class iA extends weCanDoIt {//�~�ө�H���O
	void play(){//���O��@
	System.out.println("���ֲy");
}

}

class iB extends weCanDoIt {//�~�ө�H���O
	void play(){//���O��@
		System.out.println("�Ȥp��");
	}
}

class iC extends weCanDoIt {//�~�ө�H���O
	void play(){//���O��@
		System.out.println("�ȷƱ�");
	}
}
