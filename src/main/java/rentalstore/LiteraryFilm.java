package rentalstore;

public class LiteraryFilm extends Movie {


  public LiteraryFilm(String title, int priceCode) {
    super(title, priceCode);
  }

  @Override
  public double getThisAmount(int dayRental) {
    double amout = 0.0;
    double amount = dayRental * 6;
    return amount;
  }
}
