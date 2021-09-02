import java.util.function.DoubleBinaryOperator;

public class BiConsumerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleBinaryOperator bi=(o1,o2)->o1-o2;
		System.out.println(bi.applyAsDouble(22.0,13.0 ));
	}

}
