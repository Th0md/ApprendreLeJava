
public class Apple extends Fruit implements PeelFruit{
	
	private boolean peeled = false;

	public Apple() {
		super("Pomme");
	}

	@Override
	public void taste() {
		System.out.println("--> SUCREE");
		super.mian();
	}

	@Override
	public int getSize() {
		return 2;
	}

	@Override
	public boolean hasSeed() {
		return true;
	}

	@Override
	public boolean isPeeled() {
		return peeled;
	}

	@Override
	public String getSkinType() {
		return "doux";
	}

}
