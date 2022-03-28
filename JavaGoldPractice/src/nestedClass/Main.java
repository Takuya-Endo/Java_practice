package nestedClass;

import nestedClass.sampleConcealment.SampleFactory;
import nestedClass.sampleConcealment.SampleImplements;
import nestedClass.sampleConcealment.SampleInterface;

public class Main {

	public static void main(String[] args) {
		
		SampleImplements sampleImplementsA = new SampleImplements();
		sampleImplementsA.conceal();
		sampleImplementsA.publish();
		
//		SampleImplements sampleImplementsB = SampleFactory.create();
		SampleInterface sampleImplementsB = SampleFactory.create();
//		sampleImplementsB.conceal();
		sampleImplementsB.publish();
		
	}

}
