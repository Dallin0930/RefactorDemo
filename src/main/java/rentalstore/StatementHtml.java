package rentalstore;

public class StatementHtml extends Statement {

  @Override
  public String getHeader(Customer customer) {
    return "Rental Record for"+ customer.getName()+ "<br>";
  }

  @Override
  public String getBody(Rental each, String result) {
      result+= "&nbsp;&nbsp;"+each.getMovie().getTitle()+each.getThisAmount()+"<br>";
      return result;
  }

  @Override
  public String getFooter(Customer customer, String result) {
      result+="Amout Ower is"+customer.getTotalAmount()+"<br>";
      result += "You earned "+ customer.getTotalFrequentRenterPoints()+ " frequent renter points";
      return result;
  }

}




