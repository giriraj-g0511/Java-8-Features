package staticMethodsInInterface;

interface TrainerInterface{
	void name();
	default void nativeState() {
		System.out.println("I'm from Karnataka State,");
	}
	static void workOffice() {
		System.out.println("I work as Trainer in QSpiders/JSpiders,");
	}
	void subjects();
}

class PavanSir implements TrainerInterface{

	@Override
	public void name() {
		System.out.println("Hii I'm Pavan,");
	}

	@Override
	public void subjects() {
		System.out.println("I tech Java 8,Multithreding and Java File Handling.");
	}
	
}

class ShrikantSir implements TrainerInterface{

	@Override
	public void name() {
		System.out.println("Hii I'm Shrikant,");
	}
	
	@Override
	public void nativeState() {
		System.out.println("I'm from Maharashtra,");
	}
	
	@Override
	public void subjects() {
		System.out.println("I tech Java,Multithreding and Java related concepts.");
	}
}


class PrasadSir implements TrainerInterface{

	@Override
	public void name() {
		System.out.println("Hii I'm Prasad,");
	}
	
	@Override
	public void nativeState() {
		System.out.println("I'm from Maharashtra,");
	}
	
	@Override
	public void subjects() {
		System.out.println("I tech HTML, CSS, JavaSript and ReactJS.");
	}
}


class TejusSir implements TrainerInterface{

	@Override
	public void name() {
		System.out.println("Hii I'm Tejus,");
	}
	
	@Override
	public void subjects() {
		System.out.println("I tech Java only.");
	}
}

class VikasSir implements TrainerInterface{

	@Override
	public void name() {
		System.out.println("Hii I'm Vikas,");
	}
	
	@Override
	public void subjects() {
		System.out.println("I tech SQL only.");
	}
}


public class Trainer {
	public static void main(String[] args) {
		TejusSir ts= new TejusSir();
		ts.name();
		ts.nativeState();
		TrainerInterface.workOffice();
		ts.subjects();
		
		System.out.println("===================================\n");
		
		ShrikantSir ss= new ShrikantSir();
		ss.name();
		ss.nativeState();
		TrainerInterface.workOffice();
		ss.subjects();
		
		System.out.println("===================================\n");
		
		VikasSir vs= new VikasSir();
		vs.name();
		vs.nativeState();
		TrainerInterface.workOffice();
		vs.subjects();
		
		System.out.println("===================================\n");
		
		PrasadSir ps= new PrasadSir();
		ps.name();
		ps.nativeState();
		TrainerInterface.workOffice();
		ps.subjects();
		
		System.out.println("===================================\n");
		
		PavanSir pvs= new PavanSir();
		pvs.name();
		pvs.nativeState();
		TrainerInterface.workOffice();
		pvs.subjects();
		
		System.out.println("===================================\n");
	}
}
