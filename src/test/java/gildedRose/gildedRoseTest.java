package gildedRose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class gildedRoseTest {
  @Test
  public void should_return_10_and_25_when_sellin_is_10_and_quality_is_15_name_is_dallin(){
    Item item = new Item("Dallin",10,15);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(9,items[0].sellIn);
    assertEquals(14,items[0].quality);
  }



}
