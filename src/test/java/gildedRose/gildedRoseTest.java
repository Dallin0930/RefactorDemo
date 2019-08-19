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
  public void should_return_fu2_and_13_when_sellin_is_no_more_than0_and_quality_is_15_name_is_dallin(){
    Item item = new Item("Dallin",-1,15);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(-2,items[0].sellIn);
    assertEquals(13,items[0].quality);
  }

  @Test
  public void should_return_3_and_31_when_sellin_is_3_and_quality_is_30_name_is_Backstage_passes_to_a_TAFKAL80ETC_concert(){
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert",3,30);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(2,items[0].sellIn);
    assertEquals(33,items[0].quality);
  }

  @Test
  public void should_return_5_and_50_when_sellin_is_6_and_quality_is_50_name_is_Backstage_passes_to_a_TAFKAL80ETC_concert(){
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert",6,50);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(5,items[0].sellIn);
    assertEquals(50,items[0].quality);
  }

  @Test
  public void should_return_7_and_51_when_sellin_is_7_and_quality_is_51_name_is_Backstage_passes_to_a_TAFKAL80ETC_concert(){
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert",7,51);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(6,items[0].sellIn);
    assertEquals(50,items[0].quality);
  }

  @Test
  public void should_return_7_and_51_when_sellin_is_5_and_quality_is_51_name_is_Backstage_passes_to_a_TAFKAL80ETC_concert(){
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert",5,51);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(4,items[0].sellIn);
    assertEquals(50,items[0].quality);
  }

  @Test
  public void should_return_7_and_51_when_sellin_is_7_and_quality_is_49_name_is_Backstage_passes_to_a_TAFKAL80ETC_concert(){
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert",7,49);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(6,items[0].sellIn);
    assertEquals(50,items[0].quality);
  }

  @Test
  public void should_return_0_and_50_when_sellin_is_0_and_quality_is_50_name_is_Aged_Brie(){
    Item item = new Item("Aged Brie",0,50);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(-1,items[0].sellIn);
    assertEquals(50,items[0].quality);
  }

  @Test
  public void should_return_negative1_and_50_when_sellin_is_negative1_and_quality_is_49_name_is_Aged_Brie(){
    Item item = new Item("Aged Brie",-1,49);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(-2,items[0].sellIn);
    assertEquals(50,items[0].quality);
  }

  @Test
  public void should_return_negative1_and_50_when_sellin_is_negative1_and_quality_is_51_name_is_Aged_Brie(){
    Item item = new Item("Aged Brie",1,51);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(0,items[0].sellIn);
    assertEquals(50,items[0].quality);
  }

  @Test
  public void should_return_negative1_and_50_when_sellin_is_1_and_quality_is_49_name_is_Aged_Brie(){
    Item item = new Item("Aged Brie",1,49);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(0,items[0].sellIn);
    assertEquals(50,items[0].quality);
  }

  @Test
  public void should_return_negative1_and_6_when_sellin_is_nevagative1_and_quality_is_6_name_is_Sulfuras_Hand_of_Ragnaros(){
    Item item = new Item("Sulfuras, Hand of Ragnaros",-1,6);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(-1,items[0].sellIn);
    assertEquals(6,items[0].quality);
  }

  @Test
  public void should_return_negative1_and_6_when_sellin_is_nevagative1_and_quality_is_nevigative6_name_is_Sulfuras_Hand_of_Ragnaros(){
    Item item = new Item("Sulfuras, Hand of Ragnaros",-1,-6);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(-1,items[0].sellIn);
    assertEquals(-6,items[0].quality);
  }

  @Test
  public void should_return_0_and_0_when_sellin_is_0_and_quality_is_0_name_is_Sulfuras_Hand_of_Ragnaros(){
    Item item = new Item("Sulfuras, Hand of Ragnaros",0,0);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(0,items[0].sellIn);
    assertEquals(0,items[0].quality);
  }

  @Test
  public void should_return_negative1_and_6_when_sellin_is_navigative5_and_quality_is_50_name_is_Sulfuras_Hand_of_Ragnaros(){
    Item item = new Item("Sulfuras, Hand of Ragnaros",-5,50);
    Item[] items = new Item[]{item};
    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals(-5,items[0].sellIn);
    assertEquals(50,items[0].quality);
  }
}
