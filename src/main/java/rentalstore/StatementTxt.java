package rentalstore;

public class StatementTxt extends Statement {

  public String getFooter(Customer customer, String result) {
    result += "Amount owed is " + customer.getTotalAmount() + "\n";
    result += "You earned " + customer.getTotalFrequentRenterPoints() + " frequent renter points";
    return result;
  }

  public  String getBody(Rental each,String result) {
    result += "\t" + each.getMovie().getTitle() + "\t" + each.getThisAmount() + "\n";
    return result;
  }

  public  String getHeader(Customer customer) {
    return "Rental Record for " + customer.getName() + "\n";
  }
}
