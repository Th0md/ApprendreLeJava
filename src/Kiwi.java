
public class Kiwi extends Fruit implements PeelFruit{
	
	private boolean peeled = false;

	public Kiwi() {
		super("Kiwi");
	}

	@Override
	public void taste() {
		System.out.println("--> SUCREE");
	}

	@Override
	public int getSize() {
		return 2;
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
