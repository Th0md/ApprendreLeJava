
public class Strawberry extends Fruit implements PeelFruit{
	
	private boolean peeled = false;

	public Strawberry() {
		super("Fraise");
	}

	@Override
	public void taste() {
		System.out.println("--> SUCREE");
		super.mian();
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return false;
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
