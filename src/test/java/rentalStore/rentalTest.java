package rentalStore;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import rentalstore.Customer;
import rentalstore.Movie;
import rentalstore.RegularFilm;
import rentalstore.Rental;

public class rentalTest {

  private rentalstore.Customer customer = new Customer("Dallin");

  @Test
  public void should_return_Rental_Record_when_Customer_name_is_Emilio(){
    String statement =  customer.statement();
    assertEquals("Rental Record for Dallin\nAmount owed is 0.0\nYou earned 0 frequent renter points", statement);
  }

  @Test
  public void should_return_Amount_is_6point5_when_Movie_Role_is_REGULAR_and_time_is_5(){
    Movie movie = new RegularFilm("MovieA",Movie.REGULAR);
    Rental rental = new Rental(movie,5);
    customer.addRental(rental);
    String statement =  customer.statement();
    assertEquals("Rental Record for Dallin\n\tMovieA\t6.5\nAmount owed is 6.5\nYou earned 1 frequent renter points", statement);
  }

  @Test
  public void should_return_Amount_is_6point5_when_Movie_Role_is_REGULAR_and_time_is_2(){
    Movie movie = new RegularFilm("MovieA",Movie.REGULAR);
    Rental rental = new Rental(movie,2);
    customer.addRental(rental);
    String statement =  customer.statement();
    assertEquals("Rental Record for Dallin\n\tMovieA\t2.0\nAmount owed is 2.0\nYou earned 1 frequent renter points", statement);
  }

  @Test
  public void should_return_Amount_is_6point5_when_Movie_Role_is_REGULAR_and_time_is_1(){
    Movie movie = new RegularFilm("MovieA",Movie.REGULAR);
    Rental rental = new Rental(movie,2);
    customer.addRental(rental);
    String statement =  customer.statement();
    assertEquals("Rental Record for Dallin\n\tMovieA\t2.0\nAmount owed is 2.0\nYou earned 1 frequent renter points", statement);
  }



//  @Test
//  public void should_return_Statement1_when_has_two_Rental_and_time_is_two(){
//    Movie movie = new ("MovieA",Movie.CHILDRENS);
//    Rental rentalFirst = new Rental(movie,2);
//    Rental rentalSecond = new Rental(movie,2);
//    customer.addRental(rentalFirst);
//    customer.addRental(rentalSecond);
//    String statement =  customer.statement();
//    Assert.assertEquals("Rental Record for Ethan\n\tMovieA\t4.5\n\tMovieA\t4.5\nAmount owed is 9.0\nYou earned 2 frequent renter points", statement);
//  }
//
//
//  @Test
//  public void should_return_Statement2_when_has_two_Rental_and_time_is_three(){
//    Movie movie = new Movie("MovieA",Movie.CHILDRENS);
//    Rental rentalFirst = new Rental(movie,3);
//    Rental rentalSecond = new Rental(movie,3);
//    customer.addRental(rentalFirst);
//    customer.addRental(rentalSecond);
//    String statement =  customer.statement();
//    Assert.assertEquals("Rental Record for Ethan\n\tMovieA\t4.5\n\tMovieA\t4.5\nAmount owed is 9.0\nYou earned 2 frequent renter points", statement);
//  }


}
