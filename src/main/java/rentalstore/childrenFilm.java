package rentalstore;

public class childrenFilm extends Movie{

  public childrenFilm(String title, int priceCode) {
    super(title, priceCode);
  }

  @Override
  public double getThisAmount(int day) {

    return 0;
  }
}
