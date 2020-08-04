
public class Main {

	public static void main(String[] args) {
		Singer singer = new Singer ();
		PopSinger popSinger = new PopSinger ();
		SalsaSinger salsaSinger = new SalsaSinger ();
		CumbiaSinger cumbiaSinger = new CumbiaSinger ();
		
		singer.sing();
		popSinger.sing();
		salsaSinger.sing();
		cumbiaSinger.sing();
	}
}
