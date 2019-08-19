package gildedRose;

public class Item {
    public String name;

    public int sellIn;

    public int quality;

    public UpdateQuality updateQuality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;

      if (this.name.equals("Aged Brie")) {
        this.updateQuality=new AgedBrieQuality();
      }
      else if (this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        this.updateQuality=new BackstageQuality();
      }
      else if (this.name.equals("Sulfuras, Hand of Ragnaros")) {
        this.updateQuality=new SulfurasQuality();
      }else {
        this.updateQuality=new OtherStyleQuality();
      }
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public int getSellIn() {
      return sellIn;
    }
}


