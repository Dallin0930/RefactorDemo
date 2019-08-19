package gildedRose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class gildedRoseTest {
  @Test
  public void should_return_9_and_14_when_sellin_is_10_and_quality_is_15_name_is_dallin(){
    Item item = new Item("Dallin",10,15);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(9,items[0].sellIn);
    assertEquals(14,items[0].quality);
  }

  @Test
  public void should_return_fu1_and_13_when_sellin_is_0_and_quality_is_15_name_is_dallin(){
    Item item = new Item("Dallin",0,15);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(-1,items[0].sellIn);
    assertEquals(13,items[0].quality);
  }

  @Test
  public void should_return__and_13_when_sellin_is_no_more_than0_and_quality_is_15_name_is_dallin(){
    Item item = new Item("Dallin",-1,15);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(-2,items[0].sellIn);
    assertEquals(13,items[0].quality);
  }

  @Test
  public void should_return_4_and_31_when_sellin_is_3_and_quality_is_30_name_is_Backstage_passes_to_a_TAFKAL80ETC_concert(){
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert",3,30);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(2,items[0].sellIn);
    assertEquals(31,items[0].quality);
  }



}
