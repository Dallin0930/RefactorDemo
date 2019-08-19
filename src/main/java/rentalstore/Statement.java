package rentalstore;

public abstract class Statement {
  public String statement(Customer customer) {
    String result = getHeader(customer);
    for (Rental each : customer.getRentals()) {
      result = getBody(each,result);
    }
    result = getFooter(customer, result);
    return result;
  }

  public abstract String getHeader(Customer customer);
  public abstract String getBody(Rental each, String result);
  public abstract String getFooter(Customer customer, String result);
}
